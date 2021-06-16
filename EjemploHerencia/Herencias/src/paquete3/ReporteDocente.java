/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Docente;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ReporteDocente extends Reporte {

    private double promedioS;
    private ArrayList<Docente> lista;

    public ReporteDocente(String c, ArrayList<Docente> d) {
        super(c);
        lista = d;
    }

    public void setLista(ArrayList<Docente> p) {
        lista = p;
    }

    public void setPromedioSueldo() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + getLista().get(i).getSueldo();
        }
        promedioS = suma / lista.size();
    }

    public ArrayList<Docente> getLista() {
        return lista;
    }

    public double getPromedioSueldo() {
        return promedioS;
    }

    @Override
    public String toString() {
        String cadena = "Reporte Docente\n";
        cadena = String.format("%s%s", cadena, super.toString());
        for (int i = 0; i < getLista().size(); i++) {
            Docente d = getLista().get(i);
            cadena = String.format("%s\nDocente(%d)\n"
                    + "Nombre: %s - Apellido: %s - Edad: %d - Sueldo: %.2f",
                    cadena, i + 1,
                    d.getNombre(),
                    d.getApellido(),
                    d.getEdad(),
                    d.getSueldo());
        }
        cadena = String.format("%s\nPromedio de sueldos: %.2f\n", cadena,
                getPromedioSueldo());
        return cadena;
    }

}
