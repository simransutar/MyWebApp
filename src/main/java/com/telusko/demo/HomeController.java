package com.telusko.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "home";  // This points to home.jsp or other view technology
    }
    @RequestMapping("/home2")
      public String home2(@RequestParam(name = "simran", defaultValue = "Guest") String name, Model model) {
        // Pass the message to the view using the model
    	 String message = "Hi " + name + " !!!!Welcome to java world";
    	 model.addAttribute("message", message);
        return "home2";  // This points to home2.jsp or other view technology
    }
}
  
    


