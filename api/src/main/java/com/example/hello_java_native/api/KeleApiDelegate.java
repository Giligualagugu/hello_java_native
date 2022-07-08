package com.example.hello_java_native.api;

import com.example.hello_java_native.model.UserInfoRsp;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link KeleApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-08T23:36:34.895654300+08:00[Asia/Shanghai]")
public interface KeleApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /kele
     * 查询用户信息
     *
     * @param id 用户id (optional)
     * @return OK (status code 200)
     * @see KeleApi#queryUserInfoById
     */
    default ResponseEntity<UserInfoRsp> queryUserInfoById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"ret\" : { \"code\" : 0, \"message\" : \"message\" }, \"data\" : { \"skills\" : [ \"skills\", \"skills\" ], \"age\" : 6, \"username\" : \"username\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
