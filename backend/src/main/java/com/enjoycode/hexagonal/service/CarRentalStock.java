package com.enjoycode.hexagonal.service;

public record CarRentalStock(
      Integer id,
      Integer fleetQty,
      Integer rentedCarsQty
) {
}
