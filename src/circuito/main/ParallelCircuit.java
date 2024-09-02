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

        double totalParallelResistance;
        double somatorio = 0;
        for (Circuit circuit : circuits) {
            somatorio += 1/circuit.getResistance();
        }
        totalParallelResistance = 1/somatorio;
        return totalParallelResistance;
    }
}