/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.sergio.edu.com.reto4bck.crud;
import co.sergio.edu.com.reto4bck.model.Gadget;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 *
 * @author cesar
 */
public interface GadgetCrud extends MongoRepository<Gadget, Integer>{
    
}
