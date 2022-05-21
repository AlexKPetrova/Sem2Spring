package com.example.demo.repository;

import com.example.demo.entity.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CountryDao extends CrudRepository<Country, Long> {

    List<Country> findAll();
}
