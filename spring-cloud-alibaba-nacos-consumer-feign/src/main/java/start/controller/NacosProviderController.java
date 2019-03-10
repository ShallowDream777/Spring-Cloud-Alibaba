package start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import start.service.NacosProviderService;

/**
 * @Auther: ShallowDream7
 * @Date: 2019/3/10 17:39
 * @Description:
 */
@RestController
public class NacosProviderController {

    @Autowired
    private NacosProviderService nacosProviderService;

    @GetMapping(value = "/echo")
    public String echo(){
        return nacosProviderService.echo("Feign");
    }


}
