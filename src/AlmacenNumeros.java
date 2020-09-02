import Herramientas.Data;
import Herramientas.Message;

import javax.swing.*;

public class AlmacenNumeros
{
    private Pila Almacen;


    void CrearAlmacen(){
        Almacen = new Pila();
        int limite = 9, indices = 9;
        for(int i = 0; i <= limite; i++)
        {

            Almacen.Apilar(new Nodo(indices));
            indices--;
        }
        Message.Show("Almacen creado ");
    }

    public Pila ObtenerAlmacenNumeros(){
        return Almacen;
    }

    void IngresarNumeroAlArbol()
    {
        boolean EstaVacia = (Almacen == null) ? true : false;
        if(EstaVacia)
        {
            Message.Show("Esta vacio");
            return;
        }

        String NumeroIntroducido = Data.ObtenerString("Introduzca un numero: ");
        int PrimerNumero = Data.ConvertirStringAEntero(Data.ExtraerPrimerCaracater(NumeroIntroducido));

        int Indice = 0;
        int LongitudArreglo = Almacen.arr.length;
        for(int i = 0; i < LongitudArreglo; i++)
        {
            Nodo nodo = (Nodo) Almacen.arr[i];
            int IdEnPila = nodo.Id;
            boolean EstaEnLaPila = (PrimerNumero == IdEnPila) ? true : false;
            if(EstaEnLaPila)
            {
                Indice = IdEnPila;
                boolean NumerosEstanEnIndiceCero = Indice != 0;
                if(NumerosEstanEnIndiceCero)
                {
                    nodo.colaNumeros.Encolar(new Integer(NumeroIntroducido));
                    return;
                }
                nodo.colaNumeros.Encolar(NumeroIntroducido);
                Almacen.Substituir(nodo,Indice);
            }

        }
        JOptionPane.showMessageDialog(null,Indice);
        Message.Show("Numero ingresado correctamente");
    }

    void ImprimirNodo(){
        boolean EstaVacia = (Almacen == null) ? true : false;
        if(EstaVacia)
        {
            Message.Show("Esta vacio");
            return;
        }

        String NumeroIntroducido = Data.ObtenerString("Introduzca un numero: ");
        if(Data.EsEntero(NumeroIntroducido)==false)
        {
            return;
        }

        int NumeroABuscar = Data.ConvertirStringAEntero(NumeroIntroducido);
            Nodo nodo = (Nodo) Almacen.arr[NumeroABuscar];
            String MensajeImprimir = String.format("El nodo %d contiene: \n", nodo.Id);

            String Numeros = nodo.colaNumeros.Imprimir(MensajeImprimir);
            Message.Show(Numeros);

        }
}
