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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An artifact that can be deployed in some runtime.
 */
@Schema(description = "An artifact that can be deployed in some runtime.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T11:23:37.921-07:00[America/Los_Angeles]")public class DeploymentDeployable {

  @SerializedName("resource_uri")
  private List<String> resourceUri = null;
  public DeploymentDeployable resourceUri(List<String> resourceUri) {
    this.resourceUri = resourceUri;
    return this;
  }

  public DeploymentDeployable addResourceUriItem(String resourceUriItem) {
    if (this.resourceUri == null) {
      this.resourceUri = new ArrayList<String>();
    }
    this.resourceUri.add(resourceUriItem);
    return this;
  }

  /**
  * Required. Resource URI for the artifact being deployed.
  * @return resourceUri
  **/
  @Schema(description = "Required. Resource URI for the artifact being deployed.")
  public List<String> getResourceUri() {
    return resourceUri;
  }
  public void setResourceUri(List<String> resourceUri) {
    this.resourceUri = resourceUri;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentDeployable deploymentDeployable = (DeploymentDeployable) o;
    return Objects.equals(this.resourceUri, deploymentDeployable.resourceUri);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(resourceUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentDeployable {\n");
    
    sb.append("    resourceUri: ").append(toIndentedString(resourceUri)).append("\n");
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
