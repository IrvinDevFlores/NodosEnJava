package Herramientas;

public class MenuMessage {
    private String Message;

    public MenuMessage(){
       Message = "1. Crear pila \n 2. Ingresar numero al arbol \n 3. Mostrar listado del nodo";
    }

    public String GetMenuMessage(){
        return Message;
    }
}
