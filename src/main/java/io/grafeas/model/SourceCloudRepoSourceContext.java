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
import io.grafeas.model.SourceAliasContext;
import io.grafeas.model.SourceRepoId;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * A CloudRepoSourceContext denotes a particular revision in a Google Cloud Source Repo.
 */
@Schema(description = "A CloudRepoSourceContext denotes a particular revision in a Google Cloud Source Repo.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T11:00:24.051-07:00[America/Los_Angeles]")public class SourceCloudRepoSourceContext {

  @SerializedName("repo_id")
  private SourceRepoId repoId = null;

  @SerializedName("revision_id")
  private String revisionId = null;

  @SerializedName("alias_context")
  private SourceAliasContext aliasContext = null;
  public SourceCloudRepoSourceContext repoId(SourceRepoId repoId) {
    this.repoId = repoId;
    return this;
  }

  

  /**
  * Get repoId
  * @return repoId
  **/
  @Schema(description = "")
  public SourceRepoId getRepoId() {
    return repoId;
  }
  public void setRepoId(SourceRepoId repoId) {
    this.repoId = repoId;
  }
  public SourceCloudRepoSourceContext revisionId(String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  

  /**
  * A revision ID.
  * @return revisionId
  **/
  @Schema(description = "A revision ID.")
  public String getRevisionId() {
    return revisionId;
  }
  public void setRevisionId(String revisionId) {
    this.revisionId = revisionId;
  }
  public SourceCloudRepoSourceContext aliasContext(SourceAliasContext aliasContext) {
    this.aliasContext = aliasContext;
    return this;
  }

  

  /**
  * Get aliasContext
  * @return aliasContext
  **/
  @Schema(description = "")
  public SourceAliasContext getAliasContext() {
    return aliasContext;
  }
  public void setAliasContext(SourceAliasContext aliasContext) {
    this.aliasContext = aliasContext;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceCloudRepoSourceContext sourceCloudRepoSourceContext = (SourceCloudRepoSourceContext) o;
    return Objects.equals(this.repoId, sourceCloudRepoSourceContext.repoId) &&
        Objects.equals(this.revisionId, sourceCloudRepoSourceContext.revisionId) &&
        Objects.equals(this.aliasContext, sourceCloudRepoSourceContext.aliasContext);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(repoId, revisionId, aliasContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceCloudRepoSourceContext {\n");
    
    sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
    sb.append("    revisionId: ").append(toIndentedString(revisionId)).append("\n");
    sb.append("    aliasContext: ").append(toIndentedString(aliasContext)).append("\n");
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
