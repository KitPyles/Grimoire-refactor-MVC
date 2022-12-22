package com.example.demo.models.data;

import com.example.demo.models.SpellComponent;
import com.example.demo.models.SpellStep;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpellComponentRepository extends CrudRepository<SpellComponent, Integer> {
}
