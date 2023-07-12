/**
 * Clase de java que muestra en consola mensajes especificos que le indican al usuario que tipo de dato tiene la
 * variable originalValue e informacion extra dependiendo de que tipo de dato sea
 * @author diego leiva
 */
public class ItemDataJ {
    private Object originalValue;
    public ItemDataJ(Object originalValue){
        this.originalValue = originalValue;
    }

    /**
     * Metodo que muestra que tipo de dato tiene la variable originalValue
     * @return un string con el tipo de dato, ya sea String, Integer, Boolean o null si no es niguno de los anteriores
     */
    public String getType(){
        if (originalValue instanceof String){
            return "cadena";
        } else if (originalValue instanceof Integer){
            return "entero";
        } else if (originalValue instanceof Boolean){
            return "booleano";
        } else {
            return null;
        }
    }

    /**
     * Metodo que muestra informacion del valor dependiendo de que tipo de dato sea
     * @return L"tamano cadena" si es string. M10, M5, M2, null si es integer y es multiplo de 10, 5, 2 o no aplica
     * niguno de los anteriores respectivamente.Verdadero o Falso si esl Boolean. Y null si es otro tipo de dato
     */
    public String getInfo(){
        if (originalValue instanceof String) {
            return "L" + ((String) originalValue).length();
        } else if (originalValue instanceof Integer value){
            if (value % 10 == 0){
                return "M10";
            } else if (value % 5 == 0){
                return "M5";
            } else if (value % 2 == 0){
                return "M2";
            } else {
                return null;
            }
        } else if (originalValue instanceof Boolean){
            if ((Boolean)originalValue){
                return "Verdadero";
            }else {
                return "Falso";
            }
        } else {
            return null;
        }
    }
}
