package mvc;

import javafx.application.Application;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author: baifengxiao
 * @date: 2022/3/26 12:00
 */
@Controller
public class TestController {

    @RequestMapping("/testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request) {
        request.setAttribute("testRequestScope", "hello,servletAPI");
        return "success";
    }

    @RequestMapping("/testModleAndView")
    public ModelAndView testModleAndView() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("testRequestScope", "hello,ModelAndView");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/testModel")
    public String testModel(Model model) {
        model.addAttribute("testRequestScope", "hello,model");
        return "success";
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        map.put("testRequestScope", "hello,map");
        return "success";
    }

    @RequestMapping("/testModelMap")
    public String testModel(ModelMap modelMap) {
        modelMap.addAttribute("testRequestScope", "hello,modelMap");
        return "success";
    }

    @RequestMapping("/testSession")
    public String testSession(HttpSession session) {
        session.setAttribute("testSessionScope", "hello,session");
        return "success";
    }

    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session) {
        ServletContext application = session.getServletContext();
        application.setAttribute("testApplication","hello,application");
        return "success";
    }
}
