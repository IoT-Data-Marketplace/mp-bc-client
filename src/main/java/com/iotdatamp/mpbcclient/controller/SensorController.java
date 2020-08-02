package com.iotdatamp.mpbcclient.controller;

import com.iotdatamp.mpbcclient.dto.SensorDTO;
import com.iotdatamp.mpbcclient.service.SensorContractService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/sensors")
@RequiredArgsConstructor
public class SensorController {

    private final SensorContractService sensorService;

    @GetMapping
    public ResponseEntity<?> getSensorForContractAddress(@RequestParam String sensorContractAddress) {
        log.debug("getSensorForContractAddress called for sensorContractAddress: ".concat(sensorContractAddress));
        return sensorService.getSensorForContractAddress(sensorContractAddress);
    }

    @GetMapping(path = "/owner")
    public ResponseEntity<Boolean> getSensorForContractAddress(@RequestParam String sensorContractAddress, @RequestParam String entityContractAddress) {
        log.debug("getSensorForContractAddress called for sensorContractAddress: ".concat(sensorContractAddress).concat(" and entityContractAddress: ".concat(entityContractAddress)));
        return sensorService.isGivenEntitySensorOwner(sensorContractAddress, entityContractAddress);
    }

    @PostMapping(path = "/status")
    public ResponseEntity<?> setSensorStatus(@RequestBody SensorDTO sensor) {
        log.debug("setSensorStatus called for sensor: ".concat(sensor.getSensorContractAddress()));
        return sensorService.setSensorStatus(sensor);
    }

}
