package com.example.demo.models.data;

import com.example.demo.models.Stone;
import org.springframework.data.repository.CrudRepository;

public interface StoneRepository extends CrudRepository<Stone, Integer> {
}
