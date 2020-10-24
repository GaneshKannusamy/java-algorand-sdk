package com.algorand.algosdk.ganesh;

import com.algorand.algosdk.algod.client.AlgodClient;
import com.algorand.algosdk.algod.client.ApiException;
import com.algorand.algosdk.algod.client.api.AlgodApi;
import com.algorand.algosdk.algod.client.auth.ApiKeyAuth;
import com.algorand.algosdk.algod.client.model.NodeStatus;


public class AlgoConnect {

    public static void main(String args[]) throws Exception {
        final String ALGOD_API_ADDR = "http://localhost:4001";
        final String ALGOD_API_TOKEN = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

        AlgodClient client = new AlgodClient();
        client.setBasePath(ALGOD_API_ADDR);
        ApiKeyAuth api_key = (ApiKeyAuth) client.getAuthentication("api_key");
        api_key.setApiKey(ALGOD_API_TOKEN);

        AlgodApi algodApiInstance = new AlgodApi(client);
        try {
            NodeStatus status = algodApiInstance.getStatus();
            System.out.println("Algorand network status: " + status);
        } catch (ApiException e) {
            System.err.println("Exception when calling algod#getStatus");
            e.printStackTrace();
        }
    }

}