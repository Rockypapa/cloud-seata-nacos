package today.rocky.cloud.seata.repository;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Rocky
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "today.rocky.cloud.seata.repository.mapper")
public class SeataRepositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataRepositoryApplication.class, args);
    }

}
