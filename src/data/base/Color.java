package data.base;

public enum Color {
    RED("red"),
    GREEN("green"),
    BLUE("blue"),
    PINK("pink");

    private String color;

    Color(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "Color{"+
                "name = '" + color +'\''+'}';
    }
}
