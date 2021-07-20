# Patrón State: un carrito de compras

Se desea modelar un carrito de compras siguiendo los siguientes lineamientos:
* El carrito tiene un estado y un conjunto de productos.
* Cada producto tiene solamente descripción y precio.
* Puede estar en alguno de los siguientes estados (solo uno a la vez):

1. Vacío.
2. Cargando.
3. Pagando.
4. Cerrado.

También, se le pueden indicar las siguientes instrucciones:

* Agregar un producto al carrito (pasándole como parámetro al método un objeto de tipo producto).
* Cancelar el carrito (vuelve a estar vacío).
* Volver al punto anterior ( salvo que esté cerrado).
* Pasar al siguiente estado (en el caso de estar cerrado, vuelve a estar vacío).

![img.png](img.png)

¿Y ahora?

Vamos a realizar el diagrama de clases y el código Java necesario para representar el
modelo enunciado.

# UML

![img_1.png](img_1.png)