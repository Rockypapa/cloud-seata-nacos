package today.rocky.cloud.seata.repository.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/3/8 22:54
 */
@Mapper
public interface RepositoryMapper {
    void decrease(@Param("productId")Long productId,@Param("count")Integer count);
}
