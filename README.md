# AUTOMATIZACION CON SELENIUM Y CUCUMBER  
Reto 01 Selenium / Cucumber

En este proyecto la mision es Automatizar una Web (https://sanangel.com.co/) realizando varias(8) busquedas automaticas y validando que los resultados concuerden con lo esperado


![image](https://user-images.githubusercontent.com/95547617/145333022-d6d61ce1-3367-40b5-9910-d85ddd0ec814.png)


Este es un vistazo al orden de las clases, packages y archivos importados para la automatizacion

![image](https://user-images.githubusercontent.com/95547617/145331826-c8b3ae7e-84ff-4cdc-a79b-7f3b3caa4a34.png)


En esta clase (GoogleChromeDriver) se definen las Acciones del GoogleChromeDriver, las cuales son instanciar objeto, parámetros de inicio,
y preparar la carga de la URL donde estara la pagina a Automatizar


![image](https://user-images.githubusercontent.com/95547617/145331545-22186caa-6e7b-47f8-97f4-740c8a7299e5.png)

Clase (Excel) destinada para recorrer el Excel que crearemos con los productos a buscar

![image](https://user-images.githubusercontent.com/95547617/145331726-9c17053f-23e8-4136-95ca-81a21a580976.png)


Esta es la clase (SanAngelPage) la cual se encargara de ejecutar la Automatizacion y Test en cuestion


![image](https://user-images.githubusercontent.com/95547617/145332015-8fd8116d-2b7a-4c88-8f59-e0b3828c391e.png)


A continuacion detallo las acciones de la clase "SanAngelTest"

Definimos los Xpath, los cuales nos enlazan directamente con las barras de busqueda y seleccion que debemos acceder, y el ArrayList
el cual nos ayudara para recorrer el Excel 

![image](https://user-images.githubusercontent.com/95547617/145332133-f0849113-1057-4c5a-8a31-4a2e7d72cd84.png)


En el "@Before" instanciamos el Objeto "options" para asi usar las acciones del WebDriver/GoogleChromeOptions
y definimos el valor de "listaProductos" para asi poder usar el excel, la ruta del archivo (Productos.xslx) y la Hoja a usar (Hoja1)


![image](https://user-images.githubusercontent.com/95547617/145332375-71d818ba-5804-4ae6-a4fe-f11faf547484.png)

En el método "buscarproductos" anexamos el "driver.get" y asi pegamos la URL de la pagina a evaluar, una vez realizado esto
procedemos a crear el ciclo "for", el cual nos sirve para recorrer el Array (en este caso Excel).
Allí usamos los "finElement", "Thread.sleep" y "assertEquals", Los cuales respectivamente son para: Buscar elemento, tiempo de espera de carga en la Web, y validar
que el producto encontrado corresponda con el que se busca 


![image](https://user-images.githubusercontent.com/95547617/145332751-86538b76-96ba-41b0-aa1b-d253db351a1a.png)


En este ultimo método "teardown" cerramos el proceso de manera exitosa con "driver.quit"

![image](https://user-images.githubusercontent.com/95547617/145332806-7341621c-c49b-4ba4-82ad-25212ec33849.png)












