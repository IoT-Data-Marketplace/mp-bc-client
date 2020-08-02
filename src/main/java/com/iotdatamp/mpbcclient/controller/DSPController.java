package com.iotdatamp.mpbcclient.controller;

import com.iotdatamp.mpbcclient.service.DSPService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/dsp")
@RequiredArgsConstructor
public class DSPController {

    private final DSPService dspService;

    @GetMapping
    public ResponseEntity<?> isDSPRegisteredForContractAddress(
            @RequestParam String dspAccountAddress,
            @RequestParam String dspContractAddress) {
        log.debug("isDSPRegisteredForContractAddress called for dspAccountAddress: ".concat(dspAccountAddress).concat(" and dspContractAddress: ".concat(dspContractAddress)));
        return dspService.isDSPRegisteredForContractAddress(dspAccountAddress, dspContractAddress);
    }

}
