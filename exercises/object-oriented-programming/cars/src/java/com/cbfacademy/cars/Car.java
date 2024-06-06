public class Car {

    private string make;
    private string model;
    private int year;
    private string colour;

    public Car(string make, string model, int year, string colour) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }
    
    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getYear() {
        return this.year;
    }

    public String getColour() {
        return this.colour;
    }

    public String setColour(String newColour) {
        this.colour = newColour;
    }

    public class Car {
        public static void main(String... args) {
            Car blueVolvo = new Car("Volvo", "V40", 2012, "blue");
            Car redPorsche = new Car("Porsche", "Panamera", 2009, "red");
            Car greyAudi = new Car("Audi", "A3", 2018, "grey");
        }
    }


}