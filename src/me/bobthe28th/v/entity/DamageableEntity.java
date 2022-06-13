package me.bobthe28th.v.entity;

import me.bobthe28th.v.util.BoundingBox;

public abstract class DamageableEntity extends Entity {

    double health = 0.0;
    double maxHealth = 0.0;
    BoundingBox hurtBox;

    void damage(double amount) {
        health = Math.max(0,health - amount);
    }
    void damage(double amount, Entity source) {
        health = Math.max(0,health - amount);
    }

    void setHealth(double health) {
        this.health = health;
    }

    void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    double getHealth() {
        return health;
    }

    double getMaxHealth() {
        return maxHealth;
    }
}
