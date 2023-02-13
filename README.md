# SorpresaSorpresa1
Examen 1
## Nota:
Mi repositorio es https://github.com/zmartand/SorpresaSorpresa1.git
## Enunciado
__El patrón Abstract Factory proporciona una manera clara y organizada de crear objetos relacionados, sin tener que especificar exactamente qué objetos se crean. Esto permite una mayor flexibilidad y escalabilidad, ya que se pueden agregar nuevos tipos de diálogos o fábricas sin afectar la estructura existente. También ayuda a mejorar la cohesión y la modularidad del código, ya que los componentes están claramente separados y responsables de su propia tarea específica. A continuación debes realizar de manera individual este pequeño ejemplo:

En este ejercicio se crean dos clases diferentes de diálogos: DialogoWindows y DialogoMac, cada una con su propia implementación de la interfaz Dialogo. 

Luego, se definen dos fábricas abstractas: FabricaDialogoWindows y FabricaDialogoMac, que se encargan de crear los diálogos específicos correspondientes. 

La clase Cliente actúa como el cliente de la fábrica abstracta, creando diálogos a través de la fábrica sin tener que conocer los detalles de implementación de los diálogos.

Asegúrate de entregar el código en el respositorio de Github y un diagrama de clases mediante plantUML

Para poder saber paso a paso que acciones debéis realizar, os he dejado un paso a paso:

Uso correcto del patrón Abstract Factory: (25 puntos)(https://refactoring.guru/es/design-patterns/abstract-factory/java/example)

¿Se ha implementado correctamente el patrón Abstract Factory en el código?
¿Están claramente definidas las fábricas abstractas y sus métodos?
¿El cliente utiliza correctamente la fábrica abstracta para crear los diálogos?
Diseño y organización del código: (25 puntos)

¿Están claramente separadas y organizadas las clases y métodos?
¿Están claramente definidos los objetivos y responsabilidades de cada clase y método?
¿Están utilizados los nombres adecuados para las clases, métodos y variables?
Implementación de los diálogos: (25 puntos)

¿Están correctamente implementados los diálogos DialogoWindows y DialogoMac?
¿Están correctamente implementadas las fábricas abstractas FabricaDialogoWindows y FabricaDialogoMac para crear los diálogos correspondientes?
¿Están claramente definidos los métodos y atributos necesarios para los diálogos?
Pruebas y funcionamiento: (25 puntos) con JUnit (https://blog.softtek.com/es/testing-unitario)

¿Están incluidas pruebas adecuadas para demostrar el funcionamiento correcto del código?
¿El código se ejecuta sin errores y produce los resultados esperados?
¿Están consideradas y manejadas adecuadamente las posibles excepciones y errores?
