package com.example.hello_java_native.model;

import java.net.URI;
import java.util.Objects;
import com.example.hello_java_native.model.KeleResult;
import com.example.hello_java_native.model.UserInfoData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserInfoRsp
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-08T23:36:34.895654300+08:00[Asia/Shanghai]")
public class UserInfoRsp {

  @JsonProperty("ret")
  private KeleResult ret;

  @JsonProperty("data")
  private UserInfoData data;

  public UserInfoRsp ret(KeleResult ret) {
    this.ret = ret;
    return this;
  }

  /**
   * Get ret
   * @return ret
  */
  @Valid 
  @Schema(name = "ret", required = false)
  public KeleResult getRet() {
    return ret;
  }

  public void setRet(KeleResult ret) {
    this.ret = ret;
  }

  public UserInfoRsp data(UserInfoData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @Valid 
  @Schema(name = "data", required = false)
  public UserInfoData getData() {
    return data;
  }

  public void setData(UserInfoData data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfoRsp userInfoRsp = (UserInfoRsp) o;
    return Objects.equals(this.ret, userInfoRsp.ret) &&
        Objects.equals(this.data, userInfoRsp.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ret, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfoRsp {\n");
    sb.append("    ret: ").append(toIndentedString(ret)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

