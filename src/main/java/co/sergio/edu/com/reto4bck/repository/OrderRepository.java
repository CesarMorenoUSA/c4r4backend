/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.sergio.edu.com.reto4bck.repository;

import co.sergio.edu.com.reto4bck.crud.OrderCrud;
import co.sergio.edu.com.reto4bck.model.Order;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    @Autowired
    private OrderCrud orc;
    public List<Order> getAll(){
        return orc.findAll();
    }

    public Optional<Order> getOrder(Integer id){
        return orc.findById(id);
    }

    public Order create(Order order){
        return orc.save(order);
    }

    public void update(Order order){
        orc.save(order);
    }

    public void delete(Order order){
        orc.delete(order);
    }

    public List<Order> getOrderByZone(String zone){
        return orc.findBySalesManZone(zone);
    }

//Reto4
    public List<Order> getBySalesManId(Integer id){
        return orc.findBySalesManId(id);
    }

    public List<Order> getBySalesManIdAndStatus(Integer id, String status){
        return orc.findBySalesManIdAndStatus(id, status);
    }

    public List<Order> getByRegisterDayAndSalesManId(String registerDay, Integer id){
        try {
            return orc.findByRegisterDayAndSalesManId(new SimpleDateFormat("yyyy-MM-dd").parse(registerDay), id);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }    
}
