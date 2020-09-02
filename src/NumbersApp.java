import Herramientas.Data;
import Herramientas.MenuMessage;
import Herramientas.Message;

public class NumbersApp {

    void Run(){
        AlmacenNumeros almacenNumeros = new AlmacenNumeros();

        MenuMessage menu = new MenuMessage();

     while (true){
         String me = Data.ObtenerString(menu.GetMenuMessage());
         boolean NoEsEntero = Data.EsEntero(me);
         if(NoEsEntero == false){
             Message.Show("La cadena no contiene nigun numero");
             continue;
         }
         int option = Data.ConvertirStringAEntero(me);
         boolean LaOpcionNoEstaDisponible = !(option > 0 && option< 4);
         if(LaOpcionNoEstaDisponible)
         {
             Message.Show("La opcion no esta disponible");
             continue;
         }
         switch (option){
             case 1:
                 almacenNumeros.CrearAlmacen();
                 break;

             case 2:
                 almacenNumeros.IngresarNumeroAlArbol();
                 break;

             case 3:
                 almacenNumeros.ImprimirNodo();
                 break;
         }
     }

    }
}
