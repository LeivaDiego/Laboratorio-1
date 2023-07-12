/**
 * Clase de kotlin que muestra en consola mensajes especificos que le indican al usuario que tipo de dato tiene la
 * variable originalValue e informacion extra dependiendo de que tipo de dato sea
 * @author diego leiva
 */
class ItemData(val originalValue: Any?){

    /**
     * Funcion que muestra que tipo de dato tiene la variable originalValue
     * @return  L"tamano cadena" si es string. M10, M5, M2, null si es integer y es multiplo de 10, 5, 2 o no aplica
     * niguno de los anteriores respectivamente.Verdadero o Falso si esl Boolean. Y null si es otro tipo de dato
     */
    fun getType(): String? {
        when(originalValue){
            is String -> return "cadena"
            is Int -> return "entero"
            is Boolean -> return "booleano"
            else -> return null
        }

    }

    /**
     * Funcion que muestra informacion del valor dependiendo de que tipo de dato sea
     * @return un string con el tipo de dato, ya sea String, Integer, Boolean o null si no es niguno de los anteriores
     */
    fun getInfo(): String? {
        when(originalValue){
            is String -> return "L${originalValue.length}";
            is Int ->{
                val value = originalValue as Int
                when{
                    (value % 10 == 0) -> return "M10"
                    (value % 5 == 0) -> return "M5"
                    (value % 2 == 0) -> return "M2"
                    else -> return null
                }
            }
            is Boolean -> {
                if (originalValue) {
                    return "Verdadero"
                } else return "Falso"
            } else -> return null
        }
    }
}