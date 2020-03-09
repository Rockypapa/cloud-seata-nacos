package today.rocky.cloud.seata.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/3/8 20:24
 */
@FeignClient(value = "seata-repository-service")
public interface RepositoryFeign {
    @PostMapping(value = "/repository/decrease")
    String decrease(@RequestParam("productId")Long productId,@RequestParam("count")Integer count);

}
