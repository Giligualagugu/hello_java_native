package com.example.hello_java_native.api;

import com.example.hello_java_native.model.UserInfoRsp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-08T23:36:34.895654300+08:00[Asia/Shanghai]")
@Controller
@RequestMapping("${openapi.xukele.base-path:}")
public class KeleApiController implements KeleApi {

    private final KeleApiDelegate delegate;

    public KeleApiController(@Autowired(required = false) KeleApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new KeleApiDelegate() {});
    }

    @Override
    public KeleApiDelegate getDelegate() {
        return delegate;
    }

}
