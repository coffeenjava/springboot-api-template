package com.template.myapi.controller.req;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
public class UserCreateReq {

    @NotBlank
    private String email;

    @NotNull
    private Integer age;

    private String nationalId;
    private String name;
    private String phone;

}
