package com.paypilot.paypilotapi.models;

import com.paypilot.paypilotapi.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {
    private String firstname;
    private String lastname;
    private String middleName;
    private String phoneNumber;
    private String email;
    private Gender gender;
    private Date dateOfBirth;
    private Address address;
    private Integer bvn;
    private Boolean bvnAuthenticated;
}
