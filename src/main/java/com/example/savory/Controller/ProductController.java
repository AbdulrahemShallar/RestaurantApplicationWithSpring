package com.example.savory.Controller;

import com.example.savory.model.Products;
import com.example.savory.repository.MainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
public class ProductController {

    private MainRepository mainRepository;

    @Autowired
    public void setMainRepository(MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }

    @RequestMapping(path = "/")
    public String mainIndex(Model model){
        return index(model);
    }

    @RequestMapping(path = "/index")
    public String index(Model model){
        model.addAttribute("products",getTop6(mainRepository.findAll()));
        return "index";
    }

    @RequestMapping(path = "/contact")
    public String contact(){return  "contact";}

    @RequestMapping(path = "/menu")
    public  String menu(Model model){

        model.addAttribute("products",mainRepository.findAll());

        return "menu";}

    @RequestMapping(path = "/services")
    public String services(){return "services";}

    private List<Products> getTop6(List<Products> products){
            products.sort(Comparator.comparingInt(Products::getNumberOfOrdering).reversed());
            // Return the top 6 elements or all elements if the list has fewer than 6 items
            return products.subList(0, Math.min(products.size(), 6));
    }
    @RequestMapping(path = "/sendEmail",method = RequestMethod.POST)
    public  String getMail(@RequestParam String name,
                           @RequestParam String email,
                           @RequestParam String message){
       System.out.println("Name : " + name);
       System.out.println("Email : " + email);
       System.out.println("Message : "+ message);
       return "redirect:index";
    }

}
