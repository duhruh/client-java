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
import io.grafeas.model.ImageFingerprint;
import io.grafeas.model.ImageLayer;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Derived describes the derived image portion (Occurrence) of the DockerImage relationship. This image would be produced from a Dockerfile with FROM &lt;DockerImage.Basis in attached Note&gt;.
 */
@Schema(description = "Derived describes the derived image portion (Occurrence) of the DockerImage relationship. This image would be produced from a Dockerfile with FROM <DockerImage.Basis in attached Note>.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T11:00:24.051-07:00[America/Los_Angeles]")public class ImageDerived {

  @SerializedName("fingerprint")
  private ImageFingerprint fingerprint = null;

  @SerializedName("distance")
  private Integer distance = null;

  @SerializedName("layer_info")
  private List<ImageLayer> layerInfo = null;

  @SerializedName("base_resource_url")
  private String baseResourceUrl = null;
  public ImageDerived fingerprint(ImageFingerprint fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  

  /**
  * Get fingerprint
  * @return fingerprint
  **/
  @Schema(description = "")
  public ImageFingerprint getFingerprint() {
    return fingerprint;
  }
  public void setFingerprint(ImageFingerprint fingerprint) {
    this.fingerprint = fingerprint;
  }
  /**
  * Output only. The number of layers by which this image differs from the associated image basis.
  * @return distance
  **/
  @Schema(description = "Output only. The number of layers by which this image differs from the associated image basis.")
  public Integer getDistance() {
    return distance;
  }
  public ImageDerived layerInfo(List<ImageLayer> layerInfo) {
    this.layerInfo = layerInfo;
    return this;
  }

  public ImageDerived addLayerInfoItem(ImageLayer layerInfoItem) {
    if (this.layerInfo == null) {
      this.layerInfo = new ArrayList<ImageLayer>();
    }
    this.layerInfo.add(layerInfoItem);
    return this;
  }

  /**
  * This contains layer-specific metadata, if populated it has length \&quot;distance\&quot; and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.
  * @return layerInfo
  **/
  @Schema(description = "This contains layer-specific metadata, if populated it has length \"distance\" and is ordered with [distance] being the layer immediately following the base image and [1] being the final layer.")
  public List<ImageLayer> getLayerInfo() {
    return layerInfo;
  }
  public void setLayerInfo(List<ImageLayer> layerInfo) {
    this.layerInfo = layerInfo;
  }
  /**
  * Output only. This contains the base image URL for the derived image occurrence.
  * @return baseResourceUrl
  **/
  @Schema(description = "Output only. This contains the base image URL for the derived image occurrence.")
  public String getBaseResourceUrl() {
    return baseResourceUrl;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageDerived imageDerived = (ImageDerived) o;
    return Objects.equals(this.fingerprint, imageDerived.fingerprint) &&
        Objects.equals(this.distance, imageDerived.distance) &&
        Objects.equals(this.layerInfo, imageDerived.layerInfo) &&
        Objects.equals(this.baseResourceUrl, imageDerived.baseResourceUrl);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(fingerprint, distance, layerInfo, baseResourceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageDerived {\n");
    
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    layerInfo: ").append(toIndentedString(layerInfo)).append("\n");
    sb.append("    baseResourceUrl: ").append(toIndentedString(baseResourceUrl)).append("\n");
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
