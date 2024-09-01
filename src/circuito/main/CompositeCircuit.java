package circuito.main;

abstract class CompositeCircuit implements Circuit{
    protected Circuit[] circuits;
    
    public Circuit[] getCircuits() {
        return circuits;
    }
}
