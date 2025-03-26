# Vector vs. LinkedList

## Observaciones:
- Los resultados muestran que Vector supera a LinkedList en velocidad en todas las pruebas, especialmente a medida que el tamaño de los datos crece. Ejemplos clave:
  - Para 256,000 elementos:
    - Vector: 15 ms
    - LinkedList: 44 ms (casi 3 veces más lento)
  - Para 4,096,000 elementos:
    - Vector: 184 ms 
    - LinkedList: 490 ms (más de 2.5 veces más lento)
  - Para 8,192,000 elementos:
    - Vector: 395 ms 
      - LinkedList: 4478 ms (más de 11 veces más lento)

## Implementación

### Estructura de datos
- Vector usa un array contiguo, lo que permite acceso rápido a cualquier índice en tiempo O(1).
- LinkedList usa nodos enlazados, por lo que acceder a un elemento requiere recorrer los punteros (tiempo O(n) en el peor caso).

### Uso de memoria
- Vector crece en bloques, reduciendo la cantidad de asignaciones de memoria.
- LinkedList asigna memoria para cada nodo por separado, lo que genera más fragmentación de memoria y un mayor número de accesos a la RAM.
- Vector almacena los datos en memoria contigua, lo que facilita la precarga de datos en la caché del procesador.
- LinkedList almacena cada elemento en nodos dispersos, lo que no permite aprovechar la caché, haciendo más lento el acceso.

