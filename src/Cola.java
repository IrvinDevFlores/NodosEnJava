public class Cola
{
    Object[] arr;
    public Cola()
    {
        arr = new Object[0];
    }
    String Imprimir(String mensaje)
    {
        String ArrayEnString = "";
        for(Object data : arr)
        {
            ArrayEnString += data.toString() + "\n";
        }
        return String.format("%s\n%s",mensaje,ArrayEnString);
    }

    void Encolar(Object obj)
    {
        Object temp[] = new Object[ arr.length + 1];
        for(int i = 0; i < arr.length; i++)
        {
            temp[i] = arr[i];
        }

        arr = temp;
        int position = arr.length - 1;
        arr[position] = obj;


    }

    void Desencolar()
    {
        Object[] temp = arr;
        int nuevoTamaño = arr.length -1;
        Object[] nuevoArreglo = new Object[nuevoTamaño];
        for(int i = 0; i < nuevoArreglo.length; i++)
        {
            nuevoArreglo[i] = temp[i + 1];
        }

        arr = nuevoArreglo;
    }

    Object Primero(){
        return arr[0];
    }

    boolean EstaVacia()
    {
        return (arr.length == 0) ? true:false;
    }
}
