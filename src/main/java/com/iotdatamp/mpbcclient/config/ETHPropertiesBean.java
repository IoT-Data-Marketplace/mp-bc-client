package com.iotdatamp.mpbcclient.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class ETHPropertiesBean {

    @Value("${mp.ethereum.clientUrl}")
    private String clientUrl;

    @Value("${mp.ethereum.accountPrivateKey}")
    private String accountPrivateKey;

}
