# Objetivo

Realizar el diagrama UML y programar en Java (implementando los patrones que
se requieran) el siguiente enunciado:

# Desafío I

Un instituto necesita desarrollar un sistema para el área comercial y académica que
le permita armar ofertas académicas, es decir, armar paquetes con los cursos que
se dictan en la institución para constituir programas intensivos. Estos cursos están
diseñados a su vez para poder dictarse y ofrecerse en forma independiente sin
necesidad de cursar un programa intensivo. Es decir, que tanto un curso como un
programa son ofertas académicas que el área comercial podrá ofrecer.

Toda oferta académica es decir cursos y programas tienen un nombre, una
descripción y deberán tener una funcionalidad que le permita al área comercial
poder contar con un precio para cada una de estas ofertas con la siguiente lógica:
El precio de un curso se calcula de acuerdo a la cantidad de carga horaria
mensual de esa materia por la cantidad de meses de duración y un valor hora que
se establece por cada materia.

El precio de un programa intensivo es la sumatoria de los precios de todos
los cursos que forman el programa y se bonifica un determinado porcentaje
dependiendo del programa.

El instituto deberá poder generar un informe que permita mostrar todos los
cursos y programas que ofrece indicando el nombre y precio de cada uno (no es
necesario mostrar los cursos que tiene un programa intensivo).

Reproducir la siguiente situación en una clase Test que contenga el método main e
invocar al método que genera el informe.

Curso: Front End tiene una carga horaria de 16 horas mensuales de dos meses de
duración con un precio de 1000 pesos la hora, es decir que tiene un precio de
32.000 pesos.

Curso: Back End tiene una carga horaria de 20 horas mensuales de dos meses de
duración con un precio de 900 pesos la hora, es decir que tiene un precio de 36.000
pesos.

El programa intensivo FullStack que posee ambas materias y cuyo porcentaje de
bonificación es de 20% tiene un precio final de 54.400 pesos.

# UML

![img.png](img.png)

# Desafio II

Modelar y desarrollar los cambios necesarios para incorporar la posibilidad de sumar
talleres y carreras.

Los talleres y las carreras tienen las mismas características que cualquier oferta académica
y el precio de los talleres depende de la cantidad de trabajos prácticos durante la cursada
cuyo valor de cada trabajo práctico depende de cada taller en particular.

Por otro lado, el precio de una carrera consiste en un valor básico + la suma del precio de
todos los cursos y talleres. Los cursos que se incorporen a una carrera no pueden tener una carga horaria inferior a las 10hs, se deberá arrojar una excepción en caso de querer
incorporar una materia menor a 10hs.