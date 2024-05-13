package ma.enset.cassandra_spring_boot.services;

import ma.enset.cassandra_spring_boot.entities.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductServices {
    Product saveProduct(Product product);
    public Optional<Product> getProduct(UUID id);
    public void deleteProduct(UUID id) ;
    public List<Product> findAllProducts();
    public List<Product> searchProducts(String keyword);
}
