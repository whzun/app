package org.whz.app.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloControler {
   @RequestMapping("/xxx/{userName}")  
   public String toIndex(Model model){  
       //model.addAttribute("user", @Path);  
	   model.addAttribute("message","xxx");
       return "helloWorld";  
   }
}
