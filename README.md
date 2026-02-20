# MAVEN-DEPENDEN.-VALIDACIONES-OFUSCACION

-Josué David Paniagua Olivares - 0905-24-6495
-Programacion 3 UMG

------------------------------------------------------------


#DESCRIPCION DE ESTA TAREA:

1) Contiene 3 carpetas en donde una se llama umg.edu.gt-datastructure stack en donde contiene el codigo de una implementacion  manual de una estrcutra de pila o stack.

2) Hay otra llamada stackHandler: Que este consume lo de la libreria que se mencione anteriormente esta par validar expresiones algebraicas y ejecutar pruebas desde consola.

3) Y la otra llamada evidencias en donde podemos encontrar varias capturas con evidencias del funcionamiento de este proyecto tando como en el IDE como en la termina tambien el como ofuscar el codigo y viceversa lo que utilice aora esto es jd-gui.


##PARTE A Dependencia Maven entre proyectos

Entrando a la carptera de structure stack en la terminal y ejecutar mvn clean install "esto instalar la librerai en el repositorio local de maven "--

... esto hara que podamos entrar en el proyecto que cree de stack hanlder y al ejecutar mvn clean package siempre en al termianl para poder incrustarla por asi decirlo.


##PARTE B Implementación funcional

--las pruebas implemetnadas fueron las que se propusieron en minimas en las intrucciones dadas que son Caso válido:

(a+b) * [c-d] → true
Caso inválido:

([)] → false

-- Tambien probe los metodos adiciones de getsize y el de getnode init.



##PARTE C Ofuscación reproducible en ambos proyectos.


-----  La ofuscacion la cree mediante el perfil de maven con el comando en la terminal de mvn clean package que junto con la parte de insertar la parte de la libreria en el repositorio local fue lo que amas de me dificulto.

-- al poner el comando en terminal que antes dije se crean dos archivos en el apartado de target de el proyecto que son: }

-JAR NORMAL
-JAR OFUSCADO 


-----------Para ejecutar el ajr ofuscado en terminal utlice el comando java -jar target/stackHandler-0.0.1-SNAPSHOT-obfuscated.jar
y con este el comportamineto del programa se mantiene igual. 


🔎 5. Parte D – Ingeniería inversa

--Para esta parte como dije anteriormente lo que utilce fue  Jd-gui para poder compilar ambos JAR.


.--Con esto logre manterner los nombres de cada clase y metodos
--El jar ofuscado como se puede ver en las capturas este remplaza los identicadores como a y b-

------------------------------

Breve análisis escrito explicando:

¿Qué tanto se dificulta la lectura?
La lectura del codigo en el JAR ofuscado se difuculta considerablemente en el cual pues obtenemos el objetivo que es este poner menos comprensible el codigo debido a sus cambios de nombres.


¿Se pierde claridad estructural?
--Se pierde claridad estructual porque ya no es tan evidente que clase cumple cada funcion y cual es el objetivo de ella o porque esta en ese lugar 


¿Sigue siendo posible entender la lógica?
Sabiendo lo que se have sigue siendo posibel entender al logca genereal del programa analizando el orden o la ejecion y las llamadas de los metodos pero eso no quita merito de que pues si es menos comprendible.

con esto obtenemos un JAR normal hy otro ofuscado desde IDE y desde la terminal con el cual como se puede ver no pierde el objetivo de esta 
