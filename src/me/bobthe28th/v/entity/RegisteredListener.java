package me.bobthe28th.v.entity;

import me.bobthe28th.v.event.EventHandler;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class RegisteredListener {

    Listener listener;
    ArrayList<Method> eventMethods = new ArrayList<>();

    public RegisteredListener(Listener listener) {
        this.listener = listener;
        Method[] methods = listener.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(EventHandler.class)) {
                eventMethods.add(method);
            }
        }
    }

    public Listener getListener() {
        return listener;
    }

    public ArrayList<Method> getEventMethods() {
        return eventMethods;
    }

}
