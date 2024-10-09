import Construccion_de_la_API.Conversion;
import Construccion_de_la_API.consultasMonedas;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        double valor;
        Conversion cambio;
        consultasMonedas consulta = new consultasMonedas();

        while(num != 7) {

            try{

                System.out.println("=".repeat(35) +"\n"+
                        "1) Dólar =>> Peso Argentino" +"\n"+
                        "2) Peso argentino =>> Dólar" +"\n"+
                        "3) Dólar =>> Real brasileño" +"\n"+
                        "4) Real brasileño =>> Dólor" +"\n"+
                        "5) Dólar =>> Peso colombiano" +"\n"+
                        "6) Peso colombiano =>> Dólar" +"\n"+
                        "7) Salir" +"\n"+
                        "Elija una opción válida" +"\n"+
                        "=".repeat(35));
                num = Integer.valueOf(scanner.nextLine());

                switch (num) {
                    case 1:

                        System.out.println("Ingrese la cantidad para realizar el cambio");
                        valor = Double.valueOf(scanner.nextLine());
                        cambio = consulta.DolarAPesoArgentino(valor);
                        System.out.println("El valor de ["+valor+"] corresponde a ["+cambio.conversion_result()+"] teniendo la tasa de ["+cambio.conversion_rate()+"]");
                        break;

                    case 2:

                        System.out.println("Ingrese la cantidad para realizar el cambio");
                        valor = Double.valueOf(scanner.nextLine());
                        cambio = consulta.pesoArgentinoDolar(valor);
                        System.out.println("El valor de ["+valor+"] corresponde a ["+cambio.conversion_result()+"] teniendo la tasa de ["+cambio.conversion_rate()+"]");

                        break;

                    case 3:

                        System.out.println("En trabajo 3");

                        break;

                    case 4:

                        System.out.println("En trabajo 4");

                        break;

                    case 5:

                        System.out.println("En trabajo 5");

                        break;

                    case 6:

                        System.out.println("En trabajo 6");

                        break;

                    case 7:

                        num = 7;

                        break;

                    default:
                        System.out.println("Opción no válida");

                }

            }catch (NumberFormatException e) {

                System.out.println("Caracter no adecuado, recuerda sólo ingresar números"+"\n"+e);

            }


        }
    }

}
