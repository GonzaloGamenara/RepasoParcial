Para un grupo de científicos se está desarrollando un sistema de recolección y análisis de datos. Su
trabajo es diseñar una clase Experimento que tenga los campos:
• Medida, un String para saber que se está controlando
• Especie, otro String con la especie animal observada
• Observación Inicial: objeto de clase Observación que se hizo al comienzo del experimento.
• Observación Final: objeto de la clase Observación que se hizo al final del experimento.
Haga los getters y setters de esta clase. En cuanto a su constructor solo pase como argumentos los
campos String.
Con respecto a la clase Observación, tiene los siguientes campos
• umbral, de tipo double
• cantidad, entero
• máximo, de tipo double
• mínimo, de tipo double
• promedio, de tipo double
Al crear una observación se le debe pasar al constructor un umbral, el nro que debe ser superado al
tomar datos, para tenerlo en cuenta en las estáticas que se arman.
Se debe codificar un método tomarDatos que pide datos de la medida que se estableció, en
definitiva son números double. Se deben registrar datos hasta que el operador ingrese un número
negativo. Este método es el encargado de llenar los campos cantidad (de datos), máximo, mínimo y
promedio. Recordar que los datos se tienen en cuenta si y solo si superan al umbral.
En la clase Main pida datos para un experimento, incluyendo tomar datos para ambas
observaciones. Luego muestre todo los datos obtenidos y si el peso máximo de la observación final
es menor que el peso mínimo de la observación inicial y la suma de las cantidades de ambas
observaciones supera a 6, entonces informe por pantalla que la especie observada presenta
problemas.
Nota: tener en cuenta que si abre un Scanner en main, debe pasarlo como argumento al llamar al
método tomarDatos, ya que si en dicho método abro y cierro un scanner, me cierra el de maín
(porque System.in es el mismo)
