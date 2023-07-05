package com.enjoycode.hexagonal.domain.send.usecase;

public record Pagination(int pageNumber, int pageSize) {

  public static Pagination of(int pageNumber, int pageSize) {
    return new Pagination(pageNumber, pageSize);
  }

  public int firstResult() {
    return pageNumber() * pageSize();
  }
}
