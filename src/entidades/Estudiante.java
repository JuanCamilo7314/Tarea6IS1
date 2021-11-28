
package entidades;

import java.util.List;
import java.util.ArrayList;

/**
 * Clase encargada de organizar a los estudiantes y manejar las materias
 * que tiene cada uno
 * @author Juan Camilo Uni Lara y Yenny Maria Burbano
 */
public class Estudiante
{

    private String nombre;
    private String cedula;
    private List<Materia> materias;

    public Estudiante(String cedula, String nombre)
    {
        this.cedula = cedula;
        this.nombre = nombre;
        materias = new ArrayList<Materia>();
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getCedula()
    {
        return cedula;
    }

    /**
     * Método que se encarga de agregar las materias que tiene un estudiante a 
     * su lista de materias
     * @param codigoMateria codigo al que esta asociado una materia
     * @param nombreMateria nombre de la materia con un codigo en específico
     */
    public void agregarMateria(String codigoMateria, String nombreMateria)
    {
        if (materias.size() == 0)
        {
            materias.add(new Materia(codigoMateria, nombreMateria));
        }
        else
        {
            if (buscarMateria(codigoMateria) == null)
            {
                materias.add(new Materia(codigoMateria, nombreMateria));
            }
        }
    }

    /**
     * Método encargado de buscar si una materia la tiene un estudiante
     * en su lista de materias o no
     * @param codigoMateria codigo al que esta asociado una materia
     * @return Materia si ya existe o null en caso contrario
     */
    public Materia buscarMateria(String codigoMateria)
    {
        Materia materia = null;
        for (int i = 0; i < materias.size(); i++)
        {
            if (codigoMateria.equals(materias.get(i).getCodigo()))
            {
                materia = materias.get(i);
            }
        }
        return materia;
    }

    /**
     * Método encargado de retornar la cantidad de materias que tiene cada
     * el estudiante
     * @return la cantidad de materias que tiene el estudiante 
     */
    public int cantidadMaterias()
    {
        return materias.size();
    }

}
