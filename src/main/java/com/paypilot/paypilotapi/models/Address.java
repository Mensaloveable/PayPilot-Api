package com.paypilot.paypilotapi.models;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table (name = "address")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String state;
    private String country;
    private Date createdAt;
    private Date modifiedAt;

}
