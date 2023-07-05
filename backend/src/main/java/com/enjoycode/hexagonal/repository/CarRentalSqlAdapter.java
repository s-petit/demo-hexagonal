package com.enjoycode.hexagonal.repository;

public class CarRentalSqlAdapter {

   public CarRentalEntity findById(Integer id) {
      return new CarRentalEntity(id, 25, 4);
   }
}
