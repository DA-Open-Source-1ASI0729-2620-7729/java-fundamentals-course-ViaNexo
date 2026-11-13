# Lección 5 — Bucles `for` y `while`

Duración objetivo: 4:59 min

**Diapositiva 10 — Repetir instrucciones.** «Hola. Imagina que un personaje debe saltar cinco veces. En lugar de escribir cinco veces la misma instrucción, podemos usar un bucle. `for` nos resulta útil cuando conocemos el número de repeticiones. `while` repite mientras una condición sea verdadera. En la pantalla vemos un contador que avanza del 1 al 5».

**Diapositiva 11 — Evitar bucles infinitos.** «Todo bucle necesita una condición que pueda dejar de cumplirse. El contador indica por dónde vamos; la condición decide si continuamos; el cambio actualiza el contador; y al dejar de cumplirse la condición salimos. Si empezamos en 1 y nunca aumentamos el contador, ¿llegaremos a 5? No: podríamos repetir sin terminar».

**Pasar al editor después de la diapositiva 11.** Abrir `completed-examples/lesson-05/Main.java`. «En `for (int numero = 1; numero <= 5; numero++)`, primero creamos el contador, luego comprobamos si seguimos y finalmente aumentamos una unidad. Dentro de las llaves imprimimos el número actual. Antes de ejecutar, predice si veremos el 5. Ejecutemos: aparecen 1, 2, 3, 4 y 5. Cuando número pasa a 6, la condición deja de cumplirse».

**Demostrar `while`.** Abrir por separado `completed-examples/lesson-05/WhileExample.java` en un editor que permita ese nombre de clase, o pegar su contenido en un archivo del mismo nombre. «Ahora el contador se crea antes del bucle. `while (numero <= 5)` comprueba la condición al inicio de cada vuelta. Mostramos el valor y escribimos `numero++` dentro del bucle. Ejecutemos: sale la misma secuencia. Si olvidáramos el aumento, el bucle no alcanzaría su límite».

**Práctica.** «Pausa el video y completa el archivo inicial con un `for` que muestre del 1 al 5. Luego cambia el límite de 5 a 10 y ejecuta de nuevo. Como reto adicional, escribe la misma secuencia con `while`».

**Cierre.** «Aprendiste a repetir acciones con `for` y `while`. Un contador y una condición de salida nos ayudan a controlar las repeticiones. En la siguiente lección reuniremos instrucciones en métodos y recibiremos datos desde la consola».
