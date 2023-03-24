package com.paypilot.paypilotapi.models;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "organisation")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Organisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    private List<Services> services;
}
