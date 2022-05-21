package com.example.demo.repository;

import com.example.demo.entity.Trip;
import org.springframework.data.repository.CrudRepository;

public interface TripDao extends CrudRepository<Trip,Long> {
}
