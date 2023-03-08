package com.App1.App1.model.user;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "account")
public class User implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "username",nullable = false, unique = true)
    private String username;
    @Column(name = "password",nullable = false)
    private String password;
}
