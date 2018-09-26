package de.bautzswe.cdi.service;


import de.bautzswe.cdi.model.ITelegramm;
import de.bautzswe.cdi.model.WinCCTelegramm;

import javax.ejb.Stateless;

/**
 * Created by timbautz on 23.05.17.
 */
@ITelegrammType(type = WinCCTelegramm.class)
@Stateless
public class WinCCTelegrammVerarbeiter implements ITelelegrammVerarbeiter{

    public void verarbeite(ITelegramm telegramm) {

    }
}
