package today.rocky.cloud.seata.repository.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import today.rocky.cloud.seata.repository.service.RepositoryService;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/3/8 23:05
 */
@RestController
@RequestMapping("/repository")
public class RepositoryController {
    @Autowired
    private RepositoryService repositoryService;
    @RequestMapping("/decrease")
    public String decrease(Long productId,Integer count){
        repositoryService.decrease(productId,count);
        return "-------------扣减库存view成功------------";
    }

}
