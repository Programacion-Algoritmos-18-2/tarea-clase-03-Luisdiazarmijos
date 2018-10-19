/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author USUARIO
 */
public class Docente extends Persona {

    private double sueldo;

    public Docente(String n, String a, int e, double s) {
        super(n, a, e);
        agregar_sueldo(s);


    }
    public void agregar_sueldo(double s) {
        sueldo = s;
    }
    public double obtener_sueldo(){
        return sueldo;
    }
 @Override
 public String toString(){
      return String.format("%s - %f", super.toString(), obtener_sueldo());
    
 }
    
}
  