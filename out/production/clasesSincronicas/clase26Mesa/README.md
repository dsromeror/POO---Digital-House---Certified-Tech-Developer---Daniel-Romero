# Ejercicio

Se trata de buscar e informar el tiempo de un recorrido en el mapa dados dos puntos.
Cada punto se ubica en el mapa de acuerdo a los dos valores: latitud y longitud. La manera
de calcular el tiempo de recorrido es según cómo se mueve la persona, pudiendo ser por
medio de automóvil, bicicleta o caminando.

El tiempo en minutos se puede calcular con la fórmula siguiente:

* Caminando: distancia / 0.20366 * 13
* Automóvil: distancia / 0.40366 * 4
* Bicicleta: distancia / 0.050366 * 1.5

Siendo la distancia = abs(latitud1 - latitud2) + abs(longitud1 - longitud2).

Deberán desarrollar las siguientes funcionalidades:

Poder calcular el tiempo de recorrido, dado un par de puntos y una forma de
transportarse.

Poder definir una clase punto que tendrá un constructor con parámetros que
serán latitud y longitud.

Poder calcular la distancia entre dos puntos con un método de la clase punto que
recibe como parámetro a otro punto.

Reproducir la siguiente situación en una clase CalculaMapa que contenga el método main:

1. Crear un par de puntos de un mapa.
2. Calcular y mostrar los tiempos de recorrido de acuerdo a las diferentes maneras de
transportarse.

Nota: el valor absoluto se calcula haciendo uso del método abs de la clase Math:
java.lang.Math.abs

# UML

![imagen](https://user-images.githubusercontent.com/75101605/127239707-5d1caaac-c24a-4d6a-81b0-c3b041c35ff9.png)
