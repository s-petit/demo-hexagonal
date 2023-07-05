package com.enjoycode.hexagonal.repository.sql;

import java.math.BigDecimal;

public class CarRentalSqlRepository {

   public CarRentalEntity findById(Integer id) {
      return new CarRentalEntity(id, 25, 4);
   }
}
