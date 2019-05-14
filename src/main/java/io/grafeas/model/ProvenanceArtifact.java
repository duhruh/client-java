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
 * Artifact describes a build product.
 */
@Schema(description = "Artifact describes a build product.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T11:00:24.051-07:00[America/Los_Angeles]")public class ProvenanceArtifact {

  @SerializedName("checksum")
  private String checksum = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("names")
  private List<String> names = null;
  public ProvenanceArtifact checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

  

  /**
  * Hash or checksum value of a binary, or Docker Registry 2.0 digest of a container.
  * @return checksum
  **/
  @Schema(description = "Hash or checksum value of a binary, or Docker Registry 2.0 digest of a container.")
  public String getChecksum() {
    return checksum;
  }
  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }
  public ProvenanceArtifact id(String id) {
    this.id = id;
    return this;
  }

  

  /**
  * Artifact ID, if any; for container images, this will be a URL by digest like &#x60;gcr.io/projectID/imagename@sha256:123456&#x60;.
  * @return id
  **/
  @Schema(description = "Artifact ID, if any; for container images, this will be a URL by digest like `gcr.io/projectID/imagename@sha256:123456`.")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public ProvenanceArtifact names(List<String> names) {
    this.names = names;
    return this;
  }

  public ProvenanceArtifact addNamesItem(String namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<String>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
  * Related artifact names. This may be the path to a binary or jar file, or in the case of a container build, the name used to push the container image to Google Container Registry, as presented to &#x60;docker push&#x60;. Note that a single Artifact ID can have multiple names, for example if two tags are applied to one image.
  * @return names
  **/
  @Schema(description = "Related artifact names. This may be the path to a binary or jar file, or in the case of a container build, the name used to push the container image to Google Container Registry, as presented to `docker push`. Note that a single Artifact ID can have multiple names, for example if two tags are applied to one image.")
  public List<String> getNames() {
    return names;
  }
  public void setNames(List<String> names) {
    this.names = names;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvenanceArtifact provenanceArtifact = (ProvenanceArtifact) o;
    return Objects.equals(this.checksum, provenanceArtifact.checksum) &&
        Objects.equals(this.id, provenanceArtifact.id) &&
        Objects.equals(this.names, provenanceArtifact.names);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(checksum, id, names);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvenanceArtifact {\n");
    
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
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
