package com.example.hello_java_native.bridge.model;

import com.example.hello_java_native.bridge.enums.UserLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserData {
    private Long uid;

    private UserLevel userLevel;

    private Object data;
}
