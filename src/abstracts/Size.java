package abstracts;

import java.io.Serializable;

/**
 * Represents the size of a character. Contains all the standard sizes as inner
 * classes (which is what you should use). The attributes are all defined in the
 * inner classes.
 *
 * @author Japhez
 */
public abstract class Size implements Serializable {

    private static final long serialVersionUID = 1L;
    protected String name;
    protected int attackAndAcModifier;
    protected int specialAttacksModifier;
    protected int hideModifier;
    protected float carryingCapacityModifer;
    protected float quadCarryingCapacityModifer;

    public float getQuadCarryingCapacityModifer() {
        return quadCarryingCapacityModifer;
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * @return the attack and AC modifier
     */
    public int getAttackAndACModifier() {
        return attackAndAcModifier;
    }

    /**
     * @return get special attacks modifier (used for bull rush, grapple,
     * overrun, and trip
     */
    public int getSpecialAttacksModifier() {
        return specialAttacksModifier;
    }

    /**
     * @return the hide modifier
     */
    public int getHideModifier() {
        return hideModifier;
    }

    /**
     * @return the carrying capacity multiplier of this character
     */
    public float getCarryingCapacityMultiplier() {
        return carryingCapacityModifer;
    }

    public static class Fine extends Size {

        public Fine() {
            name = "Fine";
            attackAndAcModifier = 8;
            carryingCapacityModifer = 0.125f;
            quadCarryingCapacityModifer = 0.25f;
            hideModifier = 16;
            specialAttacksModifier = -16;
        }
    }

    public static class Diminutive extends Size {

        public Diminutive() {
            name = "Diminutive";
            attackAndAcModifier = 4;
            carryingCapacityModifer = 0.25f;
            quadCarryingCapacityModifer = 0.50f;
            hideModifier = 12;
            specialAttacksModifier = -12;
        }
    }

    public static class Tiny extends Size {

        public Tiny() {
            name = "Tiny";
            attackAndAcModifier = 2;
            carryingCapacityModifer = 0.5f;
            quadCarryingCapacityModifer = 0.75f;
            hideModifier = 8;
            specialAttacksModifier = -8;
        }
    }

    public static class Small extends Size {

        public Small() {
            name = "Small";
            attackAndAcModifier = 1;
            carryingCapacityModifer = 0.75f;
            quadCarryingCapacityModifer = 1f;
            hideModifier = 4;
            specialAttacksModifier = -4;
        }
    }

    public static class Medium extends Size {

        public Medium() {
            name = "Medium";
            attackAndAcModifier = 0;
            carryingCapacityModifer = 1f;
            quadCarryingCapacityModifer = 1.5f;
            hideModifier = 0;
            specialAttacksModifier = 0;
        }
    }

    public static class Large extends Size {

        public Large() {
            name = "Large";
            attackAndAcModifier = -1;
            carryingCapacityModifer = 2f;
            quadCarryingCapacityModifer = 3f;
            hideModifier = -4;
            specialAttacksModifier = 4;
        }
    }

    public static class Huge extends Size {

        public Huge() {
            name = "Huge";
            attackAndAcModifier = -2;
            carryingCapacityModifer = 4f;
            quadCarryingCapacityModifer = 6f;
            hideModifier = -8;
            specialAttacksModifier = 8;
        }
    }

    public static class Gargantuan extends Size {

        public Gargantuan() {
            name = "Gargantuan";
            attackAndAcModifier = -4;
            carryingCapacityModifer = 8f;
            quadCarryingCapacityModifer = 12f;
            hideModifier = -12;
            specialAttacksModifier = 12;
        }
    }

    public static class Colossal extends Size {

        public Colossal() {
            name = "Colossal";
            attackAndAcModifier = -8;
            carryingCapacityModifer = 16f;
            quadCarryingCapacityModifer = 24f;
            hideModifier = -16;
            specialAttacksModifier = 16;
        }
    }
}
