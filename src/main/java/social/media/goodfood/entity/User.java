package social.media.goodfood.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.*;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String nickname;
    @Column
    private String email;
    @Column(length = 5000)
    private String password;

    @Column
    private LocalDateTime createdDate;

    @ElementCollection(targetClass = ERole.class)
//    @CollectionTable(name = "user_name",
//    joinColums = @JoinColumn("user_id"))
    private Set<ERole> role = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user", orphanRemoval = true)
    private List<Post> posts = new ArrayList<>();

    @PrePersist
    public void onCreate() {
        this.createdDate = LocalDateTime.now();
    }

}
