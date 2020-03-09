package today.rocky.cloud.seata.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import today.rocky.cloud.bean.Order;
import today.rocky.cloud.seata.order.service.OrderService;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/3/8 19:48
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/create")
    public String create(Order order){
        orderService.create(order);
        return "200----订单创建成功";
    }


}
