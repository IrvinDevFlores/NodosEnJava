package Us;

public class Pila {
    Object[] array;
    public Pila()
    {
        array = new Object[0];
    }
    void Apilar(Object obj){
        Object[] temp = new Object[array.length + 1];
        for(int i = 0; i < array.length; i++)
        {
            temp[i + 1] = array[i];
        }
        temp[0] = obj;
        array = temp;
    }

}
