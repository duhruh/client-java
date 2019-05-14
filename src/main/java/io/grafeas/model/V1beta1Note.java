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
import io.grafeas.model.AttestationAuthority;
import io.grafeas.model.BuildBuild;
import io.grafeas.model.DeploymentDeployable;
import io.grafeas.model.DiscoveryDiscovery;
import io.grafeas.model.ImageBasis;
import io.grafeas.model.PackagePackage;
import io.grafeas.model.V1beta1NoteKind;
import io.grafeas.model.V1beta1RelatedUrl;
import io.grafeas.model.VulnerabilityVulnerability;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * A type of analysis that can be done for a resource.
 */
@Schema(description = "A type of analysis that can be done for a resource.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T11:23:37.921-07:00[America/Los_Angeles]")public class V1beta1Note {

  @SerializedName("name")
  private String name = null;

  @SerializedName("short_description")
  private String shortDescription = null;

  @SerializedName("long_description")
  private String longDescription = null;

  @SerializedName("kind")
  private V1beta1NoteKind kind = null;

  @SerializedName("related_url")
  private List<V1beta1RelatedUrl> relatedUrl = null;

  @SerializedName("expiration_time")
  private OffsetDateTime expirationTime = null;

  @SerializedName("create_time")
  private OffsetDateTime createTime = null;

  @SerializedName("update_time")
  private OffsetDateTime updateTime = null;

  @SerializedName("related_note_names")
  private List<String> relatedNoteNames = null;

  @SerializedName("vulnerability")
  private VulnerabilityVulnerability vulnerability = null;

  @SerializedName("build")
  private BuildBuild build = null;

  @SerializedName("base_image")
  private ImageBasis baseImage = null;

  @SerializedName("package")
  private PackagePackage _package = null;

  @SerializedName("deployable")
  private DeploymentDeployable deployable = null;

  @SerializedName("discovery")
  private DiscoveryDiscovery discovery = null;

  @SerializedName("attestation_authority")
  private AttestationAuthority attestationAuthority = null;
  /**
  * Output only. The name of the note in the form of &#x60;projects/[PROVIDER_ID]/notes/[NOTE_ID]&#x60;.
  * @return name
  **/
  @Schema(description = "Output only. The name of the note in the form of `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.")
  public String getName() {
    return name;
  }
  public V1beta1Note shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  

  /**
  * A one sentence description of this note.
  * @return shortDescription
  **/
  @Schema(description = "A one sentence description of this note.")
  public String getShortDescription() {
    return shortDescription;
  }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }
  public V1beta1Note longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

  

  /**
  * A detailed description of this note.
  * @return longDescription
  **/
  @Schema(description = "A detailed description of this note.")
  public String getLongDescription() {
    return longDescription;
  }
  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }
  public V1beta1Note kind(V1beta1NoteKind kind) {
    this.kind = kind;
    return this;
  }

  

  /**
  * Get kind
  * @return kind
  **/
  @Schema(description = "")
  public V1beta1NoteKind getKind() {
    return kind;
  }
  public void setKind(V1beta1NoteKind kind) {
    this.kind = kind;
  }
  public V1beta1Note relatedUrl(List<V1beta1RelatedUrl> relatedUrl) {
    this.relatedUrl = relatedUrl;
    return this;
  }

  public V1beta1Note addRelatedUrlItem(V1beta1RelatedUrl relatedUrlItem) {
    if (this.relatedUrl == null) {
      this.relatedUrl = new ArrayList<V1beta1RelatedUrl>();
    }
    this.relatedUrl.add(relatedUrlItem);
    return this;
  }

  /**
  * URLs associated with this note.
  * @return relatedUrl
  **/
  @Schema(description = "URLs associated with this note.")
  public List<V1beta1RelatedUrl> getRelatedUrl() {
    return relatedUrl;
  }
  public void setRelatedUrl(List<V1beta1RelatedUrl> relatedUrl) {
    this.relatedUrl = relatedUrl;
  }
  public V1beta1Note expirationTime(OffsetDateTime expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  

  /**
  * Time of expiration for this note. Empty if note does not expire.
  * @return expirationTime
  **/
  @Schema(description = "Time of expiration for this note. Empty if note does not expire.")
  public OffsetDateTime getExpirationTime() {
    return expirationTime;
  }
  public void setExpirationTime(OffsetDateTime expirationTime) {
    this.expirationTime = expirationTime;
  }
  /**
  * Output only. The time this note was created. This field can be used as a filter in list requests.
  * @return createTime
  **/
  @Schema(description = "Output only. The time this note was created. This field can be used as a filter in list requests.")
  public OffsetDateTime getCreateTime() {
    return createTime;
  }
  /**
  * Output only. The time this note was last updated. This field can be used as a filter in list requests.
  * @return updateTime
  **/
  @Schema(description = "Output only. The time this note was last updated. This field can be used as a filter in list requests.")
  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }
  public V1beta1Note relatedNoteNames(List<String> relatedNoteNames) {
    this.relatedNoteNames = relatedNoteNames;
    return this;
  }

  public V1beta1Note addRelatedNoteNamesItem(String relatedNoteNamesItem) {
    if (this.relatedNoteNames == null) {
      this.relatedNoteNames = new ArrayList<String>();
    }
    this.relatedNoteNames.add(relatedNoteNamesItem);
    return this;
  }

  /**
  * Other notes related to this note.
  * @return relatedNoteNames
  **/
  @Schema(description = "Other notes related to this note.")
  public List<String> getRelatedNoteNames() {
    return relatedNoteNames;
  }
  public void setRelatedNoteNames(List<String> relatedNoteNames) {
    this.relatedNoteNames = relatedNoteNames;
  }
  public V1beta1Note vulnerability(VulnerabilityVulnerability vulnerability) {
    this.vulnerability = vulnerability;
    return this;
  }

  

  /**
  * Get vulnerability
  * @return vulnerability
  **/
  @Schema(description = "")
  public VulnerabilityVulnerability getVulnerability() {
    return vulnerability;
  }
  public void setVulnerability(VulnerabilityVulnerability vulnerability) {
    this.vulnerability = vulnerability;
  }
  public V1beta1Note build(BuildBuild build) {
    this.build = build;
    return this;
  }

  

  /**
  * Get build
  * @return build
  **/
  @Schema(description = "")
  public BuildBuild getBuild() {
    return build;
  }
  public void setBuild(BuildBuild build) {
    this.build = build;
  }
  public V1beta1Note baseImage(ImageBasis baseImage) {
    this.baseImage = baseImage;
    return this;
  }

  

  /**
  * Get baseImage
  * @return baseImage
  **/
  @Schema(description = "")
  public ImageBasis getBaseImage() {
    return baseImage;
  }
  public void setBaseImage(ImageBasis baseImage) {
    this.baseImage = baseImage;
  }
  public V1beta1Note _package(PackagePackage _package) {
    this._package = _package;
    return this;
  }

  

  /**
  * Get _package
  * @return _package
  **/
  @Schema(description = "")
  public PackagePackage getPackage() {
    return _package;
  }
  public void setPackage(PackagePackage _package) {
    this._package = _package;
  }
  public V1beta1Note deployable(DeploymentDeployable deployable) {
    this.deployable = deployable;
    return this;
  }

  

  /**
  * Get deployable
  * @return deployable
  **/
  @Schema(description = "")
  public DeploymentDeployable getDeployable() {
    return deployable;
  }
  public void setDeployable(DeploymentDeployable deployable) {
    this.deployable = deployable;
  }
  public V1beta1Note discovery(DiscoveryDiscovery discovery) {
    this.discovery = discovery;
    return this;
  }

  

  /**
  * Get discovery
  * @return discovery
  **/
  @Schema(description = "")
  public DiscoveryDiscovery getDiscovery() {
    return discovery;
  }
  public void setDiscovery(DiscoveryDiscovery discovery) {
    this.discovery = discovery;
  }
  public V1beta1Note attestationAuthority(AttestationAuthority attestationAuthority) {
    this.attestationAuthority = attestationAuthority;
    return this;
  }

  

  /**
  * Get attestationAuthority
  * @return attestationAuthority
  **/
  @Schema(description = "")
  public AttestationAuthority getAttestationAuthority() {
    return attestationAuthority;
  }
  public void setAttestationAuthority(AttestationAuthority attestationAuthority) {
    this.attestationAuthority = attestationAuthority;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1Note v1beta1Note = (V1beta1Note) o;
    return Objects.equals(this.name, v1beta1Note.name) &&
        Objects.equals(this.shortDescription, v1beta1Note.shortDescription) &&
        Objects.equals(this.longDescription, v1beta1Note.longDescription) &&
        Objects.equals(this.kind, v1beta1Note.kind) &&
        Objects.equals(this.relatedUrl, v1beta1Note.relatedUrl) &&
        Objects.equals(this.expirationTime, v1beta1Note.expirationTime) &&
        Objects.equals(this.createTime, v1beta1Note.createTime) &&
        Objects.equals(this.updateTime, v1beta1Note.updateTime) &&
        Objects.equals(this.relatedNoteNames, v1beta1Note.relatedNoteNames) &&
        Objects.equals(this.vulnerability, v1beta1Note.vulnerability) &&
        Objects.equals(this.build, v1beta1Note.build) &&
        Objects.equals(this.baseImage, v1beta1Note.baseImage) &&
        Objects.equals(this._package, v1beta1Note._package) &&
        Objects.equals(this.deployable, v1beta1Note.deployable) &&
        Objects.equals(this.discovery, v1beta1Note.discovery) &&
        Objects.equals(this.attestationAuthority, v1beta1Note.attestationAuthority);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, shortDescription, longDescription, kind, relatedUrl, expirationTime, createTime, updateTime, relatedNoteNames, vulnerability, build, baseImage, _package, deployable, discovery, attestationAuthority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1Note {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    relatedUrl: ").append(toIndentedString(relatedUrl)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    relatedNoteNames: ").append(toIndentedString(relatedNoteNames)).append("\n");
    sb.append("    vulnerability: ").append(toIndentedString(vulnerability)).append("\n");
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    baseImage: ").append(toIndentedString(baseImage)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    deployable: ").append(toIndentedString(deployable)).append("\n");
    sb.append("    discovery: ").append(toIndentedString(discovery)).append("\n");
    sb.append("    attestationAuthority: ").append(toIndentedString(attestationAuthority)).append("\n");
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
