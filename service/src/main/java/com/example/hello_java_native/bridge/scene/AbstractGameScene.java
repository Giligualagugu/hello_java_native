package com.example.hello_java_native.bridge.scene;

import com.example.hello_java_native.bridge.enums.GameScene;
import com.example.hello_java_native.bridge.identity.UserIdentity;
import com.example.hello_java_native.bridge.model.AppInfo;
import lombok.Getter;
import lombok.Setter;

public abstract class AbstractGameScene {

    @Getter
    @Setter
    UserIdentity userIdentity;

    public abstract Integer computeTime(Long uid, AppInfo appInfo);


    public abstract GameScene getGameScene();
}
