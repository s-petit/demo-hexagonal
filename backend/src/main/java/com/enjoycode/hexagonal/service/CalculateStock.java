package com.enjoycode.hexagonal.service;

import com.enjoycode.hexagonal.repository.CarRentalEntity;
import com.enjoycode.hexagonal.repository.CarRentalSqlAdapter;

public class CalculateStock {

   private final CarRentalSqlAdapter carRentalSqlAdapter;

   public CalculateStock(CarRentalSqlAdapter carRentalSqlAdapter) {
      this.carRentalSqlAdapter = carRentalSqlAdapter;
   }

   public Integer remainingCars(int id) {
      CarRentalEntity carRentalEntity = carRentalSqlAdapter.findById(id);
      return carRentalEntity.getFleetQty() - carRentalEntity.getRentedCarsQty();
   }
}
