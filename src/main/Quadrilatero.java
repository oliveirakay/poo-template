package main;

public abstract class Quadrilatero extends Poligono {
    public Quadrilatero(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        super(new Ponto[]{p1, p2, p3, p4});
    }
    @Override
    double altura() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    double perimetro() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    double largura() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    double area() {
        // TODO Auto-generated method stub
        return 0;
    }

}
