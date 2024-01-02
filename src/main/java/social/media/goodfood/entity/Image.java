package social.media.goodfood.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@Entity
public class Image {
    @Id
    private BigInteger id;
    private LocalDateTime createdDate;
}
