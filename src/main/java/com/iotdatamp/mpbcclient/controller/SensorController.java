package com.iotdatamp.mpbcclient.controller;

import com.iotdatamp.mpbcclient.service.SensorContractService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensors")
@RequiredArgsConstructor
public class SensorController {

    private final SensorContractService sensorService;

    @GetMapping
    public ResponseEntity<?> getSensorForContractAddress(@RequestParam String sensorContractAddress) {
        return sensorService.getSensorForContractAddress(sensorContractAddress);
    }

}
