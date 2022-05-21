package com.example.demo.service;

import com.example.demo.entity.Country;
import com.example.demo.repository.CountryDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CountryServiceImpl implements CountryService {

    private final CountryDao countryDao;

    @Override
    public List<Country> getAllCountry() {
        return countryDao.findAll();
    }
}
