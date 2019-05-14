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
import io.grafeas.model.DeploymentDeployment;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * Details of a deployment occurrence.
 */
@Schema(description = "Details of a deployment occurrence.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T11:00:24.051-07:00[America/Los_Angeles]")public class V1beta1deploymentDetails {

  @SerializedName("deployment")
  private DeploymentDeployment deployment = null;
  public V1beta1deploymentDetails deployment(DeploymentDeployment deployment) {
    this.deployment = deployment;
    return this;
  }

  

  /**
  * Get deployment
  * @return deployment
  **/
  @Schema(description = "")
  public DeploymentDeployment getDeployment() {
    return deployment;
  }
  public void setDeployment(DeploymentDeployment deployment) {
    this.deployment = deployment;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1deploymentDetails v1beta1deploymentDetails = (V1beta1deploymentDetails) o;
    return Objects.equals(this.deployment, v1beta1deploymentDetails.deployment);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(deployment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1deploymentDetails {\n");
    
    sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
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
