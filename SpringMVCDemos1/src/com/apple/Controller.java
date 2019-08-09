package com.apple;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@org.springframework.stereotype.Controller
public class Controller {

	/*@RequestMapping("/addCustomer")
	public String ssds()
	{
		return "addCustomer";
	}
	@RequestMapping("/updateCustomer")
	public String ssdp()
	{
		return "updateCustomer";
	}
	@RequestMapping("/deleteCustomer")
	public String ssdq()
	{
		return "deleteCustomer";
	}
	@RequestMapping("/findCustomer")
	public String ssde()
	{
		return "findCustomer";
	}
	@RequestMapping("/allCustomer")
	public String ssda()
	{
		return "allCustomer";
	}*/
		@RequestMapping("/doSome")
		public ModelAndView ssds()
		{
	ModelAndView view = new ModelAndView();
  view.addObject("message", "Hello,Today is thursday");
  view.setViewName("sayHello");	
		return view;
	}
	
	
}
