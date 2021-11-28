package persistencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Clase encargada de manejar los archivos csv
 * @author Juan Camilo Uni Lara y Yenny Maria Burbano Castillo
 */
public class ManejoArchivo {

    /**
     * Metodo encargado de obtener el File de una ruta seleccionada
     * @return archivo, Tipo File de la ruta seleccionada
     * @throws persistencia.ArchivoException , cuando se cancela la seleccion
     */
    public File leerRuta() throws ArchivoException {
        JFileChooser ventanacargar = new JFileChooser();
        ventanacargar.setFileFilter(new FileNameExtensionFilter("*.csv","csv"));
        ventanacargar.setAcceptAllFileFilterUsed(false);
        ventanacargar.showOpenDialog(ventanacargar);
        File archivo = ventanacargar.getSelectedFile();
        if (archivo == null) {
            throw new ArchivoException("No se selecciono ningun archivo");
        }
        return archivo;
    }

    /**
     * Metodo encargado de recorrer el csv seleccionado y regresarlo en formato
     * List de Strings
     * @param archivo , Tipo File del csv seleccionado
     * @return listaEstudiantes, con todos los estudiantes en un arraylist
     * @throws java.io.FileNotFoundException , cuando se ingresa una ruta no existente
     */
    public List<String> recorrerArchivo(File archivo) throws FileNotFoundException,
            NullPointerException {
        List<String> listaEstudiantes = new ArrayList<String>();
        Scanner in = new Scanner(archivo);
        in.useDelimiter("\\n");
        if (in.hasNextLine()){
            in.nextLine();
        }
        while (in.hasNextLine()) {
            listaEstudiantes.add(in.next());
        }
        return listaEstudiantes;
    }
}
