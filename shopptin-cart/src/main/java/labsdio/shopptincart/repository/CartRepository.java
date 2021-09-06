
package labsdio.shopptincart.repository;


import labsdio.shopptincart.domain.Cart;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.stereotype.Repository;


@EnableRedisRepositories
@Repository
public interface CartRepository extends JpaRepository<Cart, String> {

  }

