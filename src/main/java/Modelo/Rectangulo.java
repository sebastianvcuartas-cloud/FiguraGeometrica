/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author USUARIO
 */
public class Rectangulo extends FiguraGeometrica {
   private Punto p1; 
   private Punto p2; 
   
   public Rectangulo(Punto p1, Punto p2) {
        super("Rectángulo");
        this.p1 = p1;
        this.p2 = p2;
   }

    public Punto getP1() {
        return p1;
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }
    public double Base() {
        return Math.abs(p2.getX() - p1.getX());
    }
    public double Altura() {
        return Math.abs(p2.getY() - p1.getY());
    }
    @Override
    public double calcularArea() {
        return Base() * Altura();
    }
    @Override
    public void mover(double difX, double difY) {
        p1.setX(p1.getX() + difX);
        p1.setY(p1.getY() + difY);
        p2.setX(p2.getX() + difX);
        p2.setY(p2.getY() + difY);
    }
    public void escalar(double factor) {
        double nuevaBase = Base() * factor;
        double nuevaAltura = Altura() * factor;
        
     
        double minX = Math.min(p1.getX(), p2.getX());
        double minY = Math.min(p1.getY(), p2.getY());
        
        p1.setX(minX);
        p1.setY(minY);
        p2.setX(minX + nuevaBase);
        p2.setY(minY + nuevaAltura);
    }
}
