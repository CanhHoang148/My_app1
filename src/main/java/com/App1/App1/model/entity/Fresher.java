package com.App1.App1.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "fresher")
public class Fresher {
    @Id
    @Column(name = "fresher_id")
    private String fresherId;
    @Column(name = "fresher_name")
    private String fresherName;
    @Column(name = "fresher_address")
    private String fresherAddress;
    @Column(name = "fresher_phone")
    private String fresherPhone;
    @Column(name = "fresher_email")
    private String fresherEmail;

    @OneToMany(mappedBy = "fresher", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @JsonIgnore
    Set<FreCen> freCens;
    @OneToMany(mappedBy = "fresher", cascade = CascadeType.ALL, orphanRemoval = true)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @JsonIgnore
    Set<Quiz> quizzes;

    public Fresher(String fresherId, String fresherName, String fresherAddress, String fresherPhone, String fresherEmail) {
        this.fresherId = fresherId;
        this.fresherName = fresherName;
        this.fresherAddress = fresherAddress;
        this.fresherPhone = fresherPhone;
        this.fresherEmail = fresherEmail;
    }
}
