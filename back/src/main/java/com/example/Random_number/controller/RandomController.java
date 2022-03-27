package com.example.Random_number.controller;

import com.example.Random_number.dto.RandomDTO;
import com.example.Random_number.model.Random;
import com.example.Random_number.repositories.RandomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import java.util.Date;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/r")
public class RandomController {

    private RandomRepository randomRepository;

    @Autowired
    public RandomController(RandomRepository randomRepository) {
        this.randomRepository = randomRepository;
    }

    @GetMapping("")
    public Flux<Random> get() {
        return randomRepository.findAll();
    }

    @PostMapping("")
    public Mono<Random> post(@RequestBody RandomDTO request) {
        return Mono.just(new Random()).map(entity -> {
            entity.setDate(new Date());
            entity.setNumeroIncial(request.getNumeroInicial());
            entity.setNumeroFinal(request.getNumeroFinal());
            return entity;
        }).map(entity -> {
            var numeroRandom = entity.getNumeroIncial();
            return entity;
        }).flatMap(randomRepository::save);
    }

}
