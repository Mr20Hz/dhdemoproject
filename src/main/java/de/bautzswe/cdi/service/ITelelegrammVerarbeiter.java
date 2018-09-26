package de.bautzswe.cdi.service;

import de.bautzswe.cdi.model.ITelegramm;

/**
 * Created by timbautz on 23.05.17.
 */
public interface ITelelegrammVerarbeiter {

    void verarbeite(ITelegramm telegramm);
}
