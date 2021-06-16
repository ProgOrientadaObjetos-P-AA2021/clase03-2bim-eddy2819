/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import herencias2.Estudiante;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class ReporteEstudiante extends Reporte {

    private double promedio;
    private ArrayList<Estudiante> lista;

    public ReporteEstudiante(String c, ArrayList<Estudiante> e) {
        super(c);
        setLista(e);

    }

    public void setLista(ArrayList<Estudiante> l) {
        lista = l;
    }

    public void setPromedioMatricula() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + getLista().get(i).getMatricula();
        }
        promedio = suma / lista.size();
    }

    public ArrayList<Estudiante> getLista() {
        return lista;
    }

    public double getPromedioMatricula() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = "Reporte Estudiante\n";
        cadena = String.format("%s%s", cadena, super.toString());
        for (int i = 0; i < getLista().size(); i++) {
            Estudiante e = getLista().get(i);
            cadena = String.format("%s\nDocente(%d)\n"
                    + "Nombre: %s - Apellido: %s - Edad: %d - Sueldo: %.2f",
                    cadena, i + 1,
                    e.getNombre(),
                    e.getApellido(),
                    e.getEdad(),
                    e.getMatricula());
        }
        cadena = String.format("%s\nPromedio  sueldos es : %.2f\n", cadena,
                getPromedioMatricula());
        return cadena;
    }

}
