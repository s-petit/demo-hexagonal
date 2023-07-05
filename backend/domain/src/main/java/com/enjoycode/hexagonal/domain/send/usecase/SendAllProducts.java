package com.enjoycode.hexagonal.domain.send.usecase;

import com.enjoycode.hexagonal.domain.send.port.ProductRepository;
import com.enjoycode.hexagonal.domain.send.port.ProductSender;

public class SendAllProducts {

  public static final int PAGE_SIZE = 2000;

  private final ProductSender productSender;
  private final ProductRepository productRepository;

  public SendAllProducts(ProductSender productSender, ProductRepository productRepository) {
    this.productSender = productSender;
    this.productRepository = productRepository;
  }

  public void execute() {

    Integer productCount = productRepository.count();

    var exportPagination = new ProductMassSendPagination(productCount, PAGE_SIZE);

    exportPagination
        .getPages()
        .forEach(
            page ->
                productRepository.findAllPaginated(page).parallelStream()
                    .forEach(productSender::send));
  }
}
