package Herramientas;

import javax.swing.*;

public class Data {

    public static int ObtenerInteger(String m){
        String strInput = JOptionPane.showInputDialog(null,m);

        return Integer.parseInt(strInput);
    }


    public static String ObtenerString(String m){
        return JOptionPane.showInputDialog(null,m);
    }

    public static String ExtraerPrimerCaracater(String cadena)
    {
        return cadena.substring(0,1);
    }

    public static int ConvertirStringAEntero(String string)
    {
        return Integer.parseInt(string);
    }
    public static boolean EsEntero(String s)
    {
        boolean x = false;
        int y = 0;
        try
        {
           y =  Integer.parseInt(s);
           x = true;
        }catch (Exception e)
        {

            x = false;
        }
        return x;
    }
}
