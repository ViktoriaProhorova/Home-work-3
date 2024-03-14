public class Main {
    static Character tiushasCharacter = new Character("sarcastic",
            "logical/mathematical", "the highest",
            "sanguine", "average between extrovert and introvert");
    static Appearance tiushasAppearance = new Appearance("gray-blue", "medium",
            "thin", "pale", "classic", "10/10");
    static Body tiushasBody = new Body("2", "2",
            "2", "mesomorphic", "43");
    static SpecialTraits tiushasSpecialTraits = new SpecialTraits("tak",
            "to create funny nicknames for his wife", "to shake leg");


    public static void main(String[] args) {
        Human tiusha = new Human(tiushasCharacter, tiushasAppearance, tiushasBody, tiushasSpecialTraits);
        System.out.println("I will describe my awesome husband.\nHis name is Artem, but I call him Tiusha.");
        System.out.println("\nHis character:\nSense of humor - " + tiusha.getCharacterInstance().getSenseOfHumor() +
                "\nIntelligence - " + tiusha.getCharacterInstance().getIntelligence() +
                "\nCreativity level - " + tiusha.getCharacterInstance().getCreativityLevel() +
                "\nTemperament - " + tiusha.getCharacterInstance().getTemperament() +
                "\nPersonality type - " + tiusha.getCharacterInstance().getPersonalityType());
        System.out.println("\nHis appearance:\nEyes color - " + tiusha.getAppearanceInstance().getEyesColor() +
                "\nNose size - " + tiusha.getAppearanceInstance().getNoseSize() +
                "\nLip thickness - " + tiusha.getAppearanceInstance().getLipThickness() +
                "\nSkin tone - " + tiusha.getAppearanceInstance().getSkinTone() +
                "\nHair style - " + tiusha.getAppearanceInstance().getHairStyle() +
                "\nAppearance assessment - " + tiusha.getAppearanceInstance().getAppearanceAssessment());
        System.out.println("\nHis body:\nNumber of legs - " + tiusha.getBodyInstance().getNumberOfLegs() +
                "\nNumber of hands - " + tiusha.getBodyInstance().getNumberOfHands() +
                "\nNumber of eyes - " + tiusha.getBodyInstance().getNumberOfEyes() +
                "\nBody type - " + tiusha.getBodyInstance().getBodyType() +
                "\nFoot size - " + tiusha.getBodyInstance().getFootSize());
        System.out.println("\nHis special traits:\nFavourite word - " +
                tiusha.getSpecialTraitsInstance().getFavouriteWord() +
                "\nMain hobby - " + tiusha.getSpecialTraitsInstance().getMainHobby() +
                "\nFrequently repeated action - " + tiusha.getSpecialTraitsInstance().getFrequentlyRepeatedAction());
    }
}
