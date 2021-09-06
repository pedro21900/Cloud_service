package labsdio.shopptincart.domain;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("Item")
public class Item {
    private Integer idproduct;
    private Integer amount;
}
