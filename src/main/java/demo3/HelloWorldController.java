package demo3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/show-form")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/process-form")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/process-form-2")
    public String showStudentName(HttpServletRequest request, Model model) {
        String name = request.getParameter("studentName");
        name = name.toUpperCase();
        String res = "Hi " + name;
        model.addAttribute("message", res);
        return "helloworld";
    }
}
