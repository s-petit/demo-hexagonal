package com.enjoycode.hexagonal.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.enjoycode.hexagonal.repository.sql.CarRentalEntity;
import com.enjoycode.hexagonal.service.CarRentalService;

@RestController
public class CarRentalController {

   private final CarRentalService carRentalService;

   public CarRentalController(CarRentalService carRentalService) {
      this.carRentalService = carRentalService;
   }

   @GetMapping("/car-rental/{id}/stock")
   public ResponseEntity<Integer> getStock(@PathVariable("id") Integer id) {
      Integer stock = carRentalService.remainingCars(id);

      return ResponseEntity.ok(stock);
   }

   // Le controller accède directement au code infrastructure
   @GetMapping("/car-rental/{id}")
   public ResponseEntity<CarRentalEntity> findById(@PathVariable("id") Integer id) {
      CarRentalEntity carRental = carRentalService.findById(id);
      return ResponseEntity.ok(carRental);
   }
}
