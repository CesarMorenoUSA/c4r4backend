/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.sergio.edu.com.reto4bck.controller;

import co.sergio.edu.com.reto4bck.model.Gadget;
import co.sergio.edu.com.reto4bck.service.GadgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/gadget/")
@CrossOrigin("*")
public class GadgetController {
    @Autowired
    private GadgetService gds;

    @GetMapping("/all")
    public List<Gadget> getAll() {
        return gds.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Gadget> getClothe(@PathVariable("id") Integer id) {
        return gds.getClothe(id);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Gadget create(@RequestBody Gadget gadget) {
        return gds.create(gadget);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Gadget update(@RequestBody Gadget gadget) {
        return gds.update(gadget);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") Integer id) {
        return gds.delete(id);
    }        
}
