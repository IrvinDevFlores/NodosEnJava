import Herramientas.Data;

public class Pila
{
    Object arr[];
    Pila(){
        arr = new Object[0];
    }


    boolean ExisteIndice(String indice)
    {
        int IndiceConvertido = Data.ConvertirStringAEntero(indice);
        boolean Existe = false;
        for(Object i : arr)
        {
            Nodo d = (Nodo)i;
            Existe = ( 0 >= IndiceConvertido && IndiceConvertido <= arr.length) ? true: false;
        }
        return Existe;
    }

    void Apilar(Object x){
        Object temp[] = new Object[arr.length + 1];
        for(int i = 0; i < temp.length -1; i++)
        {
            temp[i + 1] = arr[i];
        }

        temp[0] = x;
        arr = temp;
    }

    void Desapilar()
    {
        Object[] temp = arr;
        Object[] nuevoArreglo = new Object[arr.length -1];
        for(int i = 0; i < nuevoArreglo.length; i++)
        {
            nuevoArreglo[i] = temp[i];
        }
        arr = nuevoArreglo;
    }

    Object Primero(){return arr[0];}

    boolean EstaVacia(){return (arr.length == 0) ? true: false;}

    void Redefinir()
    {
        Object tmp[]=new Object[arr.length+1];
        for(int i=0;i<arr.length;i++)
        {
            tmp[i]=arr[i];
        }
        arr=tmp;
    }

    void Substituir(Object data,int index){
        arr[index] = data;
    }

    String Imprimir(String mensaje)
    {
        String ArrayEnString = "";
        for(Object data : arr)
        {
            ArrayEnString += data.toString();
        }
        return String.format("%s\n%d",mensaje,ArrayEnString);
    }

}


