package com.rental_dvd.editor;

import com.rental_dvd.entity.Actor;

import java.beans.PropertyEditorSupport;

public class ActorEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String idFromJsp) throws IllegalArgumentException {
        Actor actor = new Actor();
        actor.setId(Integer.parseInt(idFromJsp));
        setValue(actor);
    }
}
