package com.platzimarket.persistence;

import com.platzimarket.persistence.crud.ProductoCrudRepository;
import com.platzimarket.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    public List<Producto> getByCategoria (int idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }


    //Metodos de crudRepository
    public Optional<Producto> getByIdProducto(int producto) {
        return productoCrudRepository.findById(producto);
    }

    public Producto save (Producto producto) {
        return productoCrudRepository.save(producto);
    }

    public void delete (int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }
}
