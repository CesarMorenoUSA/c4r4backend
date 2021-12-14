/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.sergio.edu.com.reto4bck.repository;

import co.sergio.edu.com.reto4bck.crud.GadgetCrud;
import co.sergio.edu.com.reto4bck.model.Gadget;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GadgetRepository {
    @Autowired
    private GadgetCrud gdc;
    public List<Gadget> getAll() {
        return gdc.findAll();
    }

    public Optional<Gadget> getClothe(Integer id) {
        return gdc.findById(id);
    }

    public Gadget create(Gadget gadget) {
        return gdc.save(gadget);
    }

    public void update(Gadget gadget) {
        gdc.save(gadget);
    }

    public void delete(Gadget gadget) {
        gdc.delete(gadget);
    }    
}
