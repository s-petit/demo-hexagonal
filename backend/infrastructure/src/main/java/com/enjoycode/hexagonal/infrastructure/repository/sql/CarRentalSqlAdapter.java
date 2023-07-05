package com.enjoycode.hexagonal.infrastructure.repository.sql;

import java.math.BigDecimal;
import com.enjoycode.hexagonal.domain.carrental.CarRentalPort;
import com.enjoycode.hexagonal.domain.carrental.CarRentalStock;

public class CarRentalSqlAdapter implements CarRentalPort {

   @Override
   public CarRentalStock findById(Integer id) {
      return new CarRentalEntity(id, 25, 4).toDomain();
   }
}
