# Examen final

# Examen final

                                                                                                                  EXAMEN JENKINS-INDRA
PREGUNTAS
1. En GitHub, ¿Qué es una rama?
  a) Las ramas de Git son un puntero eficaz para las instantáneas de tus cambios. Cuando quieres añadir una nueva función o solucionar un error, independientemente de su tamaño, generas una nueva rama para alojar estos cambios.
  b) Las ramas son programas que conviven en Github
  c) Son las ramas de los arboles
2. 
¿Qué es el producto mínimo viable?
  a) Es el desarrollo de un programa con sus minimas funcionalidades para luego ir mejorandolo en etapas
  b) Es lo que tengo que llevar como minimo en el supermercado
  c) Es el desarrollo de nuevas funcionalidades en un programa
3. 
¿Qué es una Historia de Usuario?
  a) Es donde se plantean las necesidades del usuario, tratando de entender cual es el objetivo del desarrollo y que se debe entregar como producto final.
  b) Es donde el usuario identifica sus necesidades dentro de su equipo.
  c) Es lo que nos comunica el usuario que obtuvo gracias a nuestro desarrollo
4. 
¿Qué es la Integración Continua?
  a) La integración continua es una práctica de ingeniería de software que consiste en hacer integraciones automáticas de un proyecto lo más a menudo posible para así poder detectar fallos cuanto antes. Entendemos por integración la compilación y ejecución de pruebas de todo un proyecto
  b) Es el desarrollo constante de codigo y de planificación en base a el
5. 
¿Qué es el deployment continuo?
  a) El despliegue continuo (CD) es un proceso de lanzamiento de software que utiliza pruebas automatizadas para validar que todos los cambios en una base de código sean precisos y estén listos para implementarse de forma autónoma en un entorno de producción.
  b) Es la entrega continua de proyectos y entregables
6. 
¿Qué es Git?
  a) Git es un software de control de versiones diseñado por Linus Torvalds, pensando en la eficiencia, la confiabilidad y compatibilidad del mantenimiento de versiones de aplicaciones cuando estas tienen un gran número de archivos de código fuente.
  b) Es un programa que se encarga de desarrollar codigo
7. 
Por Default, ¿Cuál es la rama mas importante en Github?
  a) master/main
  b) Desarrollo
  c) Releases
  d) Hotfix
8. 
¿En que lenguaje de programación esta basado Jenkins?
  a) Groovy
  b) Python
  c) C
  d) C#
9. 
¿El entorno de producción debe estar disponible todos los días?
  a) Verdadero
  b) Falso
10. 
¿Qué es un Pipeline en Jenkins?
  a) Un pipeline de Jenkins se define como una serie de complementos que permiten integrar elementos relacionados con la entrega continua en el sistema.
b) Es un proceso logico donde se estructura como se va a ejecutar el codigo.


PRACTICA
En base al fichero “valores.txt” dejado en el repositorio en Github, se debe leer el mismo y asignarlo a una variable. Cada línea del fichero se debe usar en un stage distinto y cada stage se debe ejecutar en un día especifico.
Linea 0, Día Lunes:
En base a este número, se debe crear una función que se llame “calcularPoblacionFinal()” donde el cálculo es valorLinea0 * 0.80 
Linea 1 y 2, Martes:
Implemente 4 funciones para las cuatro operaciones aritméticas básicas tomando como referencia estos 2 números.
Linea 3, Día miércoles: 
Este valor expresa la temperatura en grados Farengeith, crear una función que la pase a grados Celcius, teniendo presente
Teniendo en cuenta la fórmula para pasar de Farenheit a Celcius:
(32 °F − 32) × 5/9 = 0 °C
Ejemplo: (100 ° F - 32) x 5/9 = 37.7778 ° C, puede usar la siguiente URL para ayudarse.
https://www.metric-conversions.org/es/temperatura/fahrenheit-a-celsius.htm
Día Jueves:
Informar el usuario que está ejecutando el pipeline
Día Viernes:
Generar un proyecto básico de tipo Maven -solo una dependencia de mysql- y ejecutar un clean install del mismo. 
Para toda la información de los días Lunes, martes y miércoles se debe imprimir los valores en un txt de salida, el mismo se debe generar en una función.
