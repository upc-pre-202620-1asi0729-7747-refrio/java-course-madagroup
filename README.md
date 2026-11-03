# Fundamentos de Java y programación orientada a objetos

Curso de **Fundamentos de Java y programación orientada a objetos** dirigido a estudiantes de secundaria (12–17 años) sin experiencia previa en programación. Organizado en **cinco lecciones de 12 minutos**, con prácticas para comenzar a programar en Java desde el navegador.

**Duración:** 60 minutos &nbsp;|&nbsp; **Herramientas:** Navegador web y editor Java gratuito en línea &nbsp;|&nbsp; **Prerrequisitos:** Ninguno

---

## 📂 Estructura del repositorio

```text
java-course-madagroup/
├── starter-files/       # Puntos de partida con tareas para cada lección
├── completed-examples/  # Soluciones comprobadas y salida esperada
├── scripts/             # Espacio reservado para demostraciones y guiones
└── README.md
```

**Repositorio completo:** https://github.com/upc-pre-202620-1asi0729-7747-refrio/java-course-madagroup

---

## ▶️ Cómo usar este repositorio

1. Abre un editor Java gratuito en línea, como [JDoodle](https://www.jdoodle.com/online-java-compiler/) u [OnlineGDB](https://www.onlinegdb.com/online_java_compiler). También puedes usar Replit si está disponible en tu región y plan.
2. Consulta el video de la lección correspondiente cuando su enlace esté disponible.
3. Copia el contenido de `starter-files/leccion-XX/Main.java` en el archivo `Main.java` del editor.
4. Ejecuta el programa y desarrolla los pasos de la práctica, completando las tareas.
5. Compara tu resultado con `completed-examples/leccion-XX/Main.java` y revisa la salida esperada.
6. Consulta los guiones en `scripts/` si quieres leer el contenido de la lección.

**Para la lección 3:** si el editor solicita la entrada por separado, escribe `Ana` en el campo de entrada estándar (`stdin`) antes de ejecutar el programa.

**No necesitas instalar programas:** las prácticas se realizan desde el navegador.

---

## 📚 Lecciones

| # | Tema | Duración | Video | Práctica |
|---|------|----------|-------|----------|
| 1 | ¡Tu primer programa en Java! | 12 min | Pendiente de enlace real | enlace en línea pendiente |
| 2 | Decidir y repetir | 12 min | Pendiente de enlace real | enlace en línea pendiente |
| 3 | Métodos y colecciones | 12 min | Pendiente de enlace real | enlace en línea pendiente |
| 4 | Clases y objetos | 12 min | Pendiente de enlace real | enlace en línea pendiente |
| 5 | Proyecto final: registro de estudiantes | 12 min | Pendiente de enlace real | enlace en línea pendiente |

---

### 1️⃣ Lección 1 — ¡Tu primer programa en Java!

Descubre qué significa programar mediante la idea de entrada, proceso y salida. Conoce Java, escribe tu primer «Hola, mundo» y aprende a guardar datos en variables para realizar operaciones y mostrar resultados en la consola.

**Contenidos:**

- Instrucciones claras y ordenadas: entrada, proceso y salida.
- El archivo `Main.java`, el método `main` y la consola.
- Salida de mensajes con `System.out.println`.
- Variables de tipo `String`, `int`, `double` y `boolean`.
- Operaciones con `+` y comparaciones con `>=`.

**Práctica:** Ejecuta un mensaje, crea tres variables y cambia sus valores para observar la salida.

**Consejos clave:** `main` es el punto de inicio del programa. `println` muestra información en la consola. El operador `+` permite sumar números o concatenar texto.

**Piensa y comprueba:** ¿Qué ocurrirá si cambias la edad de 14 a 12 en la comparación de acceso?

---

### 2️⃣ Lección 2 — Decidir y repetir

Aprende a elegir qué instrucciones ejecutar según una condición y a repetir tareas con bucles. Trabaja con una edad, un contador de rondas y un número de vidas para comprender cómo cambia el comportamiento del programa.

**Contenidos:**

- Decisiones con `if` y `else`.
- Comparaciones con `>`, `<`, `>=`, `==` y `!=`.
- Condiciones combinadas con `&&` y `||`.
- Bucles `for`: inicio, condición y actualización.
- Bucles `while`: repetición mientras una condición sea verdadera.

**Práctica: «Un juego de tres rondas».** Prueba `if/else` con dos edades, muestra tres rondas con `for` y descuenta dos vidas con `while`.

**Consejos clave:** Usa `for` cuando conozcas el número de repeticiones. En un `while`, actualiza los valores que controlan la condición para que el bucle pueda terminar.

**Piensa y comprueba:** ¿Cuántas rondas aparecen si el límite pasa de 3 a 5?

---

### 3️⃣ Lección 3 — Métodos y colecciones

Organiza el código en tareas reutilizables y trabaja con varios datos a la vez. Aprende a recibir un nombre desde la consola y a usar un array de notas para calcular un promedio.

**Contenidos:**

- Métodos, llamadas y reutilización de código.
- Parámetros y devolución de resultados con `return`.
- Entrada de datos con `Scanner` y `nextLine()`.
- Arrays: creación, índices y cantidad de elementos con `.length`.
- Texto con `String`: comparación mediante `.equals()` y longitud mediante `.length()`.

**Práctica: «Calcula el promedio».** Lee el nombre del usuario con `Scanner`, suma las tres notas de un array y muestra el promedio y la longitud del nombre. Usa métodos para organizar el cálculo.

**Consejos clave:** El primer elemento de un array está en el índice `0`. Usa `.length` para conocer la cantidad de elementos de un array y `.length()` para la longitud de un texto. Si el editor solicita la entrada por separado, escribe `Ana` en `stdin`.

**Piensa y comprueba:** ¿Cuál es el índice de la primera nota?

---

### 4️⃣ Lección 4 — Clases y objetos

Inicia la programación orientada a objetos representando estudiantes con datos y acciones. Distingue una clase de sus instancias y utiliza un constructor para asignar valores al crear cada objeto.

**Contenidos:**

- Clase como modelo y objeto como instancia concreta.
- Atributos `nombre` y `edad` de la clase `Estudiante`.
- Método `presentarse()` para mostrar información.
- Constructores y uso de `this` para distinguir atributos y parámetros.
- Creación de objetos con `new` y datos independientes por instancia.

**Práctica: «Estudiantes que se presentan».** Construye la clase `Estudiante`, crea a Ana de 14 años y a Luis de 15, y llama al método `presentarse()` de cada objeto. Después, actualiza solo la edad de Ana.

**Consejos clave:** El constructor tiene el mismo nombre que la clase. Cada objeto conserva sus propios valores, aunque comparta el mismo modelo con otros objetos.

**Piensa y comprueba:** ¿Cambiar a Ana modifica también los datos de Luis?

---

### 5️⃣ Lección 5 — Proyecto final: registro de estudiantes

Integra lo aprendido en un registro de estudiantes. Protege los atributos de los objetos y controla cómo se consultan y modifican para impedir que una edad inválida cambie los datos del registro.

**Contenidos:**

- Encapsulación y atributos `private`.
- Getters para consultar datos, como `getEdad()` y `getNombre()`.
- Setters para modificar datos con validación, como `setEdad(...)`.
- Validación de edades entre `0` y `120`, inclusive.
- Arrays de objetos `Estudiante` y recorrido mediante `for`.

**Proyecto final:** Crea dos estudiantes, agrúpalos en un array y muestra sus nombres. Actualiza una edad válida y prueba el valor `-4` para comprobar que el dato anterior se conserva.

**Desafío final:** Agrega un tercer estudiante al registro y vuelve a ejecutar el recorrido.

**Consejos clave:** Los atributos privados permiten que la clase controle el acceso a sus datos. Un setter debe comprobar la regla antes de guardar un nuevo valor. Modifica el programa y comprueba su comportamiento para entender cada parte.

**Piensa y comprueba:** ¿Por qué la edad inválida no modifica el registro?

---

## 🧰 Recursos adicionales

- **Editor en línea:** [JDoodle para Java](https://www.jdoodle.com/online-java-compiler/).
- **Editor alternativo:** [OnlineGDB para Java](https://www.onlinegdb.com/online_java_compiler).
- **Archivos de inicio:** carpeta `starter-files/`.
- **Ejemplos terminados:** carpeta `completed-examples/`, con soluciones comprobadas con `javac` y salida esperada.
- **Demostraciones y guiones:** espacio reservado en `scripts/`.

**¡Gracias por completar el curso!**

---

## 👥 Equipo

**Institución:** Universidad Peruana de Ciencias Aplicadas 

**Curso universitario:** Desarrollo de Aplicaciones Open Source

**Equipo:** MadaGroup &nbsp;|&nbsp; **Líder del equipo:** Adriano Samir Centeno León

| Integrante |
|---|
| Alca Morán, César Alejandro |
| Centeno León, Adriano Samir |
| Rivas Méndez, Bernie Aarón |
| Saavedra Flores, Rodrigo Andree |
| Tello Lima, José Alejandro |
