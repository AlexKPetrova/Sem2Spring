package com.example.demo.repository;

import com.example.demo.entity.Hotel;
import org.springframework.data.repository.CrudRepository;

public interface HotelDao extends CrudRepository<Hotel,Long> {
}
