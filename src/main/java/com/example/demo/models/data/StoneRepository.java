package com.example.demo.models.data;

import com.example.demo.models.Stone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoneRepository extends CrudRepository<Stone, Integer> {
}
