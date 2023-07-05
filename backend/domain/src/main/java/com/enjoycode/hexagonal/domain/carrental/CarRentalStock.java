package com.enjoycode.hexagonal.domain.carrental;

public record CarRentalStock(
      Integer id,
      Integer fleetQty,
      Integer rentedCarsQty
) {
}
