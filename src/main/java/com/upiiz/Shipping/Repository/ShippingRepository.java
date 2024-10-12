package com.upiiz.Shipping.Repository;

import com.upiiz.Shipping.Models.Shipping;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ShippingRepository {
    private List<Shipping> shippings = new ArrayList<>();
    private AtomicLong shippingId = new AtomicLong();

    //Guardar Shipping
    public Shipping save(Shipping shipping){
        shipping.setShippingId(shippingId.incrementAndGet());
        shippings.add(shipping);
        return shipping;
    }

    // Obtener Shipping
    public List<Shipping> getShippings(){
        return shippings;
    }

    // Obtener Shipping por Id
    public Shipping getShippingById(Long id){
        return shippings.stream().filter(shipping -> shipping.getShippingId().equals(id)).findFirst().orElse(null);
    }

    // Eliminar Shipping
    public void delete(Long id){
        shippings.removeIf(shipping -> shipping.getShippingId().equals(id));
    }

    // Actualizar shipping
    public Shipping update(Shipping shipping){
        delete(shipping.getShippingId());
        shippings.add(shipping);
        return shipping;
    }
}
