package de.bautzswe.cdi.service;

import de.bautzswe.cdi.model.ITelegramm;

import javax.ejb.Singleton;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

/**
 * Created by timbautz on 23.05.17.
 */

@Singleton
public class TelegrammVerarbeiterFactory {


    @Inject
    @Any
    private Instance<ITelelegrammVerarbeiter> telegrammVerarbeiter;

    public ITelelegrammVerarbeiter getTelegrammVerarbeiterFor(ITelegramm telegramm){
        TelegrammLiteral telegrammLiteral = new TelegrammLiteral(telegramm.getClass());
        Instance<ITelelegrammVerarbeiter> verarbeiter = telegrammVerarbeiter.select(telegrammLiteral);
        return verarbeiter.get();
    }

}
