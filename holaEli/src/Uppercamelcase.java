// upper camelcase (se usa solo para clases)
public class Uppercamelcase {
    public static void main(String[] args) {
        int celphone = 1127003907;
        int celPhone = 1100000000; //java es sensible a mayusculas y minusculas se diferencian haciendo con mayusculas o minusculas
        System.out.println(celphone);
        System.out.println(celPhone);

        String $countryName = "Venezuela"; //se pueden usar simbolos como $, _
        System.out.println($countryName);
        String _backgroundColor = "Green";
        System.out.println(_backgroundColor);

        String currency$ = "Bs";
        System.out.println(currency$);
        String background_color = "Blue";
        System.out.println(background_color);

        int POSITION = -5;
        int MAS_WIDTH = 9999;
        int MIN_WIDTH = 1;

        //Lower camel case (se usa solo para nombres de variables y nombres de metodos)
        String fullName = "Eliezer Martinez Landaeta";
        int sizeInCentimeters = 40;


    }
}
