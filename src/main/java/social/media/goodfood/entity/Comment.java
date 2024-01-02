package social.media.goodfood.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigInteger;

@Data
@Entity
public class Comment {
    @Id
    private BigInteger ID;
    private User user;

}
