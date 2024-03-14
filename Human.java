public class Human {
    String name;
    private Character characterInstance;
    private Appearance appearanceInstance;
    private Body bodyInstance;
    private SpecialTraits specialTraitsInstance;


    public Human() {
        this.characterInstance = new Character();
        this.appearanceInstance = new Appearance();
        this.bodyInstance = new Body();
        this.specialTraitsInstance = new SpecialTraits();
    }
    public Human(Character character, Appearance appearance, Body body, SpecialTraits specialTraits) {
        this.characterInstance = character;
        this.appearanceInstance = appearance;
        this.bodyInstance = body;
        this.specialTraitsInstance = specialTraits;
    }

    public Character getCharacterInstance() {
        return this.characterInstance;
    }

    public Appearance getAppearanceInstance() {
        return this.appearanceInstance;
    }

    public Body getBodyInstance() {
        return bodyInstance;
    }

    public SpecialTraits getSpecialTraitsInstance() {
        return specialTraitsInstance;
    }
}
