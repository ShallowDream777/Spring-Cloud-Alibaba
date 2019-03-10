package start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: ShallowDream7
 * @Date: 2019/3/10 16:17
 * @Description:
 */
@RestController
public class indexController {

    @Autowired
    private LoadBalancerClient LoadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${spring.application.name}")
    private String appName;


    @GetMapping(value = "/echo")
    public String echo(){
      ServiceInstance ServiceInstance= LoadBalancerClient.choose("nacos-provider");
        String url=String.format("http://%s:%s/echo/%s",ServiceInstance.getHost(),ServiceInstance.getPort(),appName);
        return restTemplate.getForObject(url,String.class);
    }



}
