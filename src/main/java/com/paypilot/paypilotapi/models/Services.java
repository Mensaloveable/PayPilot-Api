package com.paypilot.paypilotapi.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "services")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;
//  private ServiceType serviceType;
//  private ServiceName serviceName;
    private Integer serviceReferenceNumber;
    private BigDecimal amount;
}
