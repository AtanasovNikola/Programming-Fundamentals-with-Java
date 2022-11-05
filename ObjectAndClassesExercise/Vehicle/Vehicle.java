package ObjectAndClassesExercise.Vehicle;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private String horsePower;

    public Vehicle(String type, String model, String color, String horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getType() {
        String s = type.substring(0, 1).toUpperCase() + type.substring(1);
        return s;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public String getHorsePower() {
        return this.horsePower;
    }
}
