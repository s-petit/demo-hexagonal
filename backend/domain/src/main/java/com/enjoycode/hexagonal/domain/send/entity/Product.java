package com.enjoycode.hexagonal.domain.send.entity;

import java.time.LocalDate;
import java.util.Set;

public record Product(
    Integer id,
    Integer countryId,
    String name,
    Integer doseFormId,
    String doseFormLabel,
    Integer unitOfPresentationId,
    String unitOfPresentationLabel,
    Integer supplierId,
    String supplierLabel,
    String marketStatusId,
    LocalDate marketStatusDate,
    Set<Pack> packs,
    Set<Composition> compositions) {
  public Product(
      Integer id,
      String name,
      Integer formId,
      String formName,
      String marketStatus,
      LocalDate marketStatusDate,
      Integer uopId,
      String uopLabel,
      Integer supplierId,
      String supplierLabel,
      Set<Composition> compositions,
      Set<Pack> packages) {
    this(
        id,
        250,
        name,
        formId,
        formName,
        uopId,
        uopLabel,
        supplierId,
        supplierLabel,
        marketStatus,
        marketStatusDate,
        packages,
        compositions);
  }
}
