package start.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ShallowDream7
 * @Date: 2019/3/10 16:17
 * @Description:
 */
@RestController
public class indexController {
    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable(value = "message") String message){
      return "hello"+message;
    }

}
