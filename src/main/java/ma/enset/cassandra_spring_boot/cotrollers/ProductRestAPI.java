package ma.enset.cassandra_spring_boot.cotrollers;
import ma.enset.cassandra_spring_boot.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ma.enset.cassandra_spring_boot.entities.Product;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/products")
public class ProductRestAPI {
    @Autowired
    private ProductServices productService;

    @PostMapping("/")
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable UUID id) {
        return productService.getProduct(id).orElse(null);
    }

    @PutMapping("/")
    public Product updateProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable UUID id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/search/{keyword}")
    public List<Product> searchProducts(@PathVariable String keyword) {
        return productService.searchProducts(keyword);
    }
}

