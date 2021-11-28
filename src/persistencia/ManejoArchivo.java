package persistencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 * Clase encargada de manejar los archivos csv
 * @author Juan Camilo Uni Lara, Yenny Maria Burbano Castillo
 */
public class ManejoArchivo {
    
    /**
     * Metodo encargado de obtener el File de una ruta seleccionada.
     * @return archivo, Tipo File de la ruta seleccionada
     */
    public File leerRuta(){
        JFileChooser ventanacargar = new JFileChooser();
        ventanacargar.showOpenDialog(ventanacargar);
        File archivo = ventanacargar.getSelectedFile();
        return archivo;   
    }
    
    /**
     * Metodo encargado de recorrer el csv seleccionado y regresarlo en
     * formato List<String>
     * @param archivo , Tipo File del csv seleccionado
     * @return listaEstudiantes, con todos los estudiantes en un arraylist
     */
    public List<String> recorrerArchivo(File archivo){
        List<String> listaEstudiantes = new ArrayList<String>();
        try {
            Scanner in = new Scanner(archivo);
            in.useDelimiter("\\n");
            in.nextLine();   
            while (in.hasNextLine())
            {
                listaEstudiantes.add(in.next());
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManejoArchivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaEstudiantes; 
    }
}
