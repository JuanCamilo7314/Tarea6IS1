package control;

import entidades.Estudiante;
import entidades.ListaEstudiantes;
import entidades.ListaException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;
import persistencia.ArchivoException;
import persistencia.ManejoArchivo;

/**
 * Clase encargada de controlar todo el sistema de las inscripciones de
 * estudiantes.
 *
 * @author Juan Camilo Uni Lara, Yenny Maria Burbano Castillo
 */
public class Control {

    ManejoArchivo manejoArchivo;
    ListaEstudiantes listaEstudiantes;

    public Control() {
        manejoArchivo = new ManejoArchivo();
        listaEstudiantes = new ListaEstudiantes();
    }

    /**
     * Metodo queejecuta los metodos para cargar la listaEstudiantes de un csv
     *
     * @return archivo, Tipo File del csv seleccionado.
     */
    public File seleccionarRuta() {
        File archivo = null;
        try {
            archivo = manejoArchivo.leerRuta();
            try {
                listaEstudiantes.llenarLista(archivo);
            } catch (ListaException | FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } catch (ArchivoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return archivo;
    }

    public List<String> mostrarCantidadInscripciones() {
         List<String> listaInscripciones = new ArrayList<String>();
        try {
            List<Estudiante> listaEstudiante = listaEstudiantes.consultarEstudiante();
            listaInscripciones = contadorMaterias(listaEstudiante);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        Collections.sort(listaInscripciones);
        return listaInscripciones;
    }
    
    public void VaciarLista(){
        listaEstudiantes.vaciarLista();
    }

    public List<String> contadorMaterias(List<Estudiante> estudiantes) {
        List<String> listaInscripciones = new ArrayList<String>();
        for (Estudiante estudiante : estudiantes) {
            int cantidadMaterias = estudiante.cantidadMaterias();
            listaInscripciones.add("  "+estudiante.getNombre() + " - " + cantidadMaterias + " materias.");
        }
        return listaInscripciones;
    }
}
