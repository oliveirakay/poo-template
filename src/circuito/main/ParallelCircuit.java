package circuito.main;

/**
 * ParallelCircuit
 */
public class ParallelCircuit extends CompositeCircuit{


    public ParallelCircuit(Circuit[] circuits){
        this.circuits = circuits;
    }

    @Override
    public double getResistence() {

        double totalParallelResistance = 0;
        for (Circuit circuit : circuits) {
            totalParallelResistance += 1/circuit.getResistence();
        }
        return totalParallelResistance;
    }
}