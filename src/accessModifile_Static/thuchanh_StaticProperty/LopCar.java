package accessModifile_Static.thuchanh_StaticProperty;

public class LopCar {
    private  String name;
    private String engine;
    private static  int numberOfCar;

    public LopCar(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCar ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberOfCar() {
        return numberOfCar;
    }
}
