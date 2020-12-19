package com.cybertek.entity;

import com.cybertek.enums.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "account_details")
public class Account extends BaseEntity{

    private String name;
    private String country;
    private String state;
    private String city;
    private String address;
    private Integer age;

    @Column(name = "postal_code")
    private String postalCode;

    @Enumerated(EnumType.STRING)
    private UserRole role = UserRole.USER;

    @OneToOne(mappedBy = "account")
    private User user;

    public Account(String name, String country, String state, String city, String address, Integer age, String postalCode, UserRole role) {
        this.name = name;
        this.country = country;
        this.state = state;
        this.city = city;
        this.address = address;
        this.age = age;
        this.postalCode = postalCode;
        this.role = role;
    }


}
