package com.App1.App1.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "center")
    public class Center {
        @Id
        @Column(name = "center_id")
        private String centerId;
        @Column(name = "center_name")
        private String centerName;
        @Column(name = "center_address")
        private String centerAddress;
        @Column(name = "center_phone")
        private String centerPhone;

        @OneToMany(mappedBy = "center", cascade = CascadeType.ALL, orphanRemoval = true)
        @JsonIgnore
        Set<FreCen> freCens;
    }
