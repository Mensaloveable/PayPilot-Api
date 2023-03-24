package com.paypilot.paypilotapi.models;

import com.paypilot.paypilotapi.enums.ActivityStatus;
import com.paypilot.paypilotapi.enums.ActivityType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "activity")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  docketId;
//  private Logger logger;
    private ActivityType activityType;
    private ActivityStatus activityStatus;
    private String activityDescription;
    private LocalDate time;
    @ManyToOne
    private User user;
}
