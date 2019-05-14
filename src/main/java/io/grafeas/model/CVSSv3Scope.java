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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets CVSSv3Scope
 */
@JsonAdapter(CVSSv3Scope.Adapter.class)
public enum CVSSv3Scope {
  UNSPECIFIED("SCOPE_UNSPECIFIED"),
  UNCHANGED("SCOPE_UNCHANGED"),
  CHANGED("SCOPE_CHANGED");

  private String value;

  CVSSv3Scope(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CVSSv3Scope fromValue(String text) {
    for (CVSSv3Scope b : CVSSv3Scope.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CVSSv3Scope> {
    @Override
    public void write(final JsonWriter jsonWriter, final CVSSv3Scope enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CVSSv3Scope read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CVSSv3Scope.fromValue(String.valueOf(value));
    }
  }
}
