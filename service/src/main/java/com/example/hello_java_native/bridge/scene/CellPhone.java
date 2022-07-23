package com.example.hello_java_native.bridge.scene;

import com.example.hello_java_native.bridge.enums.GameScene;
import com.example.hello_java_native.bridge.model.AppInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Scope(SCOPE_PROTOTYPE)
@Service
@Slf4j
public class CellPhone extends AbstractGameScene {


    @Override
    public Integer computeTime(Long uid, AppInfo appInfo) {
        return userIdentity.computeTime(uid, appInfo, getGameScene());
    }

    @Override
    public GameScene getGameScene() {
        return GameScene.CELL_PHONE;
    }
}
