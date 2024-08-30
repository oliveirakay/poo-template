package main;

public class Triangulo extends Poligono{
    public Triangulo(Ponto p1, Ponto p2, Ponto p3){
        super(new Ponto[]{p1, p2, p3});
    }

    @Override
    public void Poligono (Ponto[] pontos){
        if(!(pontos.length > 3 || pontos.length < 2)){
             
        }
    }
    
}
