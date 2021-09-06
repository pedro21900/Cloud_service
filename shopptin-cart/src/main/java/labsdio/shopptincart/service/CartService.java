package labsdio.shopptincart.service;


import labsdio.shopptincart.domain.Cart;
import labsdio.shopptincart.repository.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CartService {
    private final CartRepository cartRepository;

    public Cart insert(Cart cart) {
        return cartRepository.save(cart);
    }

    public Optional<Cart> findById(String id) {
        return cartRepository.findById(id);
    }

    public void delete(String id) {
        cartRepository.deleteById(id);
    }
}
