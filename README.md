

Programación Orientada a Objetos

PRÁCTICA GRUPAL 2022/2023. DISEÑO

Estamos interesados en programar una aplicación en Java que permita jugar al Lingo. Este

juego consiste en adivinar una palabra oculta en un número máximo de intentos.

Aunque hay que programar exactamente la especificación de este enunciado, podemos ver

en qué consiste el juego en la siguiente dirección: [https://www.cokitos.com/lingo-en-](https://www.cokitos.com/lingo-en-espanol/play/)

[espanol/play/](https://www.cokitos.com/lingo-en-espanol/play/)

Las palabras pueden tener 5 o 6 letras. Los jugadores tendrán un máximo de cinco intentos

para adivinarla. En cada intento, el jugador introduce su propuesta. El sistema responde

indicando las letras acertadas, y también las letras que están en la palabra, pero en distinta

posición.

Los jugadores accederán al sistema con un nombre de usuario (único) y una contraseña,

pero no se podrán registrar (ver párrafo dedicado al Administrador).

El juego tendrá dos modalidades: se podrán jugar partidas entre dos jugadores, y se podrán

realizar entrenamientos individuales. Estos entrenamientos solo se podrán realizar de

forma anónima, sin autenticación.

Las partidas tendrán un número de palabras configurable, desde 1 hasta 10. En una partida

cada jugador comienza con 0 puntos. Para cada palabra, si es acertada al primer intento se

suman 5 puntos; si es acertada al segundo intento se suman 4 puntos, y así sucesivamente.

Si no es acertada después de los cinco intentos, no se suman puntos y el turno pasa al otro

jugador.

El programa informará sobre los puntos obtenidos en cada palabra y también estará visible

el marcador de la partida.

Durante el juego se podrán utilizar dos tipos de pistas:

• Regalo de letra. Se podrá utilizar una vez por cada palabra. Cuesta 1 punto. No se

puede utilizar cuando solo falta una letra.

• Regalo de palabra. Se podrá utilizar una vez por partida o entrenamiento. Cuesta 3

puntos.

Cada jugador podrá consultar su perfil, donde aparecerá su nombre y sus estadísticas de

juego: partidas ganadas, empatadas, perdidas y puntos totales. En el perfil podrá elegir a

otro jugador del sistema y ver las estadísticas solo de las partidas que han jugado entre

ellos.

Cada jugador podrá consultar una clasificación o ranking, en el que aparecerá la lista de los

jugadores junto con sus estadísticas, ordenada por número de victorias. Será posible

cambiar este orden, ofreciendo la misma lista por orden alfabético del nombre.

El sistema contará con un administrador, que podrá dar de alta y baja a los jugadores.

También establecerá los parámetros del juego (número de letras, número de palabras y





Programación Orientada a Objetos

decisión sobre si la primera letra de las palabras se ofrece o también queda oculta). El

administrador podrá cargar un fichero de configuración, que contendrá los parámetros del

juego y después las palabras tanto de 5 como de 6 letras (ver NOTA). Por otra parte, el

administrador podrá obtener información completa de las partidas. Para cada una de ellas,

el administrador podrá consultar los jugadores, el marcador, las palabras e intentos

realizados y las pistas utilizadas.

En cuanto a los entrenamientos, se utilizarán los parámetros del juego, excepto el número

de palabras: cuando termine una palabra siempre saldrá otra, hasta que se decida terminar

el entrenamiento, momento en que el juego te informará de los puntos totales obtenidos.

NOTA- El fichero de configuración tendrá en la primera línea el número de letras de las

palabras, el número de palabras de las partidas y la decisión sobre la primera letra. Después,

en la segunda línea y sucesivas, aparecerán las diferentes palabras de 5 letras; en la

siguiente línea tendrá un 6 y después, en las sucesivas líneas, las diferentes palabras de 6

letras.

Ejemplo de fichero de configuración

5 3 no

arbol

coche

koala

6

Espada

Maleta

Ciervo

NORMAS Y ENTREGA.

\1. La práctica será realizada por los grupos de trabajo formados al efecto.

\2. La entrega consistirá en el diagrama de clases UML asociado al enunciado,

en formato fotográfico estándar y legible (no escrito a mano y después

escaneado)

\3. La entrega la realizará uno de los miembros del grupo (el que aparezca en

primer lugar en la tarea de formación de grupos de Aula Virtual), pero deberá

ser confirmada por el resto de los miembros del grupo.

\4. La entrega se realizará en el plazo que se indique en Aula Virtual.

