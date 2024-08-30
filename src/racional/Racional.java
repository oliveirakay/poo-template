package racional;

import java.util.ArrayList;

import biblioteca.Livro;


public class Racional {

    private int numerador;
    private int denominador;

    public int getDenominador() {
        return denominador;
    }
    public int getNumerador() {
        return numerador;
    }
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    Racional(int num, int den){
        int mdc = this.algoritmoEcuclidianoMdc(num, den);
        this.numerador = num/mdc;
        this.denominador = den/mdc;
    }

    public String converteParaString(){
        String retorno;
        if(this.numerador * this.denominador < 0 & this.denominador < 0) {
            retorno = (-1*this.numerador) + "/" + (-1*this.denominador)
        } else retorno = this.numerador + "/" + this.denominador; 
        return retorno;
    }

    public int algoritmoEcuclidianoMdc(int a, int b){
        if(a < b){
            return this.algoritmoEcuclidianoMdc(b, a);
        } else {
            int r;
            while (b != 0){
                r = a % b;
                a = b;
                b = r;
            }
        return a;
        }
    }

    public Racional adiciona (Racional c){
        return new Racional(c.getNumerador()*this.denominador+this.numerador*c.getDenominador(),c.getDenominador()*this.denominador);
    }

    public Racional subtrai (Racional c){
        return new Racional(this.numerador*c.getDenominador()-c.getNumerador()*this.denominador,c.getDenominador()*this.denominador);
    }

    public Racional multiplica (Racional c){
        return new Racional(this.numerador*c.getNumerador(),c.getDenominador()*this.denominador);
    }

    public Racional divide (Racional c){
        return new Racional(c.getNumerador()*this.denominador,this.numerador*c.getDenominador());
    }

    public boolean igual (Racional c){
        return (this.numerador == c.getNumerador() & this.denominador == c.getDenominador()) ? true  : false;
    }

   // public Racional simplificaRacional(Racional c){
        
  //  }
    //public ArrayList<Integer> mdcRacional (Racional c){
       // ArrayList<Integer> mdc = new ArrayList<Integer>();
        
       // while (true) {
         //   (c.getDenominador()/&)? :
           // return mdc;
       // }


        
   // }
}