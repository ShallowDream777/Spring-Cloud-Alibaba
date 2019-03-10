package start.fallback;

import org.springframework.stereotype.Component;
import start.service.NacosProviderService;

/**
 * @Auther: ShallowDream7
 * @Date: 2019/3/10 18:03
 * @Description:
 */
@Component
public class EchoServiceFallback implements NacosProviderService {
    @Override
    public String echo(String message) {
        return "服务挂了";
    }
}
