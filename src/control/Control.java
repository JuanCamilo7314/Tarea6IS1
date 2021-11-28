package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
    List<String> listaEstudiantes;

    public Control() {
        manejoArchivo = new ManejoArchivo();
        listaEstudiantes = new ArrayList<String>();
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
                listaEstudiantes = manejoArchivo.recorrerArchivo(archivo);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } catch (ArchivoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return archivo;
    }
}
