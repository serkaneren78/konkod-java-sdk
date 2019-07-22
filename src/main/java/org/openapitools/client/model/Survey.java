/*
 * Konkod
 * Kontrol Kodu
 *
 * OpenAPI spec version: v1
 * Contact: mkilcibkm@gmail.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Survey
 */

public class Survey {
  public static final String SERIALIZED_NAME_KONKOD_ID = "konkodId";
  @SerializedName(SERIALIZED_NAME_KONKOD_ID)
  private Long konkodId;

  public static final String SERIALIZED_NAME_STAR1 = "star1";
  @SerializedName(SERIALIZED_NAME_STAR1)
  private Long star1;

  public static final String SERIALIZED_NAME_STAR2 = "star2";
  @SerializedName(SERIALIZED_NAME_STAR2)
  private Long star2;

  public static final String SERIALIZED_NAME_STAR3 = "star3";
  @SerializedName(SERIALIZED_NAME_STAR3)
  private Long star3;

  public Survey konkodId(Long konkodId) {
    this.konkodId = konkodId;
    return this;
  }

   /**
   * Get konkodId
   * @return konkodId
  **/
  @ApiModelProperty(value = "")
  public Long getKonkodId() {
    return konkodId;
  }

  public void setKonkodId(Long konkodId) {
    this.konkodId = konkodId;
  }

  public Survey star1(Long star1) {
    this.star1 = star1;
    return this;
  }

   /**
   * Get star1
   * @return star1
  **/
  @ApiModelProperty(value = "")
  public Long getStar1() {
    return star1;
  }

  public void setStar1(Long star1) {
    this.star1 = star1;
  }

  public Survey star2(Long star2) {
    this.star2 = star2;
    return this;
  }

   /**
   * Get star2
   * @return star2
  **/
  @ApiModelProperty(value = "")
  public Long getStar2() {
    return star2;
  }

  public void setStar2(Long star2) {
    this.star2 = star2;
  }

  public Survey star3(Long star3) {
    this.star3 = star3;
    return this;
  }

   /**
   * Get star3
   * @return star3
  **/
  @ApiModelProperty(value = "")
  public Long getStar3() {
    return star3;
  }

  public void setStar3(Long star3) {
    this.star3 = star3;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Survey survey = (Survey) o;
    return Objects.equals(this.konkodId, survey.konkodId) &&
        Objects.equals(this.star1, survey.star1) &&
        Objects.equals(this.star2, survey.star2) &&
        Objects.equals(this.star3, survey.star3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(konkodId, star1, star2, star3);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Survey {\n");
    
    sb.append("    konkodId: ").append(toIndentedString(konkodId)).append("\n");
    sb.append("    star1: ").append(toIndentedString(star1)).append("\n");
    sb.append("    star2: ").append(toIndentedString(star2)).append("\n");
    sb.append("    star3: ").append(toIndentedString(star3)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
