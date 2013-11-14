package character;

import diceroller.DiceRoller;
import main.SaveStateTracker;
import java.io.Serializable;

/**
 * Health management for a character.
 *
 * @author Japhez
 */
public class CharacterHealth extends SaveStateTracker implements Serializable {

    private static final long serialVersionUID = 1L;
    private Player player;
    private int maxHitPoints;
    private int wounds;
    private int nonlethalDamage;

    public CharacterHealth(Player player) {
        this.player = player;
        wounds = 0;
        nonlethalDamage = 0;
        super.stateChanged = true;
    }

    //Roll initial hitpoints based off of character class
    public void rollInitialHitPoints() {
        maxHitPoints = DiceRoller.rollDice(1, player.getClassInfo().getInitialClass().getHitDie()).getTotalRoll();
        super.stateChanged = true;
    }

    public int getMaxHitPoints() {
        super.stateChanged = true;
        return maxHitPoints;
    }

    public void takeDamage(int damage) {
        wounds += damage;
        super.stateChanged = true;
    }

    public void takeNonlethalDamage(int damage) {
        nonlethalDamage += damage;
        super.stateChanged = true;
    }

    public int getCurrentHealth() {
        super.stateChanged = true;
        return maxHitPoints - wounds;
    }

    public int getNonlethalDamage() {
        super.stateChanged = true;
        return nonlethalDamage;
    }

    public void heal(int hitpoints) {
        if (hitpoints > wounds) {
            wounds = 0;
        } else {
            wounds -= hitpoints;
        }
        super.stateChanged = true;
    }
}
