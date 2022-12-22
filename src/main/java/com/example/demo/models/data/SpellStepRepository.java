package com.example.demo.models.data;

import com.example.demo.models.SpellStep;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpellStepRepository extends CrudRepository<SpellStep, Integer> {
}
