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
 * APIV1POSTWalletInfoResponse is the response to &#x60;POST /v1/wallet/info&#x60; friendly:WalletInfoResponse
 */
@ApiModel(description = "APIV1POSTWalletInfoResponse is the response to `POST /v1/wallet/info` friendly:WalletInfoResponse")

public class APIV1POSTWalletInfoResponse {
  @SerializedName("error")
  private Boolean error = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("wallet_handle")
  private APIV1WalletHandle walletHandle = null;

  public APIV1POSTWalletInfoResponse error(Boolean error) {
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

  public APIV1POSTWalletInfoResponse message(String message) {
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

  public APIV1POSTWalletInfoResponse walletHandle(APIV1WalletHandle walletHandle) {
    this.walletHandle = walletHandle;
    return this;
  }

   /**
   * Get walletHandle
   * @return walletHandle
  **/
  @ApiModelProperty(value = "")
  public APIV1WalletHandle getWalletHandle() {
    return walletHandle;
  }

  public void setWalletHandle(APIV1WalletHandle walletHandle) {
    this.walletHandle = walletHandle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    APIV1POSTWalletInfoResponse apIV1POSTWalletInfoResponse = (APIV1POSTWalletInfoResponse) o;
    return ObjectUtils.equals(this.error, apIV1POSTWalletInfoResponse.error) &&
    ObjectUtils.equals(this.message, apIV1POSTWalletInfoResponse.message) &&
    ObjectUtils.equals(this.walletHandle, apIV1POSTWalletInfoResponse.walletHandle);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(error, message, walletHandle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIV1POSTWalletInfoResponse {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    walletHandle: ").append(toIndentedString(walletHandle)).append("\n");
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

