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
import io.grafeas.model.ProvenanceHash;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * An entity that can have metadata. For example, a Docker image.
 */
@Schema(description = "An entity that can have metadata. For example, a Docker image.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T11:45:09.912-07:00[America/Los_Angeles]")public class V1beta1Resource {

  @SerializedName("name")
  private String name = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("content_hash")
  private ProvenanceHash contentHash = null;
  public V1beta1Resource name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * The name of the resource. For example, the name of a Docker image - \&quot;Debian\&quot;.
  * @return name
  **/
  @Schema(description = "The name of the resource. For example, the name of a Docker image - \"Debian\".")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public V1beta1Resource uri(String uri) {
    this.uri = uri;
    return this;
  }

  

  /**
  * Required. The unique URI of the resource. For example, &#x60;https://gcr.io/project/image@sha256:foo&#x60; for a Docker image.
  * @return uri
  **/
  @Schema(description = "Required. The unique URI of the resource. For example, `https://gcr.io/project/image@sha256:foo` for a Docker image.")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }
  public V1beta1Resource contentHash(ProvenanceHash contentHash) {
    this.contentHash = contentHash;
    return this;
  }

  

  /**
  * Get contentHash
  * @return contentHash
  **/
  @Schema(description = "")
  public ProvenanceHash getContentHash() {
    return contentHash;
  }
  public void setContentHash(ProvenanceHash contentHash) {
    this.contentHash = contentHash;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1Resource v1beta1Resource = (V1beta1Resource) o;
    return Objects.equals(this.name, v1beta1Resource.name) &&
        Objects.equals(this.uri, v1beta1Resource.uri) &&
        Objects.equals(this.contentHash, v1beta1Resource.contentHash);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, uri, contentHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1Resource {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    contentHash: ").append(toIndentedString(contentHash)).append("\n");
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
