# RESPUESTAS PARTE PRÁCTICA
## EJ1
Primero he compilado el maven para ver que errores saltaban.
Los errores que tuve que eliminar fueron:
- Falta de espacios en blanco antes de "{"
- Un espacio en blanco entre int y []
- Espacios en blanco tras el fin de texto y antes del cambio de línea
- Declaración de varias variables en la misma línea
- Falta de corchetes en un if
Maven los toma como errores, lo que no significa que el código en sí esté mal.

Tras los cambios no hay errores al compilar con maven
![](/e1.png)

Posteriormente he leído el programa para saber qué hace y he cambiado los nombres de las variables para que se entienda al primer vistazo.


## EJ2
He comentado las clases en formato javadoc. 
A cotinuación he ejecutado el comando `mvn javadoc:javadoc` en la terminal, he solucionado los errores que me daba el maven y al volverlo a ejecutar se me ha generado el javadoc dentro de `target/reports/apidocs`
#### Clase Pedido
![](/e2Pedido.png)
#### Clase Producto
![](/e2Producto.png)

## EJ3
He generado pruebas buscando los valores límite.
Posteriormente ejecuté las pruebas en maven.
![](/testPedido1.png)