package ma.enset.cassandra_spring_boot.repositories;
import ma.enset.cassandra_spring_boot.entities.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends CassandraRepository<Product, UUID> {
    List<Product> getAllByName(String name);

    @Query("SELECT * FROM products WHERE name LIKE ?0 ALLOW FILTERING")
    List<Product> findByNameContaining(String keyword);
}
