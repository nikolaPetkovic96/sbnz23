package com.proj.security;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieModule;
import org.kie.api.runtime.KieContainer;
import org.kie.internal.io.ResourceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//https://medium.com/codex/spring-boot-with-drools-engine-7119774c559f
public class KieConf {
    private static final String drlFile = "rules/korisnikRules.drl";
    private static final String drlFileRest = "rules/restoranRules.drl";

    @Bean
    public KieContainer kieContainer() { 
        final KieServices kieServices = KieServices.Factory.get();
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        
        kieFileSystem.write(ResourceFactory.newClassPathResource(drlFile));
        //kieFileSystem.write(ResourceFactory.newClassPathResource(drlFileRest));

        KieBuilder kb = kieServices.newKieBuilder(kieFileSystem);
        kb.buildAll();
        KieModule kieModule = kb.getKieModule();
        return kieServices.newKieContainer(kieModule.getReleaseId());
    }
    
}
