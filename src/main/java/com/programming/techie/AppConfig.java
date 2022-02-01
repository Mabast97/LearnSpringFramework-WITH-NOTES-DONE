package com.programming.techie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

// This class provides the configuration for our classes that we used by the Annotation technique. It means that
// this class is the replacement of the xml file configuration. And it is responsible for giving you the objects.
@ComponentScan(basePackages = "com.programming.techie")  // used to tell the program to search inside the package
// for the components instead of using @Bean here for every object that we want.
public class AppConfig {

    @Bean(name = "basicSpellChecker", initMethod = "init", destroyMethod = "destroy")
    public BasicSpellChecker createBasicSpellChecker() {
        return new BasicSpellChecker();
    }
//
//    @Bean(name = "advancedSpellChecker")
//    public AdvancedSpellChecker createAdvancedSpellChecker() {
//        return new AdvancedSpellChecker();
//    }
//
//    @Bean(name = "emailClient")
//    public EmailClient createEmailClient() {
//        EmailClient emailClient = new EmailClient();
//        emailClient.setSpellChecker(createAdvancedSpellChecker());
//        return emailClient;
//    }
}
