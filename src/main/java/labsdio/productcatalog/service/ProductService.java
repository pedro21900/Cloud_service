package labsdio.productcatalog.service;

import labsdio.productcatalog.domain.Product;
import labsdio.productcatalog.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
public Product insert(Product product){
    return productRepository.save(product);
}

    public Optional<Product> findById(Long id){
        return productRepository.findById(id);
    }
    public void delete(Long id){
        productRepository.deleteById(id);
    }
}
