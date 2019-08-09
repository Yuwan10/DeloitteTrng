package com.pms.deloitte.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProdcutController {
	@RequestMapping("/getProduct")
	public String getProduct()
	{
		return "Getting prodcut";
	}
	@RequestMapping("/saveProduct")
	public String getMessage()
	{
		return "Saving Product";
	}

	
}
