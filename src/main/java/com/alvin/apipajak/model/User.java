package com.alvin.apipajak.model;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
    @SequenceGenerator(name="user_sequence",sequenceName = "user_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="user_sequence")
    private Long id;
    private String name;
    private LocalDate dob;
    private Long penghasilan;
    private Long tunjangan;
    private Boolean statusPernikahan;
    private Integer jumlahTangggungan;

    public User() {
    }

    public User(String name, LocalDate dob, Long penghasilan, Boolean statusPernikahan) {
        this.name = name;
        this.dob = dob;
        this.penghasilan = penghasilan;
        this.statusPernikahan = statusPernikahan;
    }

    public User(Long id, String name, LocalDate dob, Long penghasilan, Boolean statusPernikahan) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.penghasilan = penghasilan;
        this.statusPernikahan = statusPernikahan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Long getPenghasilan() {
        return penghasilan;
    }

    public void setPenghasilan(Long penghasilan) {
        this.penghasilan = penghasilan;
    }

    public Boolean getStatusPernikahan() {
        return statusPernikahan;
    }

    public void setStatusPernikahan(Boolean statusPernikahan) {
        this.statusPernikahan = statusPernikahan;
    }
}
