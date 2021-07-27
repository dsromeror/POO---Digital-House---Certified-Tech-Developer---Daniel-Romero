# Ejercicio
Crearemos una estrategia para tratar el virus del COVID. Puede que les parezca que este
no es un uso muy práctico de Strategy Pattern, pero imaginemos una situación similar en
cualquier juego.

En nuestro caso, ¡esto podría ser parte de un juego que se desarrolla en un Hospital de
enfermedades infecciosas!

Muy a menudo, la estrategia se usa en los juegos para manejar el movimiento o el
comportamiento de los diferentes personajes. Se debe implementar para poder inocular la
vacuna de cada tipo, indicando en cada caso cuál fue la aplicada.
De acuerdo a cada vacuna, tendremos el nombre y cantidad de dosis a aplicar según
consta en el cuadro siguiente.

<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;}
.tg td{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  overflow:hidden;padding:10px 5px;word-break:normal;}
.tg th{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}
.tg .tg-c3ow{border-color:inherit;text-align:center;vertical-align:top}
.tg .tg-7btt{border-color:inherit;font-weight:bold;text-align:center;vertical-align:top}
.tg .tg-0pky{border-color:inherit;text-align:left;vertical-align:top}
</style>
<table class="tg">
<thead>
  <tr>
    <th class="tg-7btt">Nombre</th>
    <th class="tg-7btt">Origen<br></th>
    <th class="tg-7btt">CantidadDosis<br></th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-0pky">Oxford-AstraZeneca<br></td>
    <td class="tg-c3ow">Inglaterra<br></td>
    <td class="tg-c3ow">unidosis<br></td>
  </tr>
  <tr>
    <td class="tg-0pky">Cansino</td>
    <td class="tg-c3ow">China<br></td>
    <td class="tg-c3ow">unidosis<br></td>
  </tr>
  <tr>
    <td class="tg-0pky">Moderna</td>
    <td class="tg-c3ow">EEUU<br></td>
    <td class="tg-c3ow">dos dosis<br></td>
  </tr>
  <tr>
    <td class="tg-0pky">Pfizer<br></td>
    <td class="tg-c3ow">EEUU<br></td>
    <td class="tg-c3ow">dos dosis<br></td>
  </tr>
  <tr>
    <td class="tg-0pky">Sputnik<br></td>
    <td class="tg-c3ow">Rusia<br></td>
    <td class="tg-c3ow">dos dosis<br></td>
  </tr>
</tbody>
</table>

Cada paciente tiene, por lo tanto, además de su nombre la cantidad de vacunas aplicadas.
En el vacunatorio se van creando pacientes y aplicando vacunas.
Se necesitarán desarrollar las siguientes funcionalidades:
Crear pacientes con nombre.
Definir cuál vacuna va a ser aplicada.
Debemos reproducir la siguiente situación en una clase vacunatorio que contenga el
método main.
En el vacunatorio crearemos personas, se indicará qué vacunas usar y se aplicarán a cada
persona.
Debemos indicar en cada aplicación si la persona tiene que aplicarse más vacunas o ya
está completa su vacunación (por supuesto, esto es diferente para cada vacuna).