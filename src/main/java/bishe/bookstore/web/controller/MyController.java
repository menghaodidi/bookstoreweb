package bishe.bookstore.web.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/index.do")
public class MyController {
    @GetMapping
    public ModelAndView index(Model model){

        model.addAttribute("msg","这是测试页面");
        return new ModelAndView("/test.jsp");
    }
}
