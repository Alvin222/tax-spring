package com.alvin.apipajak.model;

import javax.persistence.*;

@Entity
@Table
public class Auth {

    @Id
    @SequenceGenerator(
            name="auth_sequence",
            sequenceName =  "auth_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "auth_sequence"
    )
    private Long id;
    private String username;
    private String password;
    private int status;

    public Auth() {
    }

    public Auth(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Auth(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
