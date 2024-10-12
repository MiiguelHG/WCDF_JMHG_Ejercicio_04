package com.upiiz.Shipping.Services;

import com.upiiz.Shipping.Models.Shipping;
import com.upiiz.Shipping.Repository.ShippingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingService {
    //Requiero inyectar el repositorio
    ShippingRepository shippingRepository;

    //Constructor - Cuando crear la instanica le pasa el repositorio
    public ShippingService(ShippingRepository shippingRepository){
        this.shippingRepository = shippingRepository;
    }

    //GET
    public List<Shipping> getAllShipings (){
        return shippingRepository.getShippings();
    }

    //GET by Id
    public Shipping getShippingById(Long id){
        return shippingRepository.getShippingById(id);
    }

    //POST
    public Shipping save(Shipping shipping){
        return shippingRepository.save(shipping);
    }

    //PUT
    public Shipping update(Shipping shipping){
        return shippingRepository.update(shipping);
    }
    //DELETE
    public void delete(Long id){
        shippingRepository.delete(id);
    }
}
