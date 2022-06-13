package com.platzimarket.persistence.mapper;
import com.platzimarket.domain.Product;
import com.platzimarket.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "IdProducto", target = "ProductoId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "IdCategoria", target = "categoryId"),
            @Mapping(source = "precio_venta", target = "price"),
            @Mapping(source = "cantidad_stock", target = "stock"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "categoria", target = "category"),

    })
    Product toProduct(Producto producto);

    @InheritInverseConfiguration
    @Mapping(target = "cantidadStock", ignore = true)
    Producto toProducto (Product product);
}
