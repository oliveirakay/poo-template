package circuito.main;

/**
 * ParallelCircuit
 */
public class ParallelCircuit extends CompositeCircuit{


    public ParallelCircuit(Circuit[] circuits){
        super(circuits);
    }

    @Override
    public double getResistance() {

        double totalParallelResistance = 0;
        for (Circuit circuit : circuits) {
            totalParallelResistance += 1/circuit.getResistance();
        }
        return totalParallelResistance;
    }
}