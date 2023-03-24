package com.paypilot.paypilotapi.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "user_account")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class UserAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountNumber;
    private Integer bvn;
    private Integer transactionPin;
    private Boolean isVerified;
}
