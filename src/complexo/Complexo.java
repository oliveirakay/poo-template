package complexo;


public class Complexo {
    double real;
    double imaginario;

    Complexo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complexo adiciona(Complexo c){
        return new Complexo(this.real + c.real,this.imaginario + c.imaginario);
    }

    public Complexo subtrai(Complexo c){
        return new Complexo(this.real - c.real,this.imaginario - c.imaginario);
    }

    public Complexo multiplica(Complexo c){
        this.printaInput(c);
       
        double a = (this.real*c.real-this.imaginario*c.imaginario);
        double b = (this.real*c.imaginario+this.imaginario*c.real);
        return new Complexo(a,b);
    }
    public Complexo divide(Complexo c){ 
        this.printaInput(c);
                                                                        
        double r = (this.real*c.real+this.imaginario*c.imaginario)/(c.real*c.real+c.imaginario*c.imaginario);
        double i = (this.imaginario*c.real-this.real*c.imaginario)/(c.real*c.real+c.imaginario*c.imaginario);
        return new Complexo(r,i);
    }
    public String converteParaString(){
        return String.format("%.2f + %.2fi", this.real, this.imaginario);
    }
    public void printaInput(Complexo k){
         System.out.printf("a: %f%n", k.real);
         System.out.printf("b: %f%n", k.imaginario);
    }


}