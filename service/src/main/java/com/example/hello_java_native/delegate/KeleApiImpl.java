package com.example.hello_java_native.delegate;

import com.example.hello_java_native.gen.api.KeleApiDelegate;
import com.example.hello_java_native.gen.model.KeleResult;
import com.example.hello_java_native.gen.model.UserInfoData;
import com.example.hello_java_native.gen.model.UserInfoRsp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.util.WebUtils;

import java.util.Optional;

@Component
public class KeleApiImpl implements KeleApiDelegate {

    @Value("${kele.value}")
    Integer age;

    @Autowired
    NativeWebRequest nativeWebRequest;

    @Override
    public ResponseEntity<UserInfoRsp> queryUserInfoById(Long id) {
        return ResponseEntity.ok(new UserInfoRsp().ret(new KeleResult().code(1).message("ok")).data(new UserInfoData().username("xukele").age(age)));
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(nativeWebRequest);
    }
}
