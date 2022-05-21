package com.example.demo.controller;

import com.example.demo.entity.Country;
import com.example.demo.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(path = "/main")
public class MainPageController {

    @RequestMapping(method = RequestMethod.GET)
    public String getMainPage(Model model){
        //model.addAttribute("name", );
        return "basic";
    }

}
