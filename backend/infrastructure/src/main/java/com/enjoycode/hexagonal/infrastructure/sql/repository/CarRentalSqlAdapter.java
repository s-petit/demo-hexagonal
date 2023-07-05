package com.enjoycode.hexagonal.infrastructure.sql.repository;

import com.enjoycode.hexagonal.domain.carrental.CarRentalPort;
import com.enjoycode.hexagonal.domain.carrental.CarRentalStock;
import com.enjoycode.hexagonal.infrastructure.sql.CarRentalEntity;

public class CarRentalSqlAdapter implements CarRentalPort {

   @Override
   public CarRentalStock findById(Integer id) {
      return new CarRentalEntity(id, 25, 4).toDomain();
   }
}
