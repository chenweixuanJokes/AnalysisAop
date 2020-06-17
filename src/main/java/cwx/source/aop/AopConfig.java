package cwx.source.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenweixuan
 * @date 2020/6/17
 */
@Configuration
public class AopConfig {

    @Bean
    public AopInterface aopInterface() {
        return new AopInterfaceImpl();
    }

}
