package com.iotdatamp.mpbcclient.clients;

import com.iotdatamp.mpbcclient.config.ETHPropertiesBean;
import com.iotdatamp.mpbcclient.contract.Sensor;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Service;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.Contract;

import java.io.IOException;
import java.util.Optional;

@Log
@Service
@RequiredArgsConstructor
public class SensorContractClient {

    private final ETHPropertiesBean ethProperties;

    public Optional<Sensor> getSensorContractForAddress(String sensorContractAddress) {
        Web3j web3j = Web3j.build(new HttpService(ethProperties.getClientUrl()));
        try {
            web3j.web3ClientVersion().send().getWeb3ClientVersion();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Credentials credentials = Credentials.create(ethProperties.getAccountPrivateKey());

        Sensor sensor = Sensor.load(sensorContractAddress, web3j,
                credentials,
                Contract.GAS_PRICE,
                Contract.GAS_LIMIT);

        return Optional.ofNullable(sensor);
    }

}
