package com.enjoycode.hexagonal.repository.mongo;

import java.math.BigDecimal;

public class CarRentalMongo {

   private String _id;

   private Integer fleetQty;

   private BigDecimal rentedCarsQty;

   private String address;

   private Integer sales;

   public CarRentalMongo(String _id, Integer fleetQty, BigDecimal rentedCarsQty, String address, Integer sales) {
      this._id = _id;
      this.fleetQty = fleetQty;
      this.rentedCarsQty = rentedCarsQty;
      this.address = address;
      this.sales = sales;
   }

   public String getId() {
      return _id;
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
