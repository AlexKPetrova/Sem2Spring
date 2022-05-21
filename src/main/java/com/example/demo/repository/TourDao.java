package com.example.demo.repository;

import com.example.demo.entity.Tour;
import org.springframework.data.repository.CrudRepository;

public interface TourDao extends CrudRepository<Tour,Long> {
}
