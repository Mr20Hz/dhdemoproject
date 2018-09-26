package de.bautzswe.cdi.service;

import javax.enterprise.util.AnnotationLiteral;

/**
 * Created by timbautz on 23.05.17.
 */
public class TelegrammLiteral extends AnnotationLiteral<ITelegrammType> implements ITelegrammType {

    private Class clazz;

    public TelegrammLiteral(Class clazz){
        this.clazz = clazz;
    }


    public Class type() {
        return clazz;
    }
}
