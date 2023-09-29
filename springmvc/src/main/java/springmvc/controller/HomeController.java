package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is Home Url");
		
		model.addAttribute("name","Shivji Singh");
		model.addAttribute("id",1212);
		
		List<String> friends=new ArrayList<String>();
		friends.add("Shubham Singh");
		friends.add("Satyam Singh");
		friends.add("Kamal Nayan");
		model.addAttribute("f",friends);
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
	
		System.out.println("this About Url");
		return "about";
	}
	
	@RequestMapping("/service")
	public String service() {
		System.out.println("This Services Url");
		return "service";
	}
	
	@RequestMapping("help")
	public ModelAndView help() {
		System.out.println("This is Help Url");
		ModelAndView modelAndView=new ModelAndView();
		//Seting the Data
		modelAndView.addObject("name","Uttam Singh");
		modelAndView.addObject("roll",1221);
		LocalDateTime now= LocalDateTime.now();
		modelAndView.addObject("time",now);
		//Seting the view name
		List<Integer> list=new ArrayList<Integer>();
		list.add(75);
		list.add(78);
		list.add(80);
		list.add(85);
		list.add(92);
		modelAndView.addObject("marks",list);
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
	@RequestMapping("contact")
	public String contact() {
		System.out.println("This is our Contact Url");
		return "contact";
	}
}
