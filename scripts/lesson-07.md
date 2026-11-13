# Lección 7 — Clases y objetos

Duración objetivo: 6 minutos.

**Diapositiva 14 — Del molde al objeto.** «Hasta ahora usamos variables y métodos. Ahora vamos a reunir datos y comportamientos relacionados. Una clase es como un molde: describe qué características y acciones tendrá un estudiante. Un objeto es un estudiante concreto creado a partir de ese molde. En nuestro ejemplo, la clase `Estudiante` tendrá nombre, edad y una acción para presentarse. Luna será un objeto con sus propios datos».

**Diapositiva 15 — Instanciar.** «Un mismo molde permite crear varios objetos. Luna tiene 14 años y Mateo tiene 16. Ambos son estudiantes, pero cada uno guarda valores distintos. A crear un objeto de una clase lo llamamos instanciar. Fíjate en la palabra `new`, que usaremos en el código. Antes de pasar al editor, piensa: si hacemos que Luna se presente, ¿debería mostrar la edad de Mateo?».

**Pasar al editor después de la diapositiva 15.** Abrir `completed-examples/lesson-07/Main.java` o escribir las partes importantes paso a paso. «En este único archivo tenemos dos clases. `Estudiante` describe los atributos `nombre` y `edad` y el método `presentarse`. `Main` contiene el punto de partida del programa. Primero escribimos `Estudiante luna = new Estudiante();`, asignamos su nombre y edad y hacemos lo mismo para Mateo. Las instrucciones `luna.presentarse()` y `mateo.presentarse()` llaman el método en cada objeto. Predice los dos mensajes antes de ejecutar. Vemos que cada objeto utiliza sus propios datos».

**Práctica.** «Pausa el video, abre el archivo inicial y completa `presentarse()`. Después llama al método para Luna y crea un segundo estudiante con otro nombre y edad. Ejecuta y comprueba que aparecen dos mensajes diferentes».

**Cierre.** «Una clase define una estructura y los objetos son ejemplares concretos con sus propios datos. En la siguiente lección aprenderemos a crear objetos con datos iniciales y a controlar cómo se consultan y cambian esos datos».
