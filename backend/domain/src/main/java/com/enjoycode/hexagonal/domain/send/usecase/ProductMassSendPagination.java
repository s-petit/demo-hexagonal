package com.enjoycode.hexagonal.domain.send.usecase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public record ProductMassSendPagination(int productCount, int pageSize) {

  public int getNumberOfPages() {
    if (pageSize == 0) {
      return 0;
    }
    return (int) Math.ceil(productCount / (double) pageSize);
  }

  public List<Pagination> getPages() {
    List<Pagination> pages = new ArrayList<>();
    IntStream.range(0, getNumberOfPages())
        .mapToObj(i -> new Pagination(i, pageSize))
        .forEach(pages::add);
    return pages;
  }
}
