package com.example.hello_java_native.bridge.identity;

import com.example.hello_java_native.bridge.enums.GameScene;
import com.example.hello_java_native.bridge.enums.UserLevel;
import com.example.hello_java_native.bridge.model.AppInfo;
import com.example.hello_java_native.bridge.model.UserData;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Service
public class VipUser implements UserIdentity {

    @Override
    public Integer computeTime(Long uid, AppInfo appInfo, GameScene gameScene) {
        switch (gameScene) {
            case TV_PC -> {
                return 123;
            }
            case TV_PHONE -> {
                return 223;
            }
            case CELL_PHONE -> {
                return 444;
            }
        }

        return null;
    }

    @Override
    public UserLevel getUserLevel() {
        return UserLevel.VIP;
    }

    @Override
    public UserData loadUserData(Long uid) {
        return UserData.builder().data("xukele").uid(uid).userLevel(getUserLevel()).build();
    }
}
