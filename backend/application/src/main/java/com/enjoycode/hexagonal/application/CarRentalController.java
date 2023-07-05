package com.enjoycode.hexagonal.application;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.enjoycode.hexagonal.domain.carrental.CarRentalDetails;
import com.enjoycode.hexagonal.domain.carrental.CarRentalService;
import com.enjoycode.hexagonal.infrastructure.repository.sql.CarRentalSqlAdapter;

@RestController
public class CarRentalController {

   private final CarRentalService carRentalService;

   public CarRentalController() {
      this.carRentalService = new CarRentalService(new CarRentalSqlAdapter());
   }

   @GetMapping("/car-rental/{id}/stock")
   public ResponseEntity<Integer> sendAllProducts(@PathVariable("id") Integer id) {
      Integer stock = carRentalService.remainingCars(id);
      return ResponseEntity.ok(stock);
   }

   // Le controller ne peut accéder qu´au code du domaine
   @GetMapping("/car-rental/{id}")
   public ResponseEntity<CarRentalDetails> findById(@PathVariable("id") Integer id) {
      CarRentalDetails carRental = carRentalService.findById(id);
      return ResponseEntity.ok(carRental);
   }
}
