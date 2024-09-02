package circuito.main;


/**
 * SerialCircuit
 */
public class SerialCircuit extends CompositeCircuit{
    @Override
    public double getResistance() {
        double totalSerialResistance = 0;
        for (Circuit circuit : circuits) {
            totalSerialResistance += circuit.getResistance();
        }
        return totalSerialResistance;
    }

    public SerialCircuit (Circuit[] circuits){
        super(circuits);// Duvida, eu aqui estou copiando a referencia de um ponteiro ou eh uma memoria nova?

    }
}
