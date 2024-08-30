package main;

public class SegmentoReta extends ObjetoGeometrico {
    private final Ponto p1;
    private final Ponto p2;
    

    public SegmentoReta(Ponto p1, Ponto p2){
        this.p1 = new Ponto(p1);
        this.p2 = new Ponto(p2);
    }

    
    public Ponto getP1() {
        return p1;
    }
    public Ponto getP2() {
        return p2;
    }


    double comprimento(){
        return Math.sqrt((Math.pow(p1.getCoordX()-p2.getCoordX(),2) + Math.pow(p1.getCoordY()-p2.getCoordY(),2)));
    }

    double coeficienteAngular(){

        if(p1.getCoordX() == p2.getCoordX()) {
            return Double.POSITIVE_INFINITY;
        }
        return (p2.getCoordY()-p1.getCoordY())/(p2.getCoordX()-p1.getCoordX());

    }

    boolean paralelo(SegmentoReta s){
        if(s.coeficienteAngular() == this.coeficienteAngular()){
            return true;
        }
        return false;
    }

}
