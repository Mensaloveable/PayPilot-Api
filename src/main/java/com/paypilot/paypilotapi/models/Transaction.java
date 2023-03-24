package com.paypilot.paypilotapi.models;

import com.paypilot.paypilotapi.enums.TransactionStatus;
import com.paypilot.paypilotapi.enums.TransactionType;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "transaction")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Transaction {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long transactionId;
     private String transactionReference;
     private BigDecimal amount;
     private TransactionType transactionType;
     private Date dateOfTransaction;
     private TransactionStatus status;
     private String description;
//   private Transac serviceType;
}
