package com.iotdatamp.mpbcclient.controller;

import com.iotdatamp.mpbcclient.dto.SensorDTO;
import com.iotdatamp.mpbcclient.service.SensorContractService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sensors")
@RequiredArgsConstructor
public class SensorController {

    private final SensorContractService sensorService;

    @GetMapping
    public ResponseEntity<?> getSensorForContractAddress(@RequestParam String sensorContractAddress) {
        return sensorService.getSensorForContractAddress(sensorContractAddress);
    }

    @GetMapping(path = "/owner")
    public ResponseEntity<Boolean> getSensorForContractAddress(@RequestParam String sensorContractAddress, @RequestParam String entityContractAddress) {
        return sensorService.isGivenEntitySensorOwner(sensorContractAddress, entityContractAddress);
    }

    @PostMapping(path = "/status")
    public ResponseEntity<?> setSensorStatus(@RequestBody SensorDTO sensor) {
        return sensorService.setSensorStatus(sensor);
    }

}
