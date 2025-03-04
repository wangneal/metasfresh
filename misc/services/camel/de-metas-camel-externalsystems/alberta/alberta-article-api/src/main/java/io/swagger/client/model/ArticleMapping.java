/*
 * Artikel - Warenwirtschaft (Basis)
 * Synchronisation der Artikel mit Kumavision
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
/**
 * ArticleMapping
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-02-18T14:17:41.660Z[GMT]")
public class ArticleMapping {
  @SerializedName("_id")
  private UUID _id = null;

  @SerializedName("customerId")
  private String customerId = null;

  @SerializedName("updated")
  private OffsetDateTime updated = null;

  public ArticleMapping _id(UUID _id) {
    this._id = _id;
    return this;
  }

   /**
   * Alberta-Id des Artikels
   * @return _id
  **/
  @Schema(example = "a4adecb6-126a-4fa6-8fac-e80165ac4264", required = true, description = "Alberta-Id des Artikels")
  public UUID getId() {
    return _id;
  }

  public void setId(UUID _id) {
    this._id = _id;
  }

  public ArticleMapping customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * eindeutige Artikelnummer aus WaWi
   * @return customerId
  **/
  @Schema(example = "43435", required = true, description = "eindeutige Artikelnummer aus WaWi")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public ArticleMapping updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Der Zeitstempel der letzten Änderung
   * @return updated
  **/
  @Schema(example = "2019-11-28T08:37:39.637Z", description = "Der Zeitstempel der letzten Änderung")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleMapping articleMapping = (ArticleMapping) o;
    return Objects.equals(this._id, articleMapping._id) &&
        Objects.equals(this.customerId, articleMapping.customerId) &&
        Objects.equals(this.updated, articleMapping.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_id, customerId, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleMapping {\n");
    
    sb.append("    _id: ").append(toIndentedString(_id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
