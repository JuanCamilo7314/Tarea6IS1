
package entidades;

/**
 * Clase para controlar las excepciones cuando la lista este vacia y se necesite
 * hacer alguna operación con esta.
 * @author Juan Camilo Uni Lara y Yenny Maria Burbano
 */
public class ListaException extends Exception
{

    public ListaException(String mensaje)
    {
        super(mensaje);
    }

}
