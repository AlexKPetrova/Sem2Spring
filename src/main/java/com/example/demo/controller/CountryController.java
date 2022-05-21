package com.example.demo.controller;

import com.example.demo.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequiredArgsConstructor
@RequestMapping(path = "/country")
public class CountryController {

    private final CountryService countryService;

    @RequestMapping(method = RequestMethod.GET)
    public String getAllCountries(Model model) {
        model.addAttribute("listCountries", countryService.getAllCountry());
        return "basic";
    }

}
