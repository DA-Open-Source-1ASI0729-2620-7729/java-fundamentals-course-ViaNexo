# Lección 9 — Arrays de objetos

Duración objetivo: 5 a 7 minutos; escribir la duración real en el plan final.

**Diapositiva 18 — Colección de estudiantes.** «En la lección anterior aprendimos a crear un objeto `Estudiante`. Si necesitamos trabajar con varios, podemos guardarlos juntos en un array. Esta colección tiene posiciones llamadas índices. En Java, el primer índice es cero: un array de tres estudiantes usa las posiciones 0, 1 y 2. Cada posición guarda una referencia a un objeto distinto. ¿En qué posición se guardaría el segundo estudiante? En la posición 1».

**Diapositiva 19 — Recorrer y mostrar.** «Un bucle puede visitar cada posición para mostrar los datos de todos los estudiantes. Usaremos el contador del bucle como índice. Debemos detenernos antes de llegar a `estudiantes.length`, porque esa longitud cuenta cuántos elementos existen, mientras el último índice es una unidad menor. Vamos al editor para verlo».

**Pasar al editor después de la diapositiva 19.** Abrir o escribir `completed-examples/lesson-09/Main.java`. «En la clase `Estudiante` conservamos nombre, edad, constructor y método `presentarse`. En `main` declaramos un array con Luna, Mateo y Ana. En el `for` empezamos con índice 0 y avanzamos mientras `indice < estudiantes.length`. Dentro del bucle, `estudiantes[indice]` selecciona el objeto actual y `.presentarse()` muestra su mensaje. Antes de ejecutar, predice cuántas líneas aparecerán. Ejecutemos: vemos tres estudiantes, en orden, con índices 0, 1 y 2».

**Práctica.** «Pausa el video y completa el bucle del archivo inicial. Luego añade un cuarto estudiante al array y ejecuta otra vez. No hace falta cambiar el límite del bucle porque usamos `estudiantes.length`».

**Cierre.** «Hoy guardamos objetos en un array y los recorrimos con un bucle. En la última lección pediremos datos al usuario para construir un pequeño registro de estudiantes».
