package com.iotdatamp.mpbcclient.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.iotdatamp.mpbcclient.clients.SensorContractClient;
import com.iotdatamp.mpbcclient.contract.Sensor;
import com.iotdatamp.mpbcclient.dto.SensorDTO;
import com.iotdatamp.mpbcclient.dto.SensorStatus;
import com.iotdatamp.mpbcclient.dto.SensorType;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple6;

import java.math.BigInteger;

@Slf4j
@Service
@RequiredArgsConstructor
public class SensorContractService {

    private final SensorContractClient sensorContractClient;

    @SneakyThrows
    public ResponseEntity<?> getSensorForContractAddress(String sensorContractAddress) {

        Sensor sensor = sensorContractClient.getSensorContractForAddress(sensorContractAddress).orElseThrow(Exception::new);

        Tuple6<String, BigInteger, String, String, BigInteger, BigInteger> result = sensor.describeSensor().send();

        SensorDTO sensorDTO = SensorDTO.builder()
                .sensorContractAddress(sensorContractAddress)
                .dataStreamEntityContractAddress(result.component1())
                .sensorType(SensorType.values()[result.component2().intValue()])
                .latitude(Double.valueOf(result.component3()))
                .longitude(Double.valueOf(result.component4()))
                .sensorStatus(SensorStatus.values()[result.component5().intValue()])
                .pricePerDataUnit(result.component5().intValue())
                .build();

        ObjectMapper mapper = new ObjectMapper();
        log.info("Sensor fetched, values: " + mapper.writeValueAsString(sensorDTO));

        return ResponseEntity.ok().body(mapper.writeValueAsString(sensorDTO));
    }

    @SneakyThrows
    public ResponseEntity<?> setSensorStatus(SensorDTO sensor) {
        Sensor sensorContract = sensorContractClient.getSensorContractForAddress(sensor.getSensorContractAddress()).orElseThrow(Exception::new);

        TransactionReceipt transferReceipt = sensorContract.setSensorStatus(BigInteger.valueOf(sensor.getSensorStatus().ordinal())).send();

        log.info("Status for Sensor: ".concat(sensor.getSensorContractAddress()).concat(" set to: ").concat(sensor.getSensorStatus().toString())
                .concat("\nTransaction Hash: ").concat(transferReceipt.getTransactionHash()));

        return ResponseEntity.ok().body(transferReceipt.isStatusOK());
    }
}
