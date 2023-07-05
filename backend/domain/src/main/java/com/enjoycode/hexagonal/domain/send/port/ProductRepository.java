package com.enjoycode.hexagonal.domain.send.port;

import com.enjoycode.hexagonal.domain.send.usecase.Pagination;
import com.enjoycode.hexagonal.domain.send.entity.Product;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {
  Optional<Product> findById(Integer id);

  Integer count();

  List<Product> findAllPaginated(Pagination pagination);
}
