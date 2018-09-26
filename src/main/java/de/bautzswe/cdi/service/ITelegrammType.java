package de.bautzswe.cdi.service;

import de.bautzswe.cdi.model.ITelegramm;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by timbautz on 23.05.17.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface ITelegrammType {

    Class<? extends ITelegramm> type();
}
