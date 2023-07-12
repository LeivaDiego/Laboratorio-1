class ItemData(val originalValue: Any?){
    fun getType(): String? {
        when(originalValue){
            is String -> return "cadena"
            is Int -> return "entero"
            is Boolean -> return "booleano"
            else -> return null
        }

    }

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