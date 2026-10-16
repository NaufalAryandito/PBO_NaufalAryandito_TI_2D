public class RoadBike extends Bike {
    private int tireWidth;

    public void setTireWidth(int width) {
        tireWidth = width;
    }

    @Override
    public void PrintInfo() {
        super.PrintInfo();
        System.out.println("Tire Width: " + tireWidth+" mm");
}
}
