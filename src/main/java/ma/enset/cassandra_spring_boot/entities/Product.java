package ma.enset.cassandra_spring_boot.entities;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.UUID;

@Table("products")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Product {
    @PrimaryKey
    private UUID id;
    private String name;
    private double price;
    private int quantiteStock;
}
