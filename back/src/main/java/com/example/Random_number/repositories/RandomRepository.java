package com.example.Random_number.repositories;

import com.example.Random_number.model.Random;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface RandomRepository extends ReactiveCrudRepository<Random, String> {
}
