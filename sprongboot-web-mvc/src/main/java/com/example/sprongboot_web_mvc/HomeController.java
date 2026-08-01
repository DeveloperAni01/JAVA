package com.example.sprongboot_web_mvc;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest req, HttpSession session){
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//
//        int result = num1 + num2;
//
//        session.setAttribute("result",result);
//
//        return "result.jsp";
//    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int a, @RequestParam("num2") int b, Model model, ModelAndView mv){

        int result = a + b;

        model.addAttribute("result",result);
        mv.setViewName("result");

        return mv;
    }
}
