package com.platzimarket.domain.repository;

import com.platzimarket.domain.Product;
import com.platzimarket.persistence.crud.ProductoCrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

      List<Product> getAll();
      List<Product> getByCategory (int categoryId) ;
      Optional<List<Product>> getScarseProduct(int quantity);

      //Metodos de crudRepository
      Optional<Product> getByIdProduct(int product) ;
      Product save (Product product);
      void delete (int productId);

}
