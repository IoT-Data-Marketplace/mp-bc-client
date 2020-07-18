package com.iotdatamp.mpbcclient.controller;

import com.iotdatamp.mpbcclient.service.DSPService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dsp")
@RequiredArgsConstructor
public class DSPController {

    private final DSPService dspService;

    @GetMapping
    public ResponseEntity<?> isDSPRegisteredForContractAddress(
            @RequestParam String dspAccountAddress,
            @RequestParam String dspContractAddress) {
        return dspService.isDSPRegisteredForContractAddress(dspAccountAddress, dspContractAddress);
    }

}
