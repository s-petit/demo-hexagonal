package com.enjoycode.hexagonal.domain.carrental;

public class CarRentalService {

   private final CarRentalPort carRentalPort;

   public CarRentalService(CarRentalPort carRentalPort) {
      this.carRentalPort = carRentalPort;
   }

   public Integer remainingCars(int id) {
      CarRentalStock carRentalStock = carRentalPort.findById(id);
      return carRentalStock.fleetQty() - carRentalStock.rentedCarsQty();
   }

   public CarRentalDetails findById(Integer id) {
      return carRentalPort.findDetailsById(id);
   }
}
