package com.enjoycode.hexagonal.infrastructure.repository.sql;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import com.enjoycode.hexagonal.domain.carrental.CarRentalDetails;
import com.enjoycode.hexagonal.domain.carrental.CarRentalStock;

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

   public CarRentalEntity(Integer id, String address) {
      this.id = id;
      this.address = address;
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


   public CarRentalStock toDomain() {
      return new CarRentalStock(
            id,
            fleetQty,
            rentedCarsQty
      );
   }

   public CarRentalDetails toDetails() {
      return new CarRentalDetails(
            id,
            address
      );
   }
}
