package de.bautzswe.cdi.service;

import de.bautzswe.cdi.model.AsciiTelegramm;
import de.bautzswe.cdi.model.ITelegramm;

import javax.ejb.Stateless;

/**
 * Created by timbautz on 24.05.17.
 */

@ITelegrammType(type = AsciiTelegramm.class)
@Stateless
public class AsciiTelegrammVerarbeiter implements ITelelegrammVerarbeiter {
    public void verarbeite(ITelegramm telegramm) {

    }
}
