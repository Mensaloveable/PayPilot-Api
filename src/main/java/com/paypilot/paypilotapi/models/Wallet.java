package com.paypilot.paypilotapi.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "wallet")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal accountBalance;
    @OneToOne
    private User user;
    @OneToMany
    private List<Transaction> transactionHistory;
}
