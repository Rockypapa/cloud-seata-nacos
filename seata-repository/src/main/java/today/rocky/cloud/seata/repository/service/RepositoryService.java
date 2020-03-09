package today.rocky.cloud.seata.repository.service;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/3/8 23:01
 */
public interface RepositoryService {
    void decrease(Long productId,Integer count);
}
