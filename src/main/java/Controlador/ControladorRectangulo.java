/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.Punto;
import Modelo.Rectangulo;
/**
 *
 * @author USUARIO
 */
public class ControladorRectangulo {
    private Rectangulo rectangulo;
    
    public void CrearRectangulo(double x1, double y1, double x2, double y2) {
        Punto p1 = new Punto(x1, y1);
        Punto p2 = new Punto(x2, y2);
        this.rectangulo = new Rectangulo(p1, p2);
    }
    public boolean HayRectangulo(){
        return rectangulo !=null;
    }
    public double ObtenerArea() {
        return rectangulo.calcularArea();
    }
    public void MoverRectangulo(double dx, double dy) {
        if (rectangulo != null) {
            rectangulo.mover(dx, dy);
        }
    }
    public void EscalarRectangulo(double factor) {
        if (rectangulo != null) {
            rectangulo.escalar(factor);
        }
    }
    public boolean EsPuntoDentro(double x, double y) {
    if (rectangulo == null) {
        return false;
    }

    double minX = Math.min(rectangulo.getP1().getX(), rectangulo.getP2().getX());
    double maxX = Math.max(rectangulo.getP1().getX(), rectangulo.getP2().getX());
    double minY = Math.min(rectangulo.getP1().getY(), rectangulo.getP2().getY());
    double maxY = Math.max(rectangulo.getP1().getY(), rectangulo.getP2().getY());

  
    if (x >= minX) {
        if (x <= maxX) {
            if (y >= minY) {
                if (y <= maxY) {
                    return true; 
                }
            }
        }
    }
    

    return false; 
}
    public String obtenerDatosRectangulo() {
        if (rectangulo == null) return "No se ha creado ningún rectángulo.";
        return "Vértice 1: " + rectangulo.getP1() + "\n" +
               "Vértice 2: " + rectangulo.getP2() + "\n" +
               "Base: "  + (rectangulo.Base()) + "\n" +
               "Altura: " + (rectangulo.Altura()) + "\n" +
               "Área: " +  (rectangulo.calcularArea());
    }
}
