package labsdio.shopptincart.domain;

import labsdio.shopptincart.domain.Item;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import javax.annotation.Generated;
import java.util.List;

@Data
@RedisHash("cart")
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    private Long id;

    private List<Item> itemList;

}

