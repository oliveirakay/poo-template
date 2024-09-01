package main;

public class Trapezio extends Quadrilatero{
    Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        super(p1, p2, p3, p4);
    }
    SegmentoReta baseMenor(){
        return new SegmentoReta(pontos[1],pontos[2]);
    }
    SegmentoReta baseMaior(){
        return new SegmentoReta(pontos[1],pontos[2]);
    }
    static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4){return true;}
}
