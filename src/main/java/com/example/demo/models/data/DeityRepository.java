package com.example.demo.models.data;

import com.example.demo.models.Deity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeityRepository extends CrudRepository<Deity, Integer> {
}
