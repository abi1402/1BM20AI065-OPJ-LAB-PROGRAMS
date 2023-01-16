class Temperature {
    private double temp;

    public Temperature(double temp) {
        this.temp = temp;
    }

    public void testTemperature() throws Exception {
        if (temp == 0) {
            throw new Exception("Temperature cannot be zero.");
        } else {
            System.out.println("Temperature is valid.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Temperature temp = new Temperature(0);
        try {
            temp.testTemperature();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
