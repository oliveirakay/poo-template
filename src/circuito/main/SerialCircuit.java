package circuito.main;


/**
 * SerialCircuit
 */
public class SerialCircuit extends CompositeCircuit{
    @Override
    public double getResistence() {
        double totalSerialResistance = 0;
        for (Circuit circuit : circuits) {
            totalSerialResistance += circuit.getResistence();
        }
        return totalSerialResistance;
    }

    SerialCircuit (Circuit[] circuits){
        this.circuits = circuits; // Duvida, eu aqui estou copiando a referencia de um ponteiro ou eh uma memoria nova?

    }
}