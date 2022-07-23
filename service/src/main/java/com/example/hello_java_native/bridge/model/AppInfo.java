package com.example.hello_java_native.bridge.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AppInfo {
    private String appId;

    private Integer packageType;

    private Integer supportDevice;
}
