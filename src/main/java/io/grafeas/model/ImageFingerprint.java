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
 * A set of properties that uniquely identify a given Docker image.
 */
@Schema(description = "A set of properties that uniquely identify a given Docker image.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T11:45:09.912-07:00[America/Los_Angeles]")public class ImageFingerprint {

  @SerializedName("v1_name")
  private String v1Name = null;

  @SerializedName("v2_blob")
  private List<String> v2Blob = null;

  @SerializedName("v2_name")
  private String v2Name = null;
  public ImageFingerprint v1Name(String v1Name) {
    this.v1Name = v1Name;
    return this;
  }

  

  /**
  * Required. The layer ID of the final layer in the Docker image&#x27;s v1 representation.
  * @return v1Name
  **/
  @Schema(description = "Required. The layer ID of the final layer in the Docker image's v1 representation.")
  public String getV1Name() {
    return v1Name;
  }
  public void setV1Name(String v1Name) {
    this.v1Name = v1Name;
  }
  public ImageFingerprint v2Blob(List<String> v2Blob) {
    this.v2Blob = v2Blob;
    return this;
  }

  public ImageFingerprint addV2BlobItem(String v2BlobItem) {
    if (this.v2Blob == null) {
      this.v2Blob = new ArrayList<String>();
    }
    this.v2Blob.add(v2BlobItem);
    return this;
  }

  /**
  * Required. The ordered list of v2 blobs that represent a given image.
  * @return v2Blob
  **/
  @Schema(description = "Required. The ordered list of v2 blobs that represent a given image.")
  public List<String> getV2Blob() {
    return v2Blob;
  }
  public void setV2Blob(List<String> v2Blob) {
    this.v2Blob = v2Blob;
  }
  /**
  * Output only. The name of the image&#x27;s v2 blobs computed via:   [bottom] :&#x3D; v2_blob[bottom]   [N] :&#x3D; sha256(v2_blob[N] + \&quot; \&quot; + v2_name[N+1]) Only the name of the final blob is kept.
  * @return v2Name
  **/
  @Schema(description = "Output only. The name of the image's v2 blobs computed via:   [bottom] := v2_blob[bottom]   [N] := sha256(v2_blob[N] + \" \" + v2_name[N+1]) Only the name of the final blob is kept.")
  public String getV2Name() {
    return v2Name;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageFingerprint imageFingerprint = (ImageFingerprint) o;
    return Objects.equals(this.v1Name, imageFingerprint.v1Name) &&
        Objects.equals(this.v2Blob, imageFingerprint.v2Blob) &&
        Objects.equals(this.v2Name, imageFingerprint.v2Name);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(v1Name, v2Blob, v2Name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageFingerprint {\n");
    
    sb.append("    v1Name: ").append(toIndentedString(v1Name)).append("\n");
    sb.append("    v2Blob: ").append(toIndentedString(v2Blob)).append("\n");
    sb.append("    v2Name: ").append(toIndentedString(v2Name)).append("\n");
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
