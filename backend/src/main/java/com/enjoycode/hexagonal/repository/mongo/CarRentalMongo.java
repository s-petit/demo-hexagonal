package com.enjoycode.hexagonal.repository.mongo;

import java.math.BigDecimal;

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
}
