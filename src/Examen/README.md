# Enunciado

El Instituto Buenos Aires necesita construir un sistema para administrar los títulos que otorga.

Un Título solo puede corresponder a una sola persona y los datos que se necesitan de esta son: el nombre, el apellido, DNI y su edad. Utilizar un constructor que permita asignar todos los atributos apellido y DNI al momento de necesitar crear un objeto.

Los títulos además de tener asociado a una persona tienen la cantidad de materias de la carrera, fecha en la que la persona inició sus estudios, fecha de finalización de la carrera, si ya fue sellado por el ministerio y si fue sellado por el instituto.

Existen dos variantes de títulos: títulos terciarios y títulos de licenciatura. Ambos tienen todas las características que nombramos antes pero los títulos terciarios además tienen la característica de tener validación  “NACIONAL” o “PROVINCIAL” y los títulos de licenciatura poseen un tema de tesis, fecha de entrega de la tesis y cantidad de trabajos de investigación.

El sistema debe contar con las siguientes funcionalidades:

De cualquier tipo de título debemos poder saber si se puede ejercer con dicho título. Para que un título pueda ser ejercido debe contar con ambos sellos.

En el caso de los títulos de licenciatura debe ser posible compararlos. Un título de licenciatura es mayor a otro de acuerdo a la cantidad de trabajos de investigación.

Es importante contar con alguna funcionalidad en los títulos terciarios para saber si es válido a nivel “NACIONAL”.