/*
 * for KMD HTTP API
 * API for KMD (Key Management Daemon)
 *
 * OpenAPI spec version: 0.0.1
 * Contact: contact@algorand.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.algorand.algosdk.kmd.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

/**
 * APIV1POSTKeyExportResponse is the reponse to &#x60;POST /v1/key/export&#x60; friendly:ExportKeyResponse
 */
@ApiModel(description = "APIV1POSTKeyExportResponse is the reponse to `POST /v1/key/export` friendly:ExportKeyResponse")

public class APIV1POSTKeyExportResponse {
  @SerializedName("error")
  private Boolean error = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("private_key")
  private byte[] privateKey = null;

  public APIV1POSTKeyExportResponse error(Boolean error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public Boolean isError() {
    return error;
  }

  public void setError(Boolean error) {
    this.error = error;
  }

  public APIV1POSTKeyExportResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public APIV1POSTKeyExportResponse privateKey(byte[] privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Get privateKey
   * @return privateKey
  **/
  @ApiModelProperty(value = "")
  public byte[] getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(byte[] privateKey) {
    this.privateKey = privateKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    APIV1POSTKeyExportResponse apIV1POSTKeyExportResponse = (APIV1POSTKeyExportResponse) o;
    return ObjectUtils.equals(this.error, apIV1POSTKeyExportResponse.error) &&
    ObjectUtils.equals(this.message, apIV1POSTKeyExportResponse.message) &&
    ObjectUtils.equals(this.privateKey, apIV1POSTKeyExportResponse.privateKey);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(error, message, privateKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIV1POSTKeyExportResponse {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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

