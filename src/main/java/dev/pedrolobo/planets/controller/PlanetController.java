package dev.pedrolobo.planets.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.pedrolobo.planets.entity.PlanetEntity;
import dev.pedrolobo.planets.service.PlanetService;

@RestController
@RequestMapping(path = "/planets/api/")
public class PlanetController {

  @Autowired
  private PlanetService planetService;

  @PostMapping
  public ResponseEntity<Object> newPlanet(@RequestBody PlanetEntity planetEntity) {
    return ResponseEntity.status(HttpStatus.CREATED).body(planetService.add(planetEntity));
  }

  @GetMapping
  public ResponseEntity<List<PlanetEntity>> all() {
    return ResponseEntity.ok(planetService.getAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<Optional<PlanetEntity>> getPlanet(@PathVariable(value = "id") Long id){
    return ResponseEntity.ok(planetService.getById(id));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Object> replace(@RequestBody PlanetEntity planetEntity, @PathVariable(value = "id") Long id) {
    return ResponseEntity.status(HttpStatus.CREATED).body(planetService.update(planetEntity, id));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> remove(@PathVariable(value = "id") long id) {
    planetService.delete(id);
    return ResponseEntity.noContent().build();
  }

}
