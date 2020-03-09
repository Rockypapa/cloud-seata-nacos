package today.rocky.cloud.seata.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import today.rocky.cloud.bean.Order;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/3/8 19:47
 */
@Mapper
public interface OrderMapper {
    /**
     * 创建订单
     * @param order 订单属性
     */
    void create(Order order);


    /**
     * 修改订单状态0-1
     * @param status 状态
     * @param userId 用户id
     */
    void update(@Param("userId")Long userId,@Param("status")Integer status);

}
