package me.bobthe28th.v.event;

import me.bobthe28th.v.entity.Listener;
import me.bobthe28th.v.entity.RegisteredListener;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class EventManager {

    static ArrayList<RegisteredListener> RegisteredListeners = new ArrayList<>();

    public static void registerEvents(Listener l) {
        RegisteredListeners.add(new RegisteredListener(l));
    }

    public static void callEvent(Event event) {
        RegisteredListeners.forEach((l) -> l.getEventMethods().forEach((m) -> {
            if (m.getParameterCount() == 1 && m.getParameterTypes()[0].equals(event.getClass())) {
                try {
                    m.invoke(l.getListener(), event);
                } catch (IllegalAccessException | InvocationTargetException ignored) {}
            }
        }));
    }

}
