package entidades;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import persistencia.ManejoArchivo;

/**
 * Clase encargada de agregar los estudiantes a la lista de estudiantes, para
 * realizar operaciones con esta
 *
 * @author Juan Camilo Uni Lara
 */
public class ListaEstudiantes {

    private List<Estudiante> estudiantes;

    public ListaEstudiantes() {
        estudiantes = new ArrayList<Estudiante>();
    }

    /**
     * Método que se encarga de guardar en la lista estudiantes a los
     * estudiantes y las materias que tiene cada estudiante, contenidos en el
     * archivo ingresado
     *
     * @param lineasArchivo lista que contiene el contenido del archivo que se
     * ingresó
     * @throws ListaException se da cuando el archivo devuleve una lista vacía
     */
    public void adicionarEstudiante(List<String> lineasArchivo)
            throws ListaException {
        if (lineasArchivo.size() == 0) {
            throw new ListaException("El archivo ingresado esta vacío, "
                    + "por favor ingrese un archivo con registros");
        }

        for (int i = 0; i < lineasArchivo.size(); i++) {
            String[] informacionEstudiante = lineasArchivo.get(i).split(",");
            for (int j = 0; j < informacionEstudiante.length; j++) {
                Estudiante estudiante = new Estudiante(informacionEstudiante[j],
                        informacionEstudiante[j + 1]);
                if (estudiantes.size() == 0) {
                    estudiantes.add(estudiante);
                    estudiante.agregarMateria(informacionEstudiante[j + 2],
                            informacionEstudiante[j + 3]);
                    break;
                } else {
                    Estudiante estudianteBuscado = buscarEstudiante(informacionEstudiante[j]);
                    if (estudianteBuscado == null) {
                        estudiantes.add(estudiante);
                        estudiante.agregarMateria(informacionEstudiante[j + 2],
                                informacionEstudiante[j + 3]);
                    }else{
                        estudianteBuscado.agregarMateria(informacionEstudiante[j + 2],
                            informacionEstudiante[j + 3]);
                    }
                    break;
                }
            }
        }
    }

    /**
     * Método encargado de buscar si un estudiante existe en la lista de
     * estudiantes
     *
     * @param cedula cedula para un estudiante en especifico
     * @return el estudiante si existe, de lo contrario un estudiante null
     */
    public Estudiante buscarEstudiante(String cedula) {
        Estudiante estudiante = null;
        for (int i = 0; i < estudiantes.size(); i++) {
            if (cedula.equals(estudiantes.get(i).getCedula())) {
                estudiante = estudiantes.get(i);
            }
        }
        return estudiante;
    }

    /**
     * Método que se encarga de devolver la lista de los estudiantes
     *
     * @return lista con los estudiantes que estan en el archivo plano ingresado
     */
    public List<Estudiante> consultarEstudiante() {
        return this.estudiantes;
    }

    public void vaciarLista() {
        this.estudiantes = new ArrayList<Estudiante>();
    }

    /**
     * Método que se encarga de llamar a un método de manejoArchivo para obtener
     * la lista con el contenido del archivo línea por línea
     *
     * @param archivo archivo ingresado previamente
     * @throws ListaException lo ocasiona el método adicionarEstudiante, cuando
     * la lista que contiene el contenido del archivo esta vacío
     * @throws java.io.FileNotFoundException archivo no existente
     */
    public void llenarLista(File archivo) throws ListaException,
            FileNotFoundException {
        ManejoArchivo manejoArchivo = new ManejoArchivo();
        List lineasArchivo = manejoArchivo.recorrerArchivo(archivo);
        adicionarEstudiante(lineasArchivo);
    }

}
