# Lección 8 — Constructores y encapsulación

Duración objetivo: 5 a 7 minutos; usar la duración real en el plan final.

**Diapositiva 16 — Construir y proteger.** «En la lección anterior creamos un objeto y después asignamos su nombre y edad por separado. Podemos iniciar ambos datos al crear el objeto mediante un constructor. En la diapositiva aparece también `private`: esta palabra restringe el acceso directo al atributo desde otras clases. Así decidimos cómo se leen y modifican los datos».

**Diapositiva 17 — Getters y setters.** «Un getter devuelve un valor para consultarlo; un setter recibe un nuevo valor para cambiarlo. Piensa en dos puertas: una permite ver la edad y la otra permite solicitar un cambio. El setter incluso puede comprobar que la nueva edad tenga sentido. ¿Deberíamos aceptar una edad negativa? Vamos a probarlo».

**Pasar al editor después de la diapositiva 17.** Abrir `completed-examples/lesson-08/Main.java` o construirlo a partir de la solución anterior. «La clase `Estudiante` declara `private String nombre` y `private int edad`. El constructor `Estudiante(String nombre, int edad)` recibe los datos. `this.nombre = nombre` distingue el atributo del objeto del parámetro recibido; lo mismo ocurre con la edad. En `main` creamos `new Estudiante("Luna", 14)`. `getNombre()` y `getEdad()` permiten consultar los valores. `setEdad(15)` cambia la edad. Dentro del setter usamos `if (nuevaEdad >= 0)` para evitar edades negativas. Ejecutemos y observemos la presentación inicial, el cambio a 15 y que `setEdad(-3)` no modifica la edad».

**Práctica.** «Pausa el video y abre el archivo inicial. Completa `setEdad`, muestra los datos con los getters y cambia la edad a 15. Prueba también un número negativo: la edad válida debe conservarse».

**Cierre.** «Hoy construimos un objeto con datos iniciales y controlamos sus atributos mediante métodos. En la siguiente lección guardaremos varios objetos `Estudiante` en una colección y los recorreremos».
