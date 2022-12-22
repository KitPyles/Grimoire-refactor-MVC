package com.example.demo.models.data;

import com.example.demo.models.Tarot;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarotRepository extends CrudRepository<Tarot, Integer> {
}
