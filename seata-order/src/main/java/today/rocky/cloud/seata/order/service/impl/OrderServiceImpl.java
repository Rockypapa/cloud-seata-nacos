package today.rocky.cloud.seata.order.service.impl;

import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import today.rocky.cloud.bean.Order;
import today.rocky.cloud.seata.order.feign.AccountFeign;
import today.rocky.cloud.seata.order.feign.RepositoryFeign;
import today.rocky.cloud.seata.order.mapper.OrderMapper;
import today.rocky.cloud.seata.order.service.OrderService;

import javax.annotation.Resource;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/3/8 19:47
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;
    @Autowired
    private RepositoryFeign repositoryFeign;
    @Autowired
    private AccountFeign accountFeign;


    @Override
    @GlobalTransactional(name = "tx-create-order", rollbackFor = Exception.class)
    public void create(Order order) {
        log.info("----------->开始新建订单<------------");
        orderMapper.create(order);
        log.info("----------->调用库存微服务，做扣减<------------");
        repositoryFeign.decrease(order.getProductId(),order.getCount());
        log.info("----------->扣减结束<------------");
        log.info("----------->做账户扣减<------------");
        accountFeign.decrease(order.getUserId(),order.getMoney());
        log.info("----------->账户扣减完成<------------");
        log.info("----------->开始修改订单状态<------------");
        orderMapper.update(order.getUserId(),0);
        log.info("----------->修改订单状态完成<------------");

        log.info("----------->下单结束<------------");
    }

}
