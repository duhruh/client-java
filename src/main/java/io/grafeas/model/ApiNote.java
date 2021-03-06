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
import io.grafeas.model.ApiBuildType;
import io.grafeas.model.ApiDeployable;
import io.grafeas.model.ApiDiscovery;
import io.grafeas.model.ApiNoteKind;
import io.grafeas.model.ApiVulnerabilityType;
import io.grafeas.model.DockerImageBasis;
import io.grafeas.model.NoteRelatedUrl;
import io.grafeas.model.PackageManagerPackage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Provides a detailed description of a &#x60;Note&#x60;.
 */
@ApiModel(description = "Provides a detailed description of a `Note`.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T13:20:14.121-07:00")
public class ApiNote {
  @SerializedName("name")
  private String name = null;

  @SerializedName("short_description")
  private String shortDescription = null;

  @SerializedName("long_description")
  private String longDescription = null;

  @SerializedName("kind")
  private ApiNoteKind kind = null;

  @SerializedName("vulnerability_type")
  private ApiVulnerabilityType vulnerabilityType = null;

  @SerializedName("build_type")
  private ApiBuildType buildType = null;

  @SerializedName("base_image")
  private DockerImageBasis baseImage = null;

  @SerializedName("package")
  private PackageManagerPackage _package = null;

  @SerializedName("deployable")
  private ApiDeployable deployable = null;

  @SerializedName("discovery")
  private ApiDiscovery discovery = null;

  @SerializedName("related_url")
  private List<NoteRelatedUrl> relatedUrl = null;

  @SerializedName("expiration_time")
  private OffsetDateTime expirationTime = null;

  @SerializedName("create_time")
  private OffsetDateTime createTime = null;

  @SerializedName("update_time")
  private OffsetDateTime updateTime = null;

  public ApiNote name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApiNote shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

   /**
   * A one sentence description of this &#x60;Note&#x60;.
   * @return shortDescription
  **/
  @ApiModelProperty(value = "A one sentence description of this `Note`.")
  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public ApiNote longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

