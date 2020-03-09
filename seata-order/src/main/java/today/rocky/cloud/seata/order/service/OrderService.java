package today.rocky.cloud.seata.order.service;

import today.rocky.cloud.bean.Order;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/3/8 19:47
 */
public interface OrderService {
    void create(Order order);
}
