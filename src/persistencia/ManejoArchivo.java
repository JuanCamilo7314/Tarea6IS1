/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Camilo Uni Lara, Yenny Maria Burbano Castillo
 */
public class ManejoArchivo {
    public File leerRuta(){
        JFileChooser ventanacargar = new JFileChooser();
        ventanacargar.showOpenDialog(ventanacargar);
        File archivo = ventanacargar.getSelectedFile();
        return archivo;   
    }
    
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
