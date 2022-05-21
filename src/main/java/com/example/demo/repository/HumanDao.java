package com.example.demo.repository;

import com.example.demo.entity.Human;
import org.springframework.data.repository.CrudRepository;

public interface HumanDao extends CrudRepository<Human, Long> {
}
