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
import io.grafeas.model.DiscoveredAnalysisStatus;
import io.grafeas.model.DiscoveredContinuousAnalysis;
import io.grafeas.model.RpcStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * Provides information about the analysis status of a discovered resource.
 */
@Schema(description = "Provides information about the analysis status of a discovered resource.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T11:00:24.051-07:00[America/Los_Angeles]")public class DiscoveryDiscovered {

  @SerializedName("continuous_analysis")
  private DiscoveredContinuousAnalysis continuousAnalysis = null;

  @SerializedName("last_analysis_time")
  private OffsetDateTime lastAnalysisTime = null;

  @SerializedName("analysis_status")
  private DiscoveredAnalysisStatus analysisStatus = null;

  @SerializedName("analysis_status_error")
  private RpcStatus analysisStatusError = null;
  public DiscoveryDiscovered continuousAnalysis(DiscoveredContinuousAnalysis continuousAnalysis) {
    this.continuousAnalysis = continuousAnalysis;
    return this;
  }

  

  /**
  * Get continuousAnalysis
  * @return continuousAnalysis
  **/
  @Schema(description = "")
  public DiscoveredContinuousAnalysis getContinuousAnalysis() {
    return continuousAnalysis;
  }
  public void setContinuousAnalysis(DiscoveredContinuousAnalysis continuousAnalysis) {
    this.continuousAnalysis = continuousAnalysis;
  }
  public DiscoveryDiscovered lastAnalysisTime(OffsetDateTime lastAnalysisTime) {
    this.lastAnalysisTime = lastAnalysisTime;
    return this;
  }

  

  /**
  * The last time continuous analysis was done for this resource. Deprecated, do not use.
  * @return lastAnalysisTime
  **/
  @Schema(description = "The last time continuous analysis was done for this resource. Deprecated, do not use.")
  public OffsetDateTime getLastAnalysisTime() {
    return lastAnalysisTime;
  }
  public void setLastAnalysisTime(OffsetDateTime lastAnalysisTime) {
    this.lastAnalysisTime = lastAnalysisTime;
  }
  public DiscoveryDiscovered analysisStatus(DiscoveredAnalysisStatus analysisStatus) {
    this.analysisStatus = analysisStatus;
    return this;
  }

  

  /**
  * Get analysisStatus
  * @return analysisStatus
  **/
  @Schema(description = "")
  public DiscoveredAnalysisStatus getAnalysisStatus() {
    return analysisStatus;
  }
  public void setAnalysisStatus(DiscoveredAnalysisStatus analysisStatus) {
    this.analysisStatus = analysisStatus;
  }
  public DiscoveryDiscovered analysisStatusError(RpcStatus analysisStatusError) {
    this.analysisStatusError = analysisStatusError;
    return this;
  }

  

  /**
  * Get analysisStatusError
  * @return analysisStatusError
  **/
  @Schema(description = "")
  public RpcStatus getAnalysisStatusError() {
    return analysisStatusError;
  }
  public void setAnalysisStatusError(RpcStatus analysisStatusError) {
    this.analysisStatusError = analysisStatusError;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoveryDiscovered discoveryDiscovered = (DiscoveryDiscovered) o;
    return Objects.equals(this.continuousAnalysis, discoveryDiscovered.continuousAnalysis) &&
        Objects.equals(this.lastAnalysisTime, discoveryDiscovered.lastAnalysisTime) &&
        Objects.equals(this.analysisStatus, discoveryDiscovered.analysisStatus) &&
        Objects.equals(this.analysisStatusError, discoveryDiscovered.analysisStatusError);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(continuousAnalysis, lastAnalysisTime, analysisStatus, analysisStatusError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoveryDiscovered {\n");
    
    sb.append("    continuousAnalysis: ").append(toIndentedString(continuousAnalysis)).append("\n");
    sb.append("    lastAnalysisTime: ").append(toIndentedString(lastAnalysisTime)).append("\n");
    sb.append("    analysisStatus: ").append(toIndentedString(analysisStatus)).append("\n");
    sb.append("    analysisStatusError: ").append(toIndentedString(analysisStatusError)).append("\n");
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
