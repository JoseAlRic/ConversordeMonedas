# ConversordeMonedas

El código implementa una aplicación de consola en Java para la conversión de monedas y temperaturas. 
La aplicación utiliza la clase JOptionPane para la entrada y salida de datos del usuario.

La aplicación crea instancias de las clases Moneda y Temperatura para realizar la conversión de monedas y temperaturas, respectivamente.

La aplicación se ejecuta en un bucle infinito usando la sentencia while(true). En cada iteración, se presenta al usuario un menú de opciones 
usando el método JOptionPane.showInputDialog(). El usuario puede seleccionar cualquiera de las opciones "Conversor de Moneda" o "Conversor de Temperatura".

Si el usuario selecciona la opción de conversión de moneda, la aplicación solicita al usuario ingresar la cantidad de dinero a convertir. La entrada se valida 
utilizando el método ValidarNumero(), el cual verifica si la entrada es un número válido. Si la entrada es válida, se llama al método Moneda.ConvertirMonedas() 
para realizar la conversión de moneda. Después de completar la conversión, se le pregunta al usuario si desea confirmar si desea realizar otra conversión. 
Si el usuario confirma, el bucle continúa. De lo contrario, la aplicación termina.

Si el usuario selecciona la opción de conversión de temperatura, la aplicación solicita al usuario ingresar el valor de temperatura a convertir. La entrada se 
valida utilizando el método ValidarNumero(). Si la entrada es válida, se llama al método Temperatura.ConvertirTemperatura() para realizar la conversión de temperatura. 
Después de completar la conversión, se le pregunta al usuario si desea confirmar si desea continuar. Si el usuario confirma y la entrada es válida, el bucle continúa. 
De lo contrario, la aplicación termina.

El método ValidarNumero() se utiliza para validar la entrada del usuario en ambas opciones de conversión. Intenta analizar la cadena de entrada como un valor 
double y devuelve true si la entrada es un número válido. De lo contrario, devuelve false.

El código implementa una aplicación de consola que permite la conversión de monedas y temperaturas. La aplicación utiliza la entrada y salida de datos del 
usuario mediante la clase JOptionPane.
