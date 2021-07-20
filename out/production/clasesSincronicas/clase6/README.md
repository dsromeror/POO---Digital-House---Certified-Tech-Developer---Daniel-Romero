# Ejercicio en clase

Las impresoras tienen un modelo, un tipo de conexión, ya que muchas son USB y otras
inalámbricas. Poseen una fecha de fabricación y todas ellas saben la cantidad de hojas
disponibles que tienen.

<table>
<tr style="text-align: center; vertical-align: middle;">Impresora</tr>
<tr>- modelo: String</tr>
<tr>- tipoConecion: String</tr>
<tr>- fechaFabricacion: String</tr>
<tr>- hojasDisponibles: Int</tr>
<tr style="border: 10px solid black;"></tr>
<tr>+ tienePapel(): boolean</tr>
<tr>+ Impresora (modelo: String, tipoConexion: String, fechaFabricacion: String)</tr>
<tr>+ Impresora (modelo: String, tipoConexion: String)</tr>
<tr>+ imprimir(texto: String)</tr>
</table>