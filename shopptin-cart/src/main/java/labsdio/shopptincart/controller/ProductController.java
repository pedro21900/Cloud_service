package labsdio.shopptincart.controller;


import labsdio.shopptincart.domain.Cart;
import labsdio.shopptincart.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/shopping")
@AllArgsConstructor
public class ProductController {

    private final CartService productService;

    @PostMapping
    public Cart insert (@RequestBody() Cart cart){
       return productService.insert(cart);
    }
    @GetMapping("/{id}")
    public Optional<Cart> findById (@PathVariable String id){
        return productService.findById(id);
    }
    @GetMapping
    public ResponseEntity<List<Cart>> findAll (){
        return ResponseEntity.ok(productService.findAll());
    }

}

