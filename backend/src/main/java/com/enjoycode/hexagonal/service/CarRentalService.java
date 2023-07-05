package com.enjoycode.hexagonal.service;

import com.enjoycode.hexagonal.repository.sql.CarRentalEntity;
import com.enjoycode.hexagonal.repository.sql.CarRentalSqlRepository;

public class CarRentalService {

   // 1. on doit modifier le domaine pour que le service puisse accéder à la nouvelle base de données
   // 2. ca compile plus
   // 3. on doit toucher le domaine au risque de casser des choses
   // 4. reecriture des tests
   // 5. etc.

   private final CarRentalSqlRepository carRentalSqlRepository;

   public CarRentalService(CarRentalSqlRepository carRentalSqlRepository) {
      this.carRentalSqlRepository = carRentalSqlRepository;
   }

   public Integer remainingCars(int id) {
      CarRentalEntity carRentalEntity = carRentalSqlRepository.findById(id);
      return carRentalEntity.getFleetQty() - carRentalEntity.getRentedCarsQty();
   }

   public CarRentalEntity findById(int id) {
      return carRentalSqlRepository.findById(id);
   }
}
