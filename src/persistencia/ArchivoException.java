/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author Juan Camilo Uni Lara
 */
public class ArchivoException extends Exception
{

    public ArchivoException(String mensaje)
    {
        super(mensaje);
    }
    ArchivoException()
    {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}