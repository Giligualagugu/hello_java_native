package com.example.hello_java_native.bridge;

import com.example.hello_java_native.bridge.enums.GameScene;
import com.example.hello_java_native.bridge.enums.UserLevel;
import com.example.hello_java_native.bridge.identity.UserIdentity;
import com.example.hello_java_native.bridge.scene.AbstractGameScene;
import com.google.common.collect.HashBasedTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputeService {

    @Autowired
    List<UserIdentity> userIdentities;

    @Autowired
    List<AbstractGameScene> gameScenes;

    private static final HashBasedTable<GameScene, UserLevel, AbstractGameScene> HASH_BASED_TABLE = HashBasedTable.create();

    /**
     * 交叉组装;
     */
    void init() {

        for (AbstractGameScene gameScene : gameScenes) {
            for (UserIdentity userIdentity : userIdentities) {


                HASH_BASED_TABLE.put(gameScene.getGameScene(), userIdentity.getUserLevel(), gameScene);
            }
        }


    }
}
