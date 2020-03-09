package today.rocky.cloud.seata.order;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author Rocky
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "today.rocky.cloud.seata.order.feign")
@EnableDiscoveryClient
@MapperScan(basePackages = "today.rocky.cloud.seata.order.mapper")
public class SeataOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataOrderApplication.class, args);
    }

}
