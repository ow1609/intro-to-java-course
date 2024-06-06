public class Car {

    private String make;
    private String model;
    private Integer year;
    private String colour;

    public Car(String make, String model, Integer year, String colour) {
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

    public Integer getYear() {
        return this.year;
    }

    public String getColour() {
        return this.colour;
    }

    public void setColour(String newColour) {
        this.colour = newColour;
    }

  
        Car blueVolvo = new Car("Volvo", "V40", 2012, "blue");
        Car redPorsche = new Car("Porsche", "Panamera", 2009, "red");
        Car greyAudi = new Car("Audi", "A3", 2018, "grey");
    
    }

