package circuito.main;

public class Resistor implements Circuit {
    private double resistance;
    @Override
    public double getResistance() {
        // TODO Auto-generated method stub
        return resistance;
    }

    public Resistor(double resistance){
        this.resistance = resistance;
    }
}
