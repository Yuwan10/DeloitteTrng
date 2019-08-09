package com.pms.deloitte.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pms.deloitte.dao.ProductDAO;

import com.pms.deloitte.model.Product;
import com.pms.deloitte.service.ProductService;
@Controller
public class ProductController {
	@Autowired
	private ProductService productservice;
	
	@RequestMapping(value="/Product" , method = RequestMethod.GET)
	public String getProduct(Model model)
	{
		model.addAttribute("product",new Product());
		model.addAttribute("listProducts", this.productservice.getAllProducts());
		return "product";
		
	}
	@RequestMapping(value= "/product/add", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product p){
		System.out.println("#####product :"+p);
			this.productservice.addProduct(p);;
		return "redirect:/Product";
	}
	@RequestMapping("/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model){
        model.addAttribute("product", this.productservice.getProductById(id));
        model.addAttribute("listProducts", this.productservice.getAllProducts());
        return "product";
    }
	@RequestMapping("/remove/{id}")
    public String removeProduct(@PathVariable("id") int id){
		
        this.productservice.deleteProduct(id);;
        return "redirect:/Product";
    }
	@RequestMapping(value= "/edit/add/update", method = RequestMethod.POST)
	public String updateProduct(@ModelAttribute("product") Product p){
		System.out.println("#####product updating :"+p);
			this.productservice.updateProduct(p);;
		return "redirect:/Product";
	}
	
	
	
	
	@RequestMapping("/getallProducts")
	public List<Product> getAllProduct()
	{   
		return productservice.getAllProducts();
	}
	@RequestMapping("/saveProduct")
	public String saveProduct(Model model,Product product)
	{ 
	  productservice.addProduct(product);
	  model.addAttribute("product",new Product());
	  model.addAttribute("message",product.getProductname()+" ,product successfully saved");
	    
	  return "product";
	
	}
	@RequestMapping("/updateProduct")
	public String updateProduct()
	{ Product product= new Product(2,"PS3",10,25000);
	  productservice.updateProduct(product);
	  return "Product updated ";
	
	}
	@RequestMapping("/deleteProduct/{pId}")
	public String deleteProduct(@PathVariable("pId")Integer productId)
	{
	 productservice.deleteProduct(productId);
	 return "Successfully deleted";
	}
	@RequestMapping("/getProduct/{pId}")
	public  getProduct(@PathVariable("pId")Integer productId)
	{
	 
	 return productservice.getProductById(productId);
	}
	@RequestMapping("/searchProduct/{min}/{max}")
	public List<Product> getAllproducts(@PathVariable("min")Integer minimum,@PathVariable("max")Integer maximum)
	{
	 
	 return productservice.searchByPriceRange(minimum, maximum);
	}

	
	
	


	
}
