package mvc;

import mvc.bean.User;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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


    @RequestMapping("testServletAPI")
    public String testServletAPI(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username:" + username + ",password:" + password);
        return "success";
    }

    @RequestMapping("/testParam")
    public String testParam(String username,String password) {
        System.out.println("username:" + username + ",password:" + password);
        return "success";
    }
    @RequestMapping("/testBean")
    public String testBean(User user){
        System.out.println(user);
        return "success";
    }
}
