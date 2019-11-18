package com.ppg.man.hessian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.remoting.support.RemoteExporter;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class HessianConfig {

    @Autowired
    private Provider provider;

    @Bean(name = "/booking")
    public RemoteExporter bookingService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(provider);
        exporter.setServiceInterface(ProviderService.class);
        return exporter;
    }


}
