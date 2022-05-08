package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: baifengxiao
 * @date: 2022/3/24 18:09
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
