package com.example.demo.models.data;

import com.example.demo.models.Spell;
import org.springframework.data.repository.CrudRepository;

public interface SpellRepository extends CrudRepository<Spell, Integer> {
}
