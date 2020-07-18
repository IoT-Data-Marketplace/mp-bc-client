package com.iotdatamp.mpbcclient.service;

import com.iotdatamp.mpbcclient.clients.DSPContractClient;
import com.iotdatamp.mpbcclient.contract.DataStreamEntity;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class DSPService {


    private final DSPContractClient dspContractClient;

    @SneakyThrows
    public ResponseEntity<?> isDSPRegisteredForContractAddress(String dspAccountAddress, String dspContractAddress) {
        DataStreamEntity dataStreamEntity = dspContractClient.getDataStreamEntityContractForOwnerAddress(dspContractAddress).get();
        return ResponseEntity.ok(dataStreamEntity.getDataStreamEntityOwnerAddress().send().equalsIgnoreCase(dspAccountAddress));
    }
}
