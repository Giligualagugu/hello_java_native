package com.example.hello_java_native.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserInfoData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-08T23:36:34.895654300+08:00[Asia/Shanghai]")
public class UserInfoData {

  @JsonProperty("username")
  private String username;

  @JsonProperty("age")
  private Integer age;

  @JsonProperty("skills")
  @Valid
  private List<String> skills = null;

  public UserInfoData username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  
  @Schema(name = "username", required = false)
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserInfoData age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Get age
   * @return age
  */
  
  @Schema(name = "age", required = false)
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public UserInfoData skills(List<String> skills) {
    this.skills = skills;
    return this;
  }

  public UserInfoData addSkillsItem(String skillsItem) {
    if (this.skills == null) {
      this.skills = new ArrayList<>();
    }
    this.skills.add(skillsItem);
    return this;
  }

  /**
   * Get skills
   * @return skills
  */
  
  @Schema(name = "skills", required = false)
  public List<String> getSkills() {
    return skills;
  }

  public void setSkills(List<String> skills) {
    this.skills = skills;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfoData userInfoData = (UserInfoData) o;
    return Objects.equals(this.username, userInfoData.username) &&
        Objects.equals(this.age, userInfoData.age) &&
        Objects.equals(this.skills, userInfoData.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, age, skills);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfoData {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
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

