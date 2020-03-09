package today.rocky.cloud.seata.account.service;

import java.math.BigDecimal;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/3/8 19:43
 */
public interface AccountService {
    void decrease(Long userId, BigDecimal money) ;
}
