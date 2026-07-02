package dsg.model;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
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

    public Products() {
        // required by JPA/Hibernate
    }

    public Products(String name, String description, BigDecimal price, Integer quantityAvailable, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantityAvailable = quantityAvailable;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(Integer quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }



}
