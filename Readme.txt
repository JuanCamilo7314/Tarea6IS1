El diagrama de clases realizado en las tareas 4 y 5, sirvió en un 96% para concretar el código. Ya que se tuvieron que hacer tres cambios al diagrama de clases:

1. Al método seleccionarRuta() de la clase Control, en el diagrama de clases retornaba void, pero al momento de implementarlo en código se tuvo que hacer que retornara un File, para que la ventana pudiese obtener el nombre del archivo seleccionado.

2. A la clase ListaEstudiantes se le agregó el método vaciarLista(), para que reseteara la listaEstudiantes cada vez que se ingresara un nuevo archivo.

3. Para poder usar el método nuevo de la clase ListaEstudiantes, a la clase Control se le agregó el método vaciarLista(), para poder vaciar la lista cada vez que se oprimiera el botón que carga el archivo en la ventana; manteniendo asi las relaciones manejadas en el diagrama de clase.

El resto del programa se implementó tal cual el diagrama de clases y los diagrama de secuencia. La especificación de métodos sirvió como base en la implementación del código, pero no fueron en su totalidad muy bien especificados, se quedaron ciertas validaciones y requisitos sin detallar.

Puesto que el proyecto es bastante sencillo y corto, no fue problema estructurar bien los métodos, y a pesar de que hubieron cambios en el diagrama de clase, fueron mas que eso agregaciones, ocurridas por no considerar bien pequeños problemas que pudiesen pasar. Por lo que se concluye que se hizo un buen trabajo en diseño.