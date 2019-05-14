/*
 * proto/v1beta1/grafeas.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.grafeas.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.grafeas.model.BuildBuildSignature;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * Note holding the version of the provider&#x27;s builder and the signature of the provenance message in the build details occurrence.
 */
@Schema(description = "Note holding the version of the provider's builder and the signature of the provenance message in the build details occurrence.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T11:45:09.912-07:00[America/Los_Angeles]")public class BuildBuild {

  @SerializedName("builder_version")
  private String builderVersion = null;

  @SerializedName("signature")
  private BuildBuildSignature signature = null;
  public BuildBuild builderVersion(String builderVersion) {
    this.builderVersion = builderVersion;
    return this;
  }

  

  /**
  * Required. Immutable. Version of the builder which produced this build.
  * @return builderVersion
  **/
  @Schema(description = "Required. Immutable. Version of the builder which produced this build.")
  public String getBuilderVersion() {
    return builderVersion;
  }
  public void setBuilderVersion(String builderVersion) {
    this.builderVersion = builderVersion;
  }
  public BuildBuild signature(BuildBuildSignature signature) {
    this.signature = signature;
    return this;
  }

  

  /**
  * Get signature
  * @return signature
  **/
  @Schema(description = "")
  public BuildBuildSignature getSignature() {
    return signature;
  }
  public void setSignature(BuildBuildSignature signature) {
    this.signature = signature;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildBuild buildBuild = (BuildBuild) o;
    return Objects.equals(this.builderVersion, buildBuild.builderVersion) &&
        Objects.equals(this.signature, buildBuild.signature);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(builderVersion, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildBuild {\n");
    
    sb.append("    builderVersion: ").append(toIndentedString(builderVersion)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
