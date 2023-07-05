package com.enjoycode.hexagonal.domain.carrental;

public class CalculateStock {

   private final CarRentalPort carRentalPort;

   public CalculateStock(CarRentalPort carRentalPort) {
      this.carRentalPort = carRentalPort;
   }

   public Integer remainingCars(int id) {
      CarRentalStock carRentalStock = carRentalPort.findById(id);
      return carRentalStock.fleetQty() - carRentalStock.rentedCarsQty();
   }
}
