package com.example.hello_java_native.delegate;

import com.example.hello_java_native.bridge.ComputeService;
import com.example.hello_java_native.gen.api.KeleApiDelegate;
import com.example.hello_java_native.gen.api.TimeApiDelegate;
import com.example.hello_java_native.gen.model.KeleResult;
import com.example.hello_java_native.gen.model.SaveUserInfoRsp;
import com.example.hello_java_native.gen.model.UserInfoData;
import com.example.hello_java_native.gen.model.UserInfoRsp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class KeleApiImpl implements KeleApiDelegate, TimeApiDelegate {

    @Value("${kele.value}")
    Integer age;

    // webrequest 属于运行时创建的proxy对象,不支持 native-image



    @Override
    public ResponseEntity<UserInfoRsp> queryUserInfoById(Long id) {
        return ResponseEntity.ok(new UserInfoRsp().ret(new KeleResult().code(1).message("ok")).data(new UserInfoData().username("xukele").age(age)));
    }

    @Override
    public ResponseEntity<SaveUserInfoRsp> saveUserInfo(UserInfoData body) {
        return null;
    }

    @Autowired
    ComputeService computeService;

    @Override
    public ResponseEntity<Object> testBridge(Long uid, String appId) {
        Integer andCompute = computeService.getAndCompute(uid, appId);
        return ResponseEntity.ok(andCompute);
    }
}
