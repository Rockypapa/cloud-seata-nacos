package today.rocky.cloud.seata.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/3/8 20:24
 */
@FeignClient(value = "seata-account-service")
public interface AccountFeign {
    @PostMapping(value = "/account/decrease")
    String  decrease(@RequestParam("userId")Long userId, @RequestParam("money") BigDecimal money);


}
