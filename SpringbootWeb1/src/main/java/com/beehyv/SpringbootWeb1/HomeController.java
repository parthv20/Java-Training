package com.beehyv.SpringbootWeb1;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }

    @RequestMapping("add")
    public String add(HttpServlet req, HttpSession session){
      int num1= Integer.parseInt(req. getInitParameter("num1"));
      int num2=Integer.parseInt(req.getInitParameter("num2"));
      int result=num1+num2;

      session.setAttribute("result",result);
      return "result.jsp";
    }
}
