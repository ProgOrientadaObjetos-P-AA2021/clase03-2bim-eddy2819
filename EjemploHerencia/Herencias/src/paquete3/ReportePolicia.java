/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Policia;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ReportePolicia extends Reporte {

    private double promedioEdad;
    private ArrayList<Policia> listap;

    public ReportePolicia(String co, ArrayList<Policia> p) {
        super(co);
        setLista(p);
    }

    public void setLista(ArrayList<Policia> l) {
        listap = l;
    }

    public void setPromedioEdad() {
        double suma = 0;
        for (int i = 0; i < listap.size(); i++) {
            suma = suma + getLista().get(i).getEdad();
        }
        promedioEdad = suma / listap.size();
    }

    public ArrayList<Policia> getLista() {
        return listap;
    }

    public double getPromedioEdad() {
        return promedioEdad;
    }

    @Override
    public String toString() {
        String cadena = "Reporte Policia\n";
        cadena = String.format("%s%s", cadena, super.toString());
        for (int i = 0; i < getLista().size(); i++) {
            Policia po = getLista().get(i);
            cadena = String.format("%s\nPolicia(%d)\n"
                    + "Nombre: %s - Apellido: %s - Edad: %d - Rango: %s",
                    cadena, i + 1,
                    po.getNombre(),
                    po.getApellido(),
                    po.getEdad(),
                    po.getRango());
        }
        cadena = String.format("%s\nPromedio  edades es : %.2f\n", cadena,
                getPromedioEdad());
        return cadena;
    }

}
