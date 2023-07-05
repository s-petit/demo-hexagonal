package com.enjoycode.hexagonal.repository.mongo;

import java.math.BigDecimal;

public class CarRentalMongoRepository {

   public CarRentalMongo findById(Long id) {
      return new CarRentalMongo(String.valueOf(id), 25, new BigDecimal(4), "rue de la paix", 85000);
   }
}
