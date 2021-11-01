package bike.reto3.repositorio;

import bike.reto3.modelo.Bike;
import bike.reto3.repositorio.Crud.BikeCrudRepositorio;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ASUS
 */
@Repository
public class BikeRepositorio {
    
    @Autowired
    private BikeCrudRepositorio bikeCrud;
    
    public List<Bike> getAll(){
        return (List<Bike>) bikeCrud.findAll();
    }
    
    public Optional<Bike> getBike(int id){
        return bikeCrud.findById(id);
    }
    
    public Bike save(Bike bike){
        return bikeCrud.save(bike);
    }
    
    public void delete(Bike bike){
        bikeCrud.delete(bike);
    }
}
