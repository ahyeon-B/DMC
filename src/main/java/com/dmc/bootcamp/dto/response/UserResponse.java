package com.dmc.bootcamp.dto.response;

import com.dmc.bootcamp.domain.User;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class UserResponse {
    private String userId;
    private String password;
    private String userName;
    private Character gender;
    private LocalDate birthday;
    private String diseaseInfo;
    private float height;
    private float weight;
    private  String address;

    public UserResponse(User user){
        this.userId=user.getUserId();
        this.userName=user.getUserName();
        this.password=user.getPassword();
        this.gender=user.getGender();
        this.birthday=user.getBirthday();
        this.diseaseInfo=user.getDiseaseInfo();
        this.height=user.getHeight();
        this.weight=user.getWeight();
        this.address=user.getAddress();
    }
}
