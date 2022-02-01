package com.programming.techie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // this makes the class dependent, makes them a component of a spring framework
           // which will be generated as per a requirement
class EmailClient {
    @Autowired //(It searches for the required object by its type not its name).
    // it means that this class needs a SpellChecker because you wrote @Autowired before SpellChecker object, it means that
    // you need this. And from the other class, you wrote @Component and because of that, the two classes can connect to each others
    // and give each others what they need, and that is called Dependency Injection.
    @Qualifier("advancedSpellChecker")
    private SpellChecker spellChecker;

    void sendEmail(String emailMessage) {
        System.out.println("inside EmailClient Class");
        spellChecker.checkSpelling(emailMessage);
        // Logic to Send Email
    }
}
