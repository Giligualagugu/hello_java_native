package com.example.hello_java_native.bridge;

import cn.hutool.extra.spring.SpringUtil;
import com.example.hello_java_native.bridge.enums.GameScene;
import com.example.hello_java_native.bridge.enums.UserLevel;
import com.example.hello_java_native.bridge.identity.UserIdentity;
import com.example.hello_java_native.bridge.model.AppInfo;
import com.example.hello_java_native.bridge.scene.AbstractGameScene;
import com.google.common.collect.HashBasedTable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class ComputeService {

    @Autowired
    List<UserIdentity> userIdentities;

    @Autowired
    List<AbstractGameScene> gameScenes;

    private static final HashBasedTable<GameScene, UserLevel, AbstractGameScene> HASH_BASED_TABLE = HashBasedTable.create();

    /**
     * 交叉组装; 组合方式有  x*y中；  必须从bean工程生成新的 实例来交叉组装；
     */
    @PostConstruct
    void init() {
        for (AbstractGameScene gameScene : gameScenes) {
            for (UserIdentity userIdentity : userIdentities) {
                AbstractGameScene scene = SpringUtil.getBean(gameScene.getClass());
                UserIdentity identity = SpringUtil.getBean(userIdentity.getClass());
                scene.setUserIdentity(identity);
                HASH_BASED_TABLE.put(gameScene.getGameScene(), userIdentity.getUserLevel(), scene);
            }
        }
        log.info("combine finshed..........");
        System.out.println(HASH_BASED_TABLE);
        System.out.println(gameScenes);
        System.out.println(userIdentities);
    }

    public Integer getAndCompute(Long uid, String appId) {

        GameScene gameScene = GameScene.CELL_PHONE;
        if (Objects.equals(appId, "tvpc")) {
            gameScene = GameScene.TV_PC;
        }

        if (appId.equals("cellphone")) {
            gameScene = GameScene.CELL_PHONE;
        }
        return Objects.requireNonNull(HASH_BASED_TABLE.get(gameScene, UserLevel.VIP)).computeTime(uid, AppInfo.builder().appId(appId).build());
    }
}
