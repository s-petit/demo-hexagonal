package com.enjoycode.hexagonal.repository.sql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import com.enjoycode.hexagonal.service.CarRentalStock;

@Entity
public class CarRentalEntity {
   @Id
   private Integer id;

   private Integer fleetQty;

   private Integer rentedCarsQty;

   private String address;

   private Integer sales;

   public CarRentalEntity() {
   }

   public CarRentalEntity(Integer id, Integer fleetQty, Integer rentedCarsQty) {
      this.id = id;
      this.fleetQty = fleetQty;
      this.rentedCarsQty = rentedCarsQty;
   }

   public Integer getId() {
      return id;
   }

   public Integer getFleetQty() {
      return fleetQty;
   }

   public Integer getRentedCarsQty() {
      return rentedCarsQty;
   }

}
