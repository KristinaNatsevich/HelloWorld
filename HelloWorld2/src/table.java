public class table {
    int width;
    int length;
    int thinkness;
    Legs [] legs;

    public table (int width, int length, int thinkness, Legs [] legs) {
        this.width = width;
        this.length = length;
        this.thinkness = thinkness;
    }

    public Table (int width, int length, int thinkness, Legs legs, int numberOfLegs)
    {
        legs = new Legs[numberOfLegs];
        for (Leg leg1: legs) {
            leg1 = leg;
        }
    }
    public String getTableDiscription () {
        return String.format("Table are %d x %d x %d, it has %d legs with lengrh of %d",
                width, length, thinkness, legs.length, legs[0].length);
    }
}
