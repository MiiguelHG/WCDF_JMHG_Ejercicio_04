package com.upiiz.Shipping.Controllers;

import com.upiiz.Shipping.Models.Shipping;
import com.upiiz.Shipping.Services.ShippingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/shipping")
public class ShippingController {
    ShippingService shippingService;

    //Construcotr
    public ShippingController(ShippingService shippingService){
        this.shippingService = shippingService;
    }

    //GET
    @GetMapping
    public ResponseEntity<List<Shipping>> getShipping(){
        return ResponseEntity.ok(shippingService.getAllShipings());
    }

    //GET by Id
    @GetMapping("/{id}")
    public ResponseEntity<Shipping> getShippingById(@PathVariable Long id){
        return ResponseEntity.ok(shippingService.getShippingById(id));
    }

    //Post
    @PostMapping
    public ResponseEntity<Shipping> save(@RequestBody Shipping shipping){
        Shipping newShipping = shippingService.save(shipping);
        // Devuelve HTTP 201 Created con el objeto creado como JSON
        return ResponseEntity.status(HttpStatus.CREATED).body(newShipping);
    }

    //PUT
    @PutMapping("/{id}")
    public ResponseEntity<Shipping> update(@PathVariable Long id, @RequestBody Shipping shipping){
        shipping.setShippingId(id);
        return ResponseEntity.ok(shippingService.update(shipping));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        shippingService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
