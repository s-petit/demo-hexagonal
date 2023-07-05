package com.enjoycode.hexagonal.infrastructure.repository.mongo;

import java.math.BigDecimal;
import com.enjoycode.hexagonal.domain.carrental.CarRentalDetails;
import com.enjoycode.hexagonal.domain.carrental.CarRentalStock;

public class CarRentalMongo {

   private Long id;

   private Integer fleetQty;

   private BigDecimal rentedCarsQty;

   private String address;

   private Integer sales;

   public CarRentalMongo(Long id, Integer fleetQty, BigDecimal rentedCarsQty, String address, Integer sales) {
      this.id = id;
      this.fleetQty = fleetQty;
      this.rentedCarsQty = rentedCarsQty;
      this.address = address;
      this.sales = sales;
   }

   public Long getId() {
      return id;
   }

   public Integer getFleetQty() {
      return fleetQty;
   }

   public BigDecimal getRentedCarsQty() {
      return rentedCarsQty;
   }

   public String getAddress() {
      return address;
   }

   public Integer getSales() {
      return sales;
   }

   public CarRentalStock toDomain() {
      return new CarRentalStock(
            id.intValue(),
            fleetQty,
            rentedCarsQty.intValue()
      );
   }

   public CarRentalDetails toDetails() {
      return new CarRentalDetails(
            id.intValue(),
            address
      );
   }
}
