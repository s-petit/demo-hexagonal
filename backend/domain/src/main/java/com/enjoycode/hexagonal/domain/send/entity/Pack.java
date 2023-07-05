package com.enjoycode.hexagonal.domain.send.entity;

import java.time.LocalDate;

public record Pack(
    Integer id,
    String name,
    Double quantity,
    Integer unitId,
    String unitLabel,
    Integer unitOfPresentationId,
    String unitOfPresentationLabel,
    Integer containerId,
    String containerLabel,
    String availabilityStatusId,
    LocalDate availabilityStatusDate) {}
