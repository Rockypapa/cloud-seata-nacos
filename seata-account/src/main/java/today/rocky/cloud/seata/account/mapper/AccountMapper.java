package today.rocky.cloud.seata.account.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author Rocky
 * @version 1.0
 * @date 2020/3/8 19:43
 */
@Mapper
public interface AccountMapper {
    int decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
