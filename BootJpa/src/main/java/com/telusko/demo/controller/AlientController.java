package com.telusko.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.telusko.demo.dao.AlienDao;
import com.telusko.demo.model.Alien;

@RestController
public class AlientController {
	@Autowired
	AlienDao adao;
	
    @RequestMapping("/")
	public String Home()
	{
		return "index.jsp";
	}
    
    @PostMapping("/Alien")
	public Alien addAlien(@RequestBody Alien a)
	{
    	adao.save(a);
		return a;
	}
    @DeleteMapping("/Alien/{id}")
	public String deleteAlien(@PathVariable int id)
	{
    	
    	Alien a = adao.getOne(id);
    	
    	adao.deleteById(id);
		return "deleted";
	}
    
    @RequestMapping("/getAlien")
   	public ModelAndView getAlien(@RequestParam  int id)
   	{
       	ModelAndView mv = new ModelAndView("showAlien.jsp");
        Alien a = adao.findById(id).orElse(new Alien());
        System.out.println("from UI get id"+a.getId()+ "get name"+a.getName());
        mv.addObject("a",a);
        
        System.out.println(adao.findByLang("java"));
   		
        System.out.println(adao.findByIdGreaterThan(104));
        
        System.out.println(adao.findByLangSorted("java"));
        return mv;
   	}
    
    @GetMapping(value="/aliens")	
    @ResponseBody
   	public List<Alien> getAliensbs()
   	{
       	
        return adao.findAll();
   	}
    
    @GetMapping("/aliens/{id}")
    @ResponseBody
   	public Optional<Alien> getAliens(@PathVariable("id") int id)
   	{
       	
        return adao.findById(id);
   	}
}
