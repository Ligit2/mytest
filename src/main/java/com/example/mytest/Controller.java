package com.example.mytest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    private final AnimalRepository animalRepository;

    public Controller(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping("/cat")
    public String foo(){
        return "Hii Kitty";
    }
    @PostMapping("/animal")
    public ResponseEntity<Animal> create(@RequestBody AnimalRequest animalRequest){
        Animal animal = new Animal();
        animal.setName(animalRequest.getName());
        animal.setAge(animalRequest.getAge());
        animal.setOwnerName(animalRequest.getOwnerName());
        Animal save = animalRepository.save(animal);
        return new ResponseEntity<>(save, HttpStatus.OK);
    }
}
