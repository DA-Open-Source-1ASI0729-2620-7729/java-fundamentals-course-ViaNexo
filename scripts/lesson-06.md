# Lección 6 — Métodos y entrada/salida

Duración objetivo: 5:50 min

**Diapositiva 12 — Métodos.** «En la lección anterior repetimos instrucciones. Ahora queremos agrupar una acción para utilizarla cuando la necesitemos. Imagina una máquina de saludos: recibe un nombre y devuelve un mensaje. Un método tiene nombre, instrucciones y, si lo necesita, parámetros. `saludar(nombre)` recibirá un texto diferente en cada llamada».

**Diapositiva 13 — Entrada y salida.** «`System.out.println` muestra información: es una salida. Con `Scanner` podemos leer información escrita en la consola: es una entrada. Primero probaremos el método con dos nombres escritos en el programa y después leeremos un nombre introducido por quien lo utiliza».

**Pasar al editor después de la diapositiva 13.** Mostrar una versión intermedia con `public static void saludar(String nombre) { System.out.println("¡Hola, " + nombre + "!"); }` y, dentro de `main`, llamar `saludar("Ana");` y `saludar("Luis");`. «El parámetro `String nombre` recibe el valor de cada llamada. Predice cuántos saludos aparecerán. Ejecutemos: aparecen dos mensajes diferentes sin duplicar las instrucciones del método».

**Entrada de usuario.** Abrir `completed-examples/lesson-06/Main.java`. «Importamos `Scanner`, creamos `entrada` para leer de `System.in`, mostramos la pregunta y guardamos el texto con `entrada.nextLine()`. Enviamos `nombreUsuario` a `saludar` y cerramos el lector. Ejecutemos con el nombre María: el programa muestra “¡Hola, María!”. Si tu editor tiene un panel Input o STDIN, escribe allí el nombre antes de ejecutar».

**Práctica.** «Pausa el video y completa el método y su llamada en el archivo inicial. Prueba tu propio nombre. Luego modifica el mensaje para que diga “Bienvenido al curso de Java, [nombre]”».

**Cierre.** «Hoy reutilizamos instrucciones con un método, le enviamos un parámetro y leímos texto de la consola con `Scanner`. En la próxima lección reuniremos datos y comportamientos en una clase `Estudiante`».
