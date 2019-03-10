package start.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import start.fallback.EchoServiceFallback;

/**
 * @Auther: ShallowDream7
 * @Date: 2019/3/10 17:37
 * @Description:
 */
@FeignClient(value = "nacos-provider",fallback = EchoServiceFallback.class)
public interface NacosProviderService {
    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable(value = "message") String message);
}
