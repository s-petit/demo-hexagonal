package com.enjoycode.hexagonal.infrastructure.repository.mongo;

import java.math.BigDecimal;
import com.enjoycode.hexagonal.domain.carrental.CarRentalPort;
import com.enjoycode.hexagonal.domain.carrental.CarRentalStock;

public class CarRentalMongoAdapter implements CarRentalPort {

   @Override
   public CarRentalStock findById(Integer id) {
      // 1. l'adapter s'adapte au contrat du port au niveau du param et du retour
      Long idLong = Long.valueOf(id);
      return new CarRentalMongo(idLong,
            25,
            new BigDecimal("4"),
            "rue de la paix",
            35000)
            .toDomain();
   }
}
