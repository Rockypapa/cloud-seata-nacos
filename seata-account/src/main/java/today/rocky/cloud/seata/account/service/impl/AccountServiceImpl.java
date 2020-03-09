package today.rocky.cloud.seata.account.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import today.rocky.cloud.seata.account.mapper.AccountMapper;
import today.rocky.cloud.seata.account.service.AccountService;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/3/8 19:43
 */
@Service
@Slf4j
public class AccountServiceImpl  implements AccountService {
    @Resource
    private AccountMapper accountMapper;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("*******->account-service中扣减账户余额开始");
        // 模拟超时异常,全局事务回滚
        /*try {
            // 暂停20秒钟
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        accountMapper.decrease(userId, money);
        log.info("*******->account-service中扣减账户余额结束");
    }
}
