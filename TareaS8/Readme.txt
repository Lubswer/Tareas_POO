ACTIVIDAD – Sistema de Registro de Juegos
Nombre: Lubswer Catagña
Link Github:
Indicaciones Generales
Desarrolle un programa en Java que permita registrar información sobre juegos de Mario Bros y juegos de Carreras de Vehículos.
El objetivo es aplicar herencia, polimorfismo, excepciones personalizadas y manejo de listas (ArrayList) mediante un menú interactivo.
Requerimientos
1.	Crear una clase abstracta llamada Juego con atributos base y un método abstracto.
2.	Crear las clases hijas MarioBros y CarreraVehiculos que hereden de Juego.
3.	Implementar una excepción personalizada para validar datos incorrectos.
4.	Gestionar los juegos dentro de un ArrayList<Juego>.
5.	Implementar un menú en consola que permita registrar y consultar juegos.
6.	Aplicar polimorfismo al mostrar los detalles de cada juego.
7.	Validar datos ingresados por el usuario (números positivos, texto no vacío, etc.).
8.	Probar el sistema ingresando al menos cinco juegos de ambos tipos.
Modelo UML Requerido

El estudiante debe generar un diagrama UML que incluya:
	• 	La clase abstracta Juego
	• 	Las clases hijas MarioBros y CarreraVehiculos
•	La clase Main que controla el menú
•	Relaciones de herencia y uso
•	Atributos y métodos principales
Resultados Esperados
Al finalizar la actividad, el estudiante debe entregar:
1.	Programa funcional en Java
Capaz de:

•	Registrar juegos de Mario y juegos de carreras
•	Mostrar todos los juegos registrados
•	Buscar juegos por nombre
•	Filtrar por tipo de juego
•	Detectar y manejar errores mediante excepciones personalizadas
•	Aplicar correctamente polimorfismo al mostrar los detalles de cada juego 2. Diagrama UML completo
Debe reflejar:
•	Herencia
•	Clases hijas
•	Métodos sobrescritos
•	Relaciones entre clases

ENUNCIADO DEL EJERCICIO
ENUNCIADO:
Desarrollar un programa en Java que simule el registro y funcionamiento de diferentes dispositivos electrónicos.
Debe aplicarse: encapsulamiento, herencia, polimorfismo, sobrescritura, manejo de listas y excepciones personalizadas.
Requerimientos del programa
1.	Crear una clase padre llamada Dispositivo con atributos privados (marca, modelo, precio).
2.	Implementar getters y setters para aplicar encapsulamiento, validando datos incorrectos.
3.	Crear dos clases hijas:
o Laptop
               o Telefono
Ambas deben heredar de Dispositivo.
4.	La clase padre debe incluir un método mostrarInfo() que luego será sobrescrito en cada clase hija para demostrar polimorfismo.
5.	Crear una excepción personalizada llamada DatoInvalidoException, la cual debe lanzarse cuando se ingrese un precio negativo o una marca vacía.
6.	En el método main, crear un ArrayList de tipo Dispositivo, registrar objetos de tipo Laptop y Telefono, y mostrar la información usando polimorfismo.
7.	Capturar excepciones con try–catch cuando se creen dispositivos con datos inválido

Evidencia en GitHub
•	Carpeta del proyecto
•	README que explique el trabajo
•	Capturas del código y de la ejecución en consola
