package com.example.demo.models.data;

import com.example.demo.models.Time;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeRepository extends CrudRepository<Time, Integer> {
}
