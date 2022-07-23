package com.example.hello_java_native.bridge.identity;

import com.example.hello_java_native.bridge.enums.GameScene;
import com.example.hello_java_native.bridge.enums.UserLevel;
import com.example.hello_java_native.bridge.model.AppInfo;
import com.example.hello_java_native.bridge.model.UserData;

public interface UserIdentity {
    Integer computeTime(Long uid, AppInfo appInfo, GameScene gameScene);

    UserLevel getUserLevel();

    UserData loadUserData(Long uid);
}
