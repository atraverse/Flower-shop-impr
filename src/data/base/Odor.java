package data.base;

public enum Odor {
    SOFT("soft"),
    SHARP("sharp");

    private final String odor;

    Odor(String odor) {
        this.odor = odor;
    }

    @Override
    public String toString(){
        return "Odor{"+
                "name = '" + odor +'\''+'}';
    }
}
