class ControlPanelTest {
    public static void main(String[] args) {
        new ControlPanel().control();
    }
}
class Altimeter {
    @Override
    public String toString() {
        return "Measure air pressure";
    }
}
class AirGauge {
    @Override
    public String toString() {
        return "Measure height";
    }
}
class ControlPanel {
    private AirGauge airGauge = new AirGauge();
    private Altimeter altimeter = new Altimeter();

    public void control() {
        System.out.println(airGauge.toString());
        System.out.println(altimeter.toString());
    }
}