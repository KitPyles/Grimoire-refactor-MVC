package com.example.demo.models.data;

import com.example.demo.models.Concept;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConceptRepository extends CrudRepository<Concept, Integer> {
}
