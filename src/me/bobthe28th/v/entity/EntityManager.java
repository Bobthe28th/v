package me.bobthe28th.v.entity;

import java.util.HashSet;

public class EntityManager {

    static HashSet<Entity> entityList = new HashSet<>();

    public static void register(Entity entity) {
        entityList.add(entity);
    }

    public static HashSet<Entity> getEntityList() {
        return entityList;
    }
}
