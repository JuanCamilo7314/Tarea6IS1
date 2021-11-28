
package entidades;

/**
 * Clase para organizar la materia que puede tener un estudiante
 * @author Juan Camilo Uni Lara y Yenny Maria Burbano
 */
public class Materia
{

    private String nombre;
    private String codigo;

    public Materia(String codigo, String nombre)
    {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo()
    {
        return codigo;
    }

}
