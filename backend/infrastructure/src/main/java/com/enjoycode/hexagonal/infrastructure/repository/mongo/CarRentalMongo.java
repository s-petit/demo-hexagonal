package com.enjoycode.hexagonal.infrastructure.repository.mongo;

import java.math.BigDecimal;
import com.enjoycode.hexagonal.domain.carrental.CarRentalDetails;
import com.enjoycode.hexagonal.domain.carrental.CarRentalStock;

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

   public CarRentalStock toDomain() {
      return new CarRentalStock(
            Integer.parseInt(_id),
            fleetQty,
            rentedCarsQty.intValue()
      );
   }

   public CarRentalDetails toDetails() {
      return new CarRentalDetails(
            Integer.parseInt(_id),
            address
      );
   }
}
