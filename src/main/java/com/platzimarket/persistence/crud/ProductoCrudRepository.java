package com.platzimarket.persistence.crud;
import com.platzimarket.persistence.entity.Producto;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    //Para hacer una consulta nativa se coloca la etiqueta @Query. El nombre del metodo en este caso puede ser cualquiera
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)

    //Query methods
    //Son consultas custom que hacemos ademas de las que nos da el data repository de spring boot
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int categoriaStock, boolean estado);

}
