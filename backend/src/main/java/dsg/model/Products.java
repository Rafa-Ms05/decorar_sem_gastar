package dsg.model;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Products {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(length = 1000)
    private String description;

    // BigDecimal, not double - avoids floating point rounding errors with money
    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private Integer quantityAvailable;

    private String category;


}
