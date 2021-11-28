package control;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import persistencia.ManejoArchivo;

/**
 * Clase encargada de controlar todo el sistema de las
 * inscripciones de estudiantes.
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
     * Metodo queejecuta los metodos para cargar la listaEstudiantes
     * de un csv
     * @return archivo, Tipo File del csv seleccionado.
     */
    public File seleccionarRuta() {
        File archivo = manejoArchivo.leerRuta();
        listaEstudiantes = manejoArchivo.recorrerArchivo(archivo);
        return archivo;
    }
}
