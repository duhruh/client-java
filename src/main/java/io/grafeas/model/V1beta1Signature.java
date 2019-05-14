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

/**
 * Verifiers (e.g. Kritis implementations) MUST verify signatures with respect to the trust anchors defined in policy (e.g. a Kritis policy). Typically this means that the verifier has been configured with a map from &#x60;public_key_id&#x60; to public key material (and any required parameters, e.g. signing algorithm).  In particular, verification implementations MUST NOT treat the signature &#x60;public_key_id&#x60; as anything more than a key lookup hint. The &#x60;public_key_id&#x60; DOES NOT validate or authenticate a public key; it only provides a mechanism for quickly selecting a public key ALREADY CONFIGURED on the verifier through a trusted channel. Verification implementations MUST reject signatures in any of the following circumstances:   * The &#x60;public_key_id&#x60; is not recognized by the verifier.   * The public key that &#x60;public_key_id&#x60; refers to does not verify the     signature with respect to the payload.  The &#x60;signature&#x60; contents SHOULD NOT be \&quot;attached\&quot; (where the payload is included with the serialized &#x60;signature&#x60; bytes). Verifiers MUST ignore any \&quot;attached\&quot; payload and only verify signatures with respect to explicitly provided payload (e.g. a &#x60;payload&#x60; field on the proto message that holds this Signature, or the canonical serialization of the proto message that holds this signature).
 */
@Schema(description = "Verifiers (e.g. Kritis implementations) MUST verify signatures with respect to the trust anchors defined in policy (e.g. a Kritis policy). Typically this means that the verifier has been configured with a map from `public_key_id` to public key material (and any required parameters, e.g. signing algorithm).  In particular, verification implementations MUST NOT treat the signature `public_key_id` as anything more than a key lookup hint. The `public_key_id` DOES NOT validate or authenticate a public key; it only provides a mechanism for quickly selecting a public key ALREADY CONFIGURED on the verifier through a trusted channel. Verification implementations MUST reject signatures in any of the following circumstances:   * The `public_key_id` is not recognized by the verifier.   * The public key that `public_key_id` refers to does not verify the     signature with respect to the payload.  The `signature` contents SHOULD NOT be \"attached\" (where the payload is included with the serialized `signature` bytes). Verifiers MUST ignore any \"attached\" payload and only verify signatures with respect to explicitly provided payload (e.g. a `payload` field on the proto message that holds this Signature, or the canonical serialization of the proto message that holds this signature).")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T11:23:37.921-07:00[America/Los_Angeles]")public class V1beta1Signature {

  @SerializedName("signature")
  private String signature = null;

  @SerializedName("public_key_id")
  private String publicKeyId = null;
  public V1beta1Signature signature(String signature) {
    this.signature = signature;
    return this;
  }

  

  /**
  * The content of the signature, an opaque bytestring. The payload that this signature verifies MUST be unambiguously provided with the Signature during verification. A wrapper message might provide the payload explicitly. Alternatively, a message might have a canonical serialization that can always be unambiguously computed to derive the payload.
  * @return signature
  **/
  @Schema(description = "The content of the signature, an opaque bytestring. The payload that this signature verifies MUST be unambiguously provided with the Signature during verification. A wrapper message might provide the payload explicitly. Alternatively, a message might have a canonical serialization that can always be unambiguously computed to derive the payload.")
  public String getSignature() {
    return signature;
  }
  public void setSignature(String signature) {
    this.signature = signature;
  }
  public V1beta1Signature publicKeyId(String publicKeyId) {
    this.publicKeyId = publicKeyId;
    return this;
  }

  

  /**
  * The identifier for the public key that verifies this signature.   * The &#x60;public_key_id&#x60; is required.   * The &#x60;public_key_id&#x60; MUST be an RFC3986 conformant URI.   * When possible, the &#x60;public_key_id&#x60; SHOULD be an immutable reference,     such as a cryptographic digest.  Examples of valid &#x60;public_key_id&#x60;s:  OpenPGP V4 public key fingerprint:   * \&quot;openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA\&quot; See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more details on this scheme.  RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER serialization):   * \&quot;ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU\&quot;   * \&quot;nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5\&quot;
  * @return publicKeyId
  **/
  @Schema(description = "The identifier for the public key that verifies this signature.   * The `public_key_id` is required.   * The `public_key_id` MUST be an RFC3986 conformant URI.   * When possible, the `public_key_id` SHOULD be an immutable reference,     such as a cryptographic digest.  Examples of valid `public_key_id`s:  OpenPGP V4 public key fingerprint:   * \"openpgp4fpr:74FAF3B861BDA0870C7B6DEF607E48D2A663AEEA\" See https://www.iana.org/assignments/uri-schemes/prov/openpgp4fpr for more details on this scheme.  RFC6920 digest-named SubjectPublicKeyInfo (digest of the DER serialization):   * \"ni:///sha-256;cD9o9Cq6LG3jD0iKXqEi_vdjJGecm_iXkbqVoScViaU\"   * \"nih:///sha-256;703f68f42aba2c6de30f488a5ea122fef76324679c9bf89791ba95a1271589a5\"")
  public String getPublicKeyId() {
    return publicKeyId;
  }
  public void setPublicKeyId(String publicKeyId) {
    this.publicKeyId = publicKeyId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1Signature v1beta1Signature = (V1beta1Signature) o;
    return Objects.equals(this.signature, v1beta1Signature.signature) &&
        Objects.equals(this.publicKeyId, v1beta1Signature.publicKeyId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(signature, publicKeyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1Signature {\n");
    
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    publicKeyId: ").append(toIndentedString(publicKeyId)).append("\n");
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
