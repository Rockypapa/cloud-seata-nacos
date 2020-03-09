package today.rocky.cloud.seata.repository.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import today.rocky.cloud.seata.repository.mapper.RepositoryMapper;
import today.rocky.cloud.seata.repository.service.RepositoryService;

import javax.annotation.Resource;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/3/8 23:02
 */
@Service
@Slf4j
public class RepositoryServiceImpl implements RepositoryService {

    @Resource
    private RepositoryMapper repositoryMapper;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("--------------->开始减库存<--------------");
        repositoryMapper.decrease(productId, count);
        log.info("--------------->库存扣减结束<--------------");

    }
}
