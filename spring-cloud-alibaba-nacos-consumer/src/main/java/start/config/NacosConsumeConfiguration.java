package start.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: ShallowDream7
 * @Date: 2019/3/10 16:54
 * @Description:
 */
@Configuration
public class NacosConsumeConfiguration {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
