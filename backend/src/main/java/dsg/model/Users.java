package dsg.model;

import dsg.model.enums.TipoUser;
import jakarta.persistence.*;


@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private TipoUser type;

    public Users(){
    }

    public Users(String name, String email, String password, TipoUser type) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }
    public void changePassword(String newHashedPassword) {
        this.password = newHashedPassword;
    }

    public TipoUser whichType(){
        return type;
    }



    // getters e setters
}