package com.enjoycode.hexagonal.domain.carrental;

public interface CarRentalPort {

   CarRentalStock findById(Integer id);

   CarRentalDetails findDetailsById(Integer id);
}
