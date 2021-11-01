/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bike.reto3.repositorio.Crud;

import bike.reto3.modelo.Bike;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ASUS
 */
public interface BikeCrudRepositorio extends CrudRepository <Bike, Integer>{
    
}
