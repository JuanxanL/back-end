/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bike.reto3.servicios;

import bike.reto3.modelo.Bike;
import bike.reto3.repositorio.BikeRepositorio;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ASUS
 */
public class BikeServicios {
    @Autowired
    private BikeRepositorio bikeRepositorio;

    public List<Bike> getAll(){
        return bikeRepositorio.getAll();
    }

    public Optional<Bike> getBike(int id){
        return bikeRepositorio.getBike(id);
    }

    public Bike save(Bike bike){
        if(bike.getId()==null){
            return bikeRepositorio.save(bike);
        }else{
            Optional<Bike> disAux=bikeRepositorio.getBike(bike.getId());
            if (disAux.isEmpty()){
                return bikeRepositorio.save(bike);
            } else{
                return bike;
            }
        }
    }

    public Bike update(Bike bike){
        if(bike.getId()!=null){
            Optional<Bike> e=bikeRepositorio.getBike(bike.getId());
            if(!e.isEmpty()){
                if(bike.getName()!=null){
                    e.get().setName(bike.getName());
                }
                if(bike.getBrand()!=null){
                    e.get().setBrand(bike.getBrand());
                }
                if(bike.getYear()!=null){
                    e.get().setYear(bike.getYear());
                }
                if(bike.getDescription()!=null){
                    e.get().setDescription(bike.getDescription());
                }

                bikeRepositorio.save(e.get());
                return e.get();
            }else{
                return bike;
            }
        }else{
            return bike;
        }
    }

  public boolean deleteBike(int bikeId) {
        Boolean borrar= getBike(bikeId).map(bike -> {
            bikeRepositorio.delete(bike);
            return true;
        }).orElse(false);
        return borrar;
    }
}
