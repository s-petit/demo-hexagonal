package com.enjoycode.hexagonal.repository.sql;

public class CarRentalSqlRepository {

   public CarRentalEntity findById(Integer id) {
      return new CarRentalEntity(id, 25, 4);
   }
}
