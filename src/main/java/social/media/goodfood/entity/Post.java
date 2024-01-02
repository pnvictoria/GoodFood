package social.media.goodfood.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Post {
    @Id
    private BigInteger id;
    private String title;
    private String caption;
    private String location;
    private Integer likes;
    private Image image;
    private LocalDateTime createdDate;

    private List<Comment> comments = new ArrayList<>();

    @PrePersist
    public void onCreate() {
        this.createdDate = LocalDateTime.now();
    }
}
