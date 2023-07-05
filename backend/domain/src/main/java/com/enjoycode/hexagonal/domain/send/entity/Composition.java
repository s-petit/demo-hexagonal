package com.enjoycode.hexagonal.domain.send.entity;

public record Composition(
    Integer paiSubstanceId,
    String paiSubstanceLabel,
    Integer basisOfStrengthSubstanceId,
    String basisOfStrengthSubstanceLabel,
    Integer strengthNumeratorUnitId,
    String strengthNumeratorUnitLabel,
    Double strengthNumeratorValue,
    Integer strengthDenominatorUnitId,
    String strengthDenominatorUnitLabel,
    Integer strengthDenominatorUnitOfPresentationId,
    String strengthDenominatorUnitOfPresentationLabel,
    Double strengthDenominatorValue) {}
