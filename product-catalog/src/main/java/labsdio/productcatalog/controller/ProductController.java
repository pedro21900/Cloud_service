package labsdio.productcatalog.controller;

import labsdio.productcatalog.domain.Product;
import labsdio.productcatalog.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public Product insert (@RequestBody()Product product){
       return productService.insert(product);
    }
    @GetMapping("/{id}")
    public Optional<Product> findById (@PathVariable Long id){
        return productService.findById(id);
    }

}
