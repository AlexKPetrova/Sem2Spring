package com.example.demo.service;

import com.example.demo.entity.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CountryService {

    List<Country> getAllCountry();

}
