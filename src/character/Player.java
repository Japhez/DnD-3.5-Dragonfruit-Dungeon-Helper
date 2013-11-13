package character;

import character.effects.EffectManager;
import character.inventory.CharacterInventory;
import interfaces.SaveStateTracker;

/**
 * The top level of a 3.5 character sheet. This is where the magic happens.
 *
 * @author Jacob Dorman
 */
public class Player extends SaveStateTracker {

    private CharacterBasicInfo basicInfo;
    private CharacterHealth health;
    private CharacterClassInfo classInfo;
    private CharacterAbilityScore abilityScore;
    private CharacterAttack attack;
    private CharacterDefense defense;
    private CharacterProficiencies proficiencies;
    private CharacterInventory inventory;
    private EffectManager effectManager;
    private CharacterSkills skills;
    //private HashMap<String, Ability> abilities;
    //private HashMap<String, WeaponProficiency> proficiencies;
    //private HashMap<String, ArmorProficiency> armorProficiencies;
    //Player feats
    //private int currentHealth;
    //private int maxHealth;
    //Player spell uses
    //private int ac;
    //private int initiative;
    // private int playerWeight;
    //private HashMap<String, Spell> spells;
    //private int hitRollModifier;
    //Player stats
    //private HashMap<String, Condition> conditions;
    //Player inventory as item description and weight
    //private Weapon equippedWeapon;

    public Player() {
        basicInfo = new CharacterBasicInfo();
        classInfo = new CharacterClassInfo();
        health = new CharacterHealth(this);
        abilityScore = new CharacterAbilityScore();
        attack = new CharacterAttack();
        defense = new CharacterDefense(this);
        proficiencies = new CharacterProficiencies();
        inventory = new CharacterInventory();
        effectManager = new EffectManager(this);
        skills = new CharacterSkills(this);
    }

    public CharacterHealth getHealth() {
        return health;
    }

    public EffectManager getEffectManager() {
        return effectManager;
    }

    public CharacterProficiencies getProficiencies() {
        return proficiencies;
    }

    public CharacterClassInfo getClassInfo() {
        return classInfo;
    }

    public CharacterAttack getAttack() {
        return attack;
    }

    /**
     * @return the defense object
     */
    public CharacterDefense getDefense() {
        return defense;
    }

    /**
     * @return the ability score of this character
     */
    public CharacterAbilityScore getAbilityScore() {
        return abilityScore;
    }

    /**
     * @return the character info of this character
     */
    public CharacterBasicInfo getBasicInfo() {
        return basicInfo;
    }

    public CharacterInventory getInventory() {
        return inventory;
    }

    public void roundsPassed(int rounds) {
        effectManager.roundsPassed(rounds);
    }

    public void setProficiencies(CharacterProficiencies proficiencies) {
        this.proficiencies = proficiencies;
    }

    public void setEffectManager(EffectManager effectManager) {
        this.effectManager = effectManager;
    }

    public void setAbilityScore(CharacterAbilityScore abilityScore) {
        this.abilityScore = abilityScore;
    }

    public void setBasicInfo(CharacterBasicInfo characterInfo) {
        this.basicInfo = characterInfo;
    }

    public void setClassInfo(CharacterClassInfo classInfo) {
        this.classInfo = classInfo;
    }

    public void setDefense(CharacterDefense defense) {
        this.defense = defense;
    }

    public void setInventory(CharacterInventory inventory) {
        this.inventory = inventory;
    }

    public CharacterSkills getSkills() {
        return skills;
    }

    /**
     * @return true if character data has been changed.
     */
    @Override
    public boolean stateChanged() {
        return (basicInfo.stateChanged() || classInfo.stateChanged()
                || abilityScore.stateChanged() || attack.stateChanged()
                || defense.stateChanged() || proficiencies.stateChanged()
                || inventory.stateChanged() || effectManager.stateChanged()
                || skills.stateChanged());
    }

    @Override
    public void stateSaved() {
        basicInfo.stateSaved();
        classInfo.stateSaved();
        abilityScore.stateSaved();
        attack.stateSaved();
        defense.stateSaved();
        proficiencies.stateSaved();
        inventory.stateSaved();
        effectManager.stateSaved();
        skills.stateSaved();
    }
}
