public class SpecialTraits {
    private String favouriteWord;
    private String mainHobby;
    private String frequentlyRepeatedAction;

    public SpecialTraits() {
        this.favouriteWord = "Bla-bla";
        this.mainHobby = "Lying on the sofa";
        this.frequentlyRepeatedAction = "Rolling eyes";
    }

    public SpecialTraits(String favouriteWord, String mainHobby, String frequentlyRepeatedAction) {
        this.favouriteWord = favouriteWord;
        this.mainHobby = mainHobby;
        this.frequentlyRepeatedAction = frequentlyRepeatedAction;
    }

    public String getFavouriteWord() {
        return favouriteWord;
    }
    public String getMainHobby() {
        return mainHobby;
    }
    public String getFrequentlyRepeatedAction() {
        return frequentlyRepeatedAction;
    }
}
