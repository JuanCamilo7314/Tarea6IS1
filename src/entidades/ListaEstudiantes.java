package entidades;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import persistencia.ManejoArchivo;

/**
 * Clase encargada de agregar los estudiantes a la lista de estudiantes, para
 * realizar operaciones con esta
 * @author Juan Camilo Uni Lara
 */
public class ListaEstudiantes
{

    private List<Estudiante> estudiantes;

    public ListaEstudiantes()
    {
        estudiantes = new ArrayList<Estudiante>();
    }

    public void adicionarEstudiante(List<String> lineasArchivo) 
            throws ListaException
    {
        if (lineasArchivo.size() == 0)
        {
            throw new ListaException("El archivo ingresado esta vacío, "
                    + "por favor ingrese un archivo con registros");
        }

        for (int i = 0; i < lineasArchivo.size(); i++)
        {
            String[] informacionEstudiante = lineasArchivo.get(i).split(",");
            for (int j = 0; j < informacionEstudiante.length; j++)
            {
                Estudiante estudiante = new Estudiante(informacionEstudiante[j],
                            informacionEstudiante[j + 1]);
                if (estudiantes.size() == 0)
                {
                    estudiantes.add(estudiante);
                    estudiante.agregarMateria(informacionEstudiante[j + 2],
                            informacionEstudiante[j + 3]);
                    break;
                }
                else
                {
                    if (buscarEstudiante(informacionEstudiante[j]) == null)
                    {
                        estudiantes.add(estudiante);
                       
                    }
                     estudiante.agregarMateria(informacionEstudiante[j + 2],
                                informacionEstudiante[j + 3]);
                     break;
                }
            }
        }
    }

    public Estudiante buscarEstudiante(String cedula)
    {
        Estudiante estudiante = null;
        for (int i = 0; i < estudiantes.size(); i++)
        {
            if (cedula.equals(estudiantes.get(i).getCedula()))
            {
                estudiante = estudiantes.get(i);
            }
        }
        return estudiante;
    }

    public List<Estudiante> consultarEstudiante()
    {
        return this.estudiantes;
    }

    public void llenarLista(File archivo) throws ListaException
    {
        ManejoArchivo manejoArchivo = new ManejoArchivo();
        List lineasArchivo = manejoArchivo.recorrerArchivo(archivo);
        adicionarEstudiante(lineasArchivo);
        
    }

}
