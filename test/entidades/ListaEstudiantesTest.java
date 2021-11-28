/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Juan Camilo Uni Lara
 */
public class ListaEstudiantesTest {
    
    public ListaEstudiantesTest() {
    }

    @Test
    public void testAdicionarEstudiante() throws Exception {
        ListaEstudiantes listaEstudiantes = new ListaEstudiantes();
        List<String> lineasArchivos = new ArrayList<String>();
        lineasArchivos.add("1004442450,Juan Camilo Uni Lara,0001,Fisica I");
        lineasArchivos.add("1004442450,Juan Camilo Uni Lara,0002,Fisica II");
        listaEstudiantes.adicionarEstudiante(lineasArchivos);
        
        List<Estudiante> estudiantesPrueba = new ArrayList<Estudiante>();
        Estudiante estudiante = new Estudiante("1004442450", "Juan Camilo Uni Lara");
        estudiante.agregarMateria("0001", "Fisica I");
        estudiante.agregarMateria("0002", "Fisica II");
        estudiantesPrueba.add(estudiante);
        
        assertEquals(estudiantesPrueba.get(0).getCedula(), 
                listaEstudiantes.consultarEstudiante().get(0).getCedula());
        assertEquals(estudiantesPrueba.get(0).getNombre(), 
                listaEstudiantes.consultarEstudiante().get(0).getNombre());
    }
    
    @Test (expected = Exception.class)
    public void testListaArchivoVacia()throws Exception{
        ListaEstudiantes listaEstudiantes = new ListaEstudiantes();
        List<String> lineasArchivos = new ArrayList<String>();
        listaEstudiantes.adicionarEstudiante(lineasArchivos);
    }
    
    
}
