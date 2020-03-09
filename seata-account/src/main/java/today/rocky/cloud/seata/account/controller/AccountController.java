package today.rocky.cloud.seata.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import today.rocky.cloud.seata.account.service.AccountService;

import java.math.BigDecimal;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/3/8 19:44
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping(value = "/decrease")
    String decrease(@RequestParam("userId")Long userId, @RequestParam("money") BigDecimal money){
        accountService.decrease(userId, money);
        return "---------------扣减账户view成功-------------";
    }


}
