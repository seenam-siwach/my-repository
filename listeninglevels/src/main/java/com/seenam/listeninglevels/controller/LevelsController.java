package com.seenam.listeninglevels.controller;

import com.seenam.listeninglevels.entity.Levels;
import com.seenam.listeninglevels.repository.LevelsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class LevelsController {

    private final LevelsRepository levelsRepository;

    public LevelsController(LevelsRepository levelsRepository) {
        this.levelsRepository = levelsRepository;
    }

    @GetMapping("/levels")
    public List<Levels> getLevels() {
        return (List<Levels>) levelsRepository.findAll();
    }

    @GetMapping("/levels/{userName}")
    public List<Levels> getHistory(@PathVariable String userName) {
        return (List<Levels>) levelsRepository.findAllByUserName(userName);
    }

    @DeleteMapping("/levels/{id}")
    public void deleteById(@PathVariable long id) {
        levelsRepository.deleteById(id);
    }

    @PostMapping("/levels")
    public void addLevel(@RequestBody Levels levels) {
        levelsRepository.save(levels);
    }
}
