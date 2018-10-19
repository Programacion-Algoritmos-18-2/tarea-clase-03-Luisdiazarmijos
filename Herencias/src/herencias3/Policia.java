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
public class Policia extends Persona {

    private String rango;

    public Policia(String n, String a, int e, String ran) {
        super(n, a, e);
        agregar_rango(ran);
    }

    public void agregar_rango(String ran) {
        rango = ran;

    }

    public String obtener_rango() {
        return rango;

    }

    @Override
    public String toString() {
        return String.format("%s - %s", super.toString(), obtener_rango());
    }

}
