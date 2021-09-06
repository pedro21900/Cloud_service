package labsdio.shopptincart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
public class ShopptinCartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopptinCartApplication.class, args);
    }

}