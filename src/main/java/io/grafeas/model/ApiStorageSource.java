/*
 * Grafeas API
 * An API to insert and retrieve annotations on cloud artifacts.
 *
 * OpenAPI spec version: v1alpha1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.grafeas.model;

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
 * StorageSource describes the location of the source in an archive file in Google Cloud Storage.
 */
@ApiModel(description = "StorageSource describes the location of the source in an archive file in Google Cloud Storage.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T13:20:14.121-07:00")
public class ApiStorageSource {
  @SerializedName("bucket")
  private String bucket = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("generation")
  private String generation = null;

  public ApiStorageSource bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

   /**
   * Google Cloud Storage bucket containing source (see [Bucket Name Requirements] (https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * @return bucket
  **/
  @ApiModelProperty(value = "Google Cloud Storage bucket containing source (see [Bucket Name Requirements] (https://cloud.google.com/storage/docs/bucket-naming#requirements)).")
  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  public ApiStorageSource object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Google Cloud Storage object containing source.
   * @return object
  **/
  @ApiModelProperty(value = "Google Cloud Storage object containing source.")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public ApiStorageSource generation(String generation) {
    this.generation = generation;
    return this;
  }

   /**
   * Google Cloud Storage generation for the object.
   * @return generation
  **/
  @ApiModelProperty(value = "Google Cloud Storage generation for the object.")
  public String getGeneration() {
    return generation;
  }

  public void setGeneration(String generation) {
    this.generation = generation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiStorageSource apiStorageSource = (ApiStorageSource) o;
    return Objects.equals(this.bucket, apiStorageSource.bucket) &&
        Objects.equals(this.object, apiStorageSource.object) &&
        Objects.equals(this.generation, apiStorageSource.generation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucket, object, generation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiStorageSource {\n");
    
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    generation: ").append(toIndentedString(generation)).append("\n");
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

