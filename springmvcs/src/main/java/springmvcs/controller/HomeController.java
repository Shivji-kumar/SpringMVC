package springmvcs.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping(path="/",method=RequestMethod.GET)
	public String home(Model model) {
		System.out.println("this is Home URL");
		
		model.addAttribute("name","Shivji Singh");
		model.addAttribute("id",101);
		
		List<String> friends=new ArrayList<String>();
		friends.add("Gopal");
		friends.add("Vikash");
		friends.add("Aman");
		model.addAttribute("f", friends);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is About URL");
		return "about";
	}
	
	@RequestMapping("/service")
	public String service() {
		System.out.println("This is Service URL");
		return "help";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is Help URL");
		//Creating model and view object
		ModelAndView modelAndView=new ModelAndView();
		//Setting the data
		
		modelAndView.addObject("name","Uttam Singh");
		modelAndView.addObject("rollnumber", 101);
		LocalDateTime now= LocalDateTime.now();
		modelAndView.addObject("time",now);
		now.toString();
		
		//Marks
		List<Integer> list=new ArrayList<Integer>();
		list.add(120);
		list.add(140);
		list.add(160);
		list.add(180);
		list.add(200);
		
		modelAndView.addObject("marks",list);
		//Setting the view
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
