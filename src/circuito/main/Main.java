package circuito.main;

public class Main {
    public static void main(String[] args) {
        Circuit[]circuits=new Circuit[]{
            new Resistor(1_000.0), 
            new Resistor(2_000.0),
            new ParallelCircuit(new Circuit[]{
                new Resistor(200.0),
                new Resistor(470.0)
            }),
            new Resistor(6_000.0)
            };
            SerialCircuit serial = new SerialCircuit(circuits);
            System.out.println(serial.getResistance());
            for(Circuit circuit:serial.getCircuits()){
                System.out.println(circuit.getResistance());
            };
    
            System.out.println("Circuito Paralelo:");
            Circuit[] circuitsk =new Circuit[]{
        
                new Resistor(200.0),
                new Resistor(470.0),
                new SerialCircuit(new Circuit[]{
                    new Resistor(1_000.0), 
                    new Resistor(2_000.0),
                }),
                new Resistor(220.0),
                new Resistor(130.0)
            };
        
        
            ParallelCircuit parallel = new ParallelCircuit(circuitsk);
        
            System.out.println(parallel.getResistance());
            for(Circuit circuit : parallel.getCircuits()){
                System.out.println(circuit.getResistance());
            }



            System.out.println("Testes CS:");
            Circuit[] aux = new Circuit[]{
        
                new Resistor(200.0),
                new Resistor(470.0),
                new SerialCircuit(new Circuit[]{
                    new Resistor(1_000.0), 
                    new Resistor(2_000.0),
                })};

            SerialCircuit meuCS = new SerialCircuit(aux);
            System.out.println(meuCS.getResistance());


            System.out.println("Testes PC: Case 3");

            ParallelCircuit meuPC = new ParallelCircuit(new Circuit[]{
        
                new SerialCircuit(new Circuit[]{
                    new Resistor(675263.9809), 
                    new Resistor(306802.2663),
                    new Resistor(399065.2875)
                }),
                new SerialCircuit(new Circuit[]{
                    new Resistor(87892.2752), 
                    new Resistor(757965.8368),
                    new Resistor(10852.1698),
                    new Resistor(430336.3280)
                }),
                new SerialCircuit(new Circuit[]{
                    new Resistor(68265.3576), 
                    new Resistor(486816.6071),
                    new Resistor(540108.8353)
                })

            });
            System.out.println(meuPC.getResistance());



            System.out.println("Testes PC: Case 3 Custom");

            ParallelCircuit meuPCs = new ParallelCircuit(new Circuit[]{
        
                new SerialCircuit(new Circuit[]{
                    new Resistor(100), 
                    new Resistor(100),
                    new Resistor(100)
                }),
                new SerialCircuit(new Circuit[]{
                    new Resistor(100), 
                    new Resistor(100),
                    new Resistor(100)
                }),
                new SerialCircuit(new Circuit[]{
                    new Resistor(100), 
                    new Resistor(100),
                    new Resistor(100)
                })

            });
            System.out.println(meuPCs.getResistance());

            SerialCircuit k = new SerialCircuit(new Circuit[]{
                new Resistor(100), 
                new Resistor(100),
                new Resistor(100)
            });
    
            System.out.println(k.getResistance());

            ParallelCircuit c = new ParallelCircuit (new Circuit[]{
                new Resistor(100), 
                new Resistor(100)
            });

            System.out.println(c.getResistance());









        }

        

    
}