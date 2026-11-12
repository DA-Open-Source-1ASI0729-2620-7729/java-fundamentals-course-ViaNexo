# Lección 2 — Variables y tipos de datos

Duración objetivo: 6:21 min

**Diapositiva 4 — Guardar información.**

«En el video anterior mostramos un mensaje fijo. Ahora queremos que el programa recuerde información. Una variable se parece a una caja con una etiqueta: la etiqueta es su nombre y dentro guardamos un valor. En la imagen, `edad` guarda un número entero. En Java escribimos `int edad = 14;`. `int` indica el tipo de dato, `edad` es el nombre y `14` es el valor. Para un texto usamos `String`; por ejemplo, `String nombre = "Ana";`. Observa que el texto va entre comillas, pero el número no».

**Diapositiva 5 — Cambiar y mostrar datos.**

«Una variable puede recibir un valor nuevo. También podemos combinar datos para formar un mensaje, como “Ana tiene 14 años”. Imagina que pasa un año: podemos actualizar `edad` sin cambiar el nombre. ¿Cuál de las dos cajas tendríamos que modificar? Exacto, la de la edad. Vamos a verlo en el editor».

**Pasar al editor en línea después de la diapositiva 5.** Abrir `completed-examples/lesson-02/Main.java` o escribirlo paso a paso.

«Dentro de `main` declaramos `String nombre = "Ana";` e `int edad = 14;`. Mostramos el mensaje con `System.out.println(nombre + " tiene " + edad + " años.");`. Los signos `+` unen los fragmentos de texto y los valores. Antes de ejecutar, predice el resultado. Ahora ejecutamos: aparece “Ana tiene 14 años”. Después escribimos `edad = 15;`. Ya no repetimos `int` porque la variable existe; solo reemplazamos su valor. Al ejecutar de nuevo, el segundo mensaje usa 15».

**Práctica.** «Pausa el video. Abre el archivo inicial de esta lección y crea tus propias variables `nombre` y `edad`. Muestra ambos datos, cambia la edad y ejecuta otra vez. Si no aparece lo esperado, revisa las mayúsculas de `String`, las comillas del nombre y los puntos y coma».

**Cierre.** «Hoy usamos `String` para texto e `int` para números enteros. Guardamos, mostramos y cambiamos datos. En la siguiente lección aprenderás a calcular y comparar esos valores con operadores».
