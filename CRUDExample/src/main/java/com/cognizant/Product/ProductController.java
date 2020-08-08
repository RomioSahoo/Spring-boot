package com.cognizant.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class ProductController {
	@Autowired
	private ProductService ps;
	
	@RequestMapping("/")
	public String viewHomePage(Model m) {
		List<Product> list=ps.listAll();
		System.out.println("Inside viewHomePage method");
		m.addAttribute("list",list);
		return "index";
	}
	
	@RequestMapping("/new")
	public String NewProduct(Model m)
	{
		System.out.println("Inside NewProduct method");
		m.addAttribute("command",new Product());
		return "newProduct";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveProduct(@ModelAttribute("p") Product p)
	{
		System.out.println("Inside saveProduct method");
		ps.save(p);
		return "redirect:/";
	}
	
	@RequestMapping(value="/edit/{id}")
	public String showEditProductPage(@PathVariable int id,Model m) 
	{
		System.out.println("Inside showEditProductpage");
		Product p=ps.get(id);
		m.addAttribute("command",p);
		return "editProduct";
	}
	
	@RequestMapping(value="/editsave", method=RequestMethod.POST)
	public String saveEditProduct(@ModelAttribute("p") Product p)
	{
		ps.save(p);
		return "redirect:/";
	}
	
	@RequestMapping(value="delete/{id}")
	public String deleteProduct(@PathVariable int id, Model m )
	{
		System.out.println("Inside deleteProduct method");
		ps.delete(id);
		return "redirect:/";
	}
	
	
}
