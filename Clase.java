import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
/**
 * Write a description of class Clase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clase
{
    // instance variables - replace the example below with your own

    private ArrayList<String> lista;

    /**
     * Constructor for objects of class Alumnos
     */
    public Clase()
    {
        lista = new ArrayList<String>();
        lista.add("Adeva Tranche, Adrián");
        lista.add("Aller González, Francisco Javier");
        lista.add("Álvarez Prieto, Noelia");
        lista.add("Barrionuevo Pérez, Manuel");
        lista.add("Bóveda del Río, José Antonio");
        lista.add("de la Viuda Crespo, Ignacio");
        lista.add("Encina Maestro, David");
        lista.add("Felix Nañez, Kevin");
        lista.add("Fernández Diez, Daniel");
        lista.add("Fernández González, Javier");
        lista.add("Fernández Rincón, Jesús");
        lista.add("Fuentes Álvarez, Francisco José");
        lista.add("García Juárez, David");
        lista.add("García Serrano, Rubén");
        lista.add("González Álvarez, David");
        lista.add("López Beltrán, Víctor");
        lista.add("Lora García, Sandra");
        lista.add("Melcón Diez, Víctor");
        lista.add("Menéndez Pouso, Francisco José");
        lista.add("Pérez Bayón, Álvaro");
        lista.add("Pradera San José, Daniel");
        lista.add("Prieto Mediavilla, Gabriel");
        lista.add("Robles González, Miguel Ángel");
        lista.add("Sánchez Manzano, Adán");
        lista.add("Serrano García, Verónica");
        lista.add("Tascón González, Anibal");

    }

    public void emparejar()
    {
        Collections.shuffle(lista);
        int count = 0;
        int num1 = 0;
        if (lista.size()%2==0)
        {
            while (count != (lista.size()/2))
            {
                 String cadena;
                if (count < 10)
                {
  
                   cadena= ("000"+count);
                } else
                {
         
                   cadena= ("00"+count);
                
                }
                count++;
                System.out.println("Pareja número: "  + cadena  +" "+  lista.get(num1)  + " Y " + lista.get(num1 + 1) );
                num1 = num1 +2;
           
            }
        }
        else
        {
            count = count + 2;
            System.out.println("Pareja número: 0001 "+  lista.get(0)  + " , " + lista.get(1) +" Y " + lista.get(2));
            num1 = 3;
            while (count != (lista.size()/2)+1)
            {
                 String cadena; 
                if (count < 10)
                {
                   
                   cadena= ("000"+count);
                } else
                {

                   cadena= ("00"+count);
                
                }
                System.out.println("Pareja número: "  + cadena  +" "+  lista.get(num1)  + " Y " + lista.get(num1 + 1) );
                num1 = num1 + 2;
                count++;
            }

        }

    }
}
