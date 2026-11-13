# Lección 10 — Registro final de estudiantes

Duración objetivo: 6 a 8 minutos

**Diapositiva 20 — Proyecto final.** «Ya conocemos las piezas: una clase define estudiantes, el constructor les da nombre y edad, el método permite presentarlos, el array reúne varios objetos y la entrada y salida nos dejan conversar con el programa. En esta lección las uniremos para registrar a dos estudiantes. Antes de abrir el editor, intenta identificar qué parte del programa se ocupará de guardar cada estudiante».

**Pasar al editor después de la diapositiva 20.** Abrir o construir `completed-examples/lesson-10/Main.java` paso a paso. «Empezamos importando `Scanner` para leer datos. La clase `Estudiante` tiene atributos privados, constructor y el método `presentarse`. En `main` creamos un lector y un array con dos posiciones. Un primer `for` repite la captura de datos dos veces: solicita el nombre con `nextLine`, pide la edad con `nextInt` y crea un objeto con esos valores. Después de `nextInt`, llamamos a `nextLine` para consumir el salto de línea pendiente; así la siguiente lectura de nombre funciona correctamente. Al final, otro bucle recorre el registro y pide a cada estudiante que se presente. Antes de ejecutar, predice cuántas presentaciones aparecerán».

**Demostración.** «Escribamos, por ejemplo, Luna, 14, Mateo, 16, respetando las indicaciones de entrada del editor. Ejecutamos y vemos dos mensajes. Si el editor usa un panel Input o STDIN, colocamos allí cada respuesta en una línea antes de ejecutar. El primer bucle construye los objetos; el segundo los muestra. Así conectamos lo aprendido en todo el curso».

**Volver a la diapositiva 21 — Errores comunes.** «Si aparece un error, leamos el mensaje antes de modificar el programa. Comprueba los puntos y coma, las mayúsculas de `String` y `Scanner`, el límite del índice y la condición del bucle. En un array de dos elementos solo existen los índices 0 y 1. La comprobación `indice < registro.length` nos mantiene dentro del límite».

**Volver a la diapositiva 22 — Tu siguiente paso.** «Ahora pausa el video y cambia el registro para guardar tres estudiantes: modifica el tamaño del array y prueba el programa. Como los bucles usan `registro.length`, seguirán funcionando. Si quieres continuar, piensa cómo agregarías una búsqueda por nombre. Ya puedes combinar variables, condiciones, bucles, métodos y objetos para crear programas propios».
