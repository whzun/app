package org.whz.app.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.whz.app.beans.Book;
import org.whz.app.svc.BookService;

@Controller
@RequestMapping("/hello")
public class HelloControler {
	@Autowired
	private BookService bookService;
   @RequestMapping("/xxx")  
   public String toIndex(Model model){  
       //model.addAttribute("user", @Path);  
	   Book book = bookService.getBookById(1);
	   model.addAttribute("message","xxx");
	   model.addAttribute("book", book);
       return "helloWorld";  
   }
}