   /**
   * A detailed description of this &#x60;Note&#x60;.
   * @return longDescription
  **/
  @ApiModelProperty(value = "A detailed description of this `Note`.")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public ApiNote kind(ApiNoteKind kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Output only. This explicitly denotes which kind of note is specified. This field can be used as a filter in list requests.
   * @return kind
  **/
  @ApiModelProperty(value = "Output only. This explicitly denotes which kind of note is specified. This field can be used as a filter in list requests.")
  public ApiNoteKind getKind() {
    return kind;
  }

  public void setKind(ApiNoteKind kind) {
    this.kind = kind;
  }

  public ApiNote vulnerabilityType(ApiVulnerabilityType vulnerabilityType) {
    this.vulnerabilityType = vulnerabilityType;
    return this;
  }

   /**
   * A package vulnerability type of note.
   * @return vulnerabilityType
  **/
  @ApiModelProperty(value = "A package vulnerability type of note.")
  public ApiVulnerabilityType getVulnerabilityType() {
    return vulnerabilityType;
  }

  public void setVulnerabilityType(ApiVulnerabilityType vulnerabilityType) {
    this.vulnerabilityType = vulnerabilityType;
  }

  public ApiNote buildType(ApiBuildType buildType) {
    this.buildType = buildType;
    return this;
  }

   /**
   * Build provenance type for a verifiable build.
   * @return buildType
  **/
  @ApiModelProperty(value = "Build provenance type for a verifiable build.")
  public ApiBuildType getBuildType() {
    return buildType;
  }

  public void setBuildType(ApiBuildType buildType) {
    this.buildType = buildType;
  }

  public ApiNote baseImage(DockerImageBasis baseImage) {
    this.baseImage = baseImage;
    return this;
  }

   /**
   * A note describing a base image.
   * @return baseImage
  **/
  @ApiModelProperty(value = "A note describing a base image.")
  public DockerImageBasis getBaseImage() {
    return baseImage;
  }

  public void setBaseImage(DockerImageBasis baseImage) {
    this.baseImage = baseImage;
  }

  public ApiNote _package(PackageManagerPackage _package) {
    this._package = _package;
    return this;
  }

   /**
   * A note describing a package hosted by various package managers.
   * @return _package
  **/
  @ApiModelProperty(value = "A note describing a package hosted by various package managers.")
  public PackageManagerPackage getPackage() {
    return _package;
  }

  public void setPackage(PackageManagerPackage _package) {
    this._package = _package;
  }

  public ApiNote deployable(ApiDeployable deployable) {
    this.deployable = deployable;
    return this;
  }

   /**
   * A note describing something that can be deployed.
   * @return deployable
  **/
  @ApiModelProperty(value = "A note describing something that can be deployed.")
  public ApiDeployable getDeployable() {
    return deployable;
  }

  public void setDeployable(ApiDeployable deployable) {
    this.deployable = deployable;
  }

  public ApiNote discovery(ApiDiscovery discovery) {
    this.discovery = discovery;
    return this;
  }

   /**
   * A note describing a provider/analysis type.
   * @return discovery
  **/
  @ApiModelProperty(value = "A note describing a provider/analysis type.")
  public ApiDiscovery getDiscovery() {
    return discovery;
  }

  public void setDiscovery(ApiDiscovery discovery) {
    this.discovery = discovery;
  }

  public ApiNote relatedUrl(List<NoteRelatedUrl> relatedUrl) {
    this.relatedUrl = relatedUrl;
    return this;
  }

  public ApiNote addRelatedUrlItem(NoteRelatedUrl relatedUrlItem) {
    if (this.relatedUrl == null) {
      this.relatedUrl = new ArrayList<NoteRelatedUrl>();
    }
    this.relatedUrl.add(relatedUrlItem);
    return this;
  }

   /**
   * Get relatedUrl
   * @return relatedUrl
  **/
  @ApiModelProperty(value = "")
  public List<NoteRelatedUrl> getRelatedUrl() {
    return relatedUrl;
  }

  public void setRelatedUrl(List<NoteRelatedUrl> relatedUrl) {
    this.relatedUrl = relatedUrl;
  }

  public ApiNote expirationTime(OffsetDateTime expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * Time of expiration for this note, null if note does not expire.
   * @return expirationTime
  **/
  @ApiModelProperty(value = "Time of expiration for this note, null if note does not expire.")
  public OffsetDateTime getExpirationTime() {
    return expirationTime;
  }

  public void setExpirationTime(OffsetDateTime expirationTime) {
    this.expirationTime = expirationTime;
  }

  public ApiNote createTime(OffsetDateTime createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * Output only. The time this note was created. This field can be used as a filter in list requests.
   * @return createTime
  **/
  @ApiModelProperty(value = "Output only. The time this note was created. This field can be used as a filter in list requests.")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(OffsetDateTime createTime) {
    this.createTime = createTime;
  }

  public ApiNote updateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Output only. The time this note was last updated. This field can be used as a filter in list requests.
   * @return updateTime
  **/
  @ApiModelProperty(value = "Output only. The time this note was last updated. This field can be used as a filter in list requests.")
  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiNote apiNote = (ApiNote) o;
    return Objects.equals(this.name, apiNote.name) &&
        Objects.equals(this.shortDescription, apiNote.shortDescription) &&
        Objects.equals(this.longDescription, apiNote.longDescription) &&
        Objects.equals(this.kind, apiNote.kind) &&
        Objects.equals(this.vulnerabilityType, apiNote.vulnerabilityType) &&
        Objects.equals(this.buildType, apiNote.buildType) &&
        Objects.equals(this.baseImage, apiNote.baseImage) &&
        Objects.equals(this._package, apiNote._package) &&
        Objects.equals(this.deployable, apiNote.deployable) &&
        Objects.equals(this.discovery, apiNote.discovery) &&
        Objects.equals(this.relatedUrl, apiNote.relatedUrl) &&
        Objects.equals(this.expirationTime, apiNote.expirationTime) &&
        Objects.equals(this.createTime, apiNote.createTime) &&
        Objects.equals(this.updateTime, apiNote.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shortDescription, longDescription, kind, vulnerabilityType, buildType, baseImage, _package, deployable, discovery, relatedUrl, expirationTime, createTime, updateTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiNote {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    vulnerabilityType: ").append(toIndentedString(vulnerabilityType)).append("\n");
    sb.append("    buildType: ").append(toIndentedString(buildType)).append("\n");
    sb.append("    baseImage: ").append(toIndentedString(baseImage)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    deployable: ").append(toIndentedString(deployable)).append("\n");
    sb.append("    discovery: ").append(toIndentedString(discovery)).append("\n");
    sb.append("    relatedUrl: ").append(toIndentedString(relatedUrl)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

