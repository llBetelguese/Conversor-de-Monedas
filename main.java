import Construccion_de_la_API.Conversion;
import Construccion_de_la_API.MonedasISO4217;
import Construccion_de_la_API.consultasMonedas;

import java.util.Scanner;

public class main {

    public static void solicituddeusuario(Scanner scanner, consultasMonedas consulta, String monedaAConvertir, String monedaConvertida){

        double valor;
        Conversion cambio;

        System.out.println("Ingrese la cantidad para realizar el cambio");
        valor = Double.valueOf(scanner.nextLine());
        cambio = consulta.converisonDeDivisas(valor, monedaAConvertir, monedaConvertida);
        System.out.println("El valor de ["+valor+"] corresponde a ["+cambio.conversion_result()+"] teniendo la tasa de ["+cambio.conversion_rate()+"]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor;
        int num = 0;
        Conversion cambio;
        consultasMonedas consulta = new consultasMonedas();
        MonedasISO4217 nombreMonedas = new MonedasISO4217();

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

                        solicituddeusuario(scanner,consulta, nombreMonedas.getEstadosUnidos(), nombreMonedas.getArgentina() );

                        break;

                    case 2:

                        solicituddeusuario(scanner,consulta,nombreMonedas.getArgentina(), nombreMonedas.getEstadosUnidos());

                        break;

                    case 3:

                        solicituddeusuario(scanner,consulta, nombreMonedas.getEstadosUnidos(), nombreMonedas.getBrasil());
                        break;

                    case 4:

                        solicituddeusuario(scanner,consulta, nombreMonedas.getBrasil(), nombreMonedas.getEstadosUnidos());

                        break;

                    case 5:

                        solicituddeusuario(scanner,consulta, nombreMonedas.getEstadosUnidos(), nombreMonedas.getColombia());

                        break;

                    case 6:

                        solicituddeusuario(scanner,consulta, nombreMonedas.getColombia(), nombreMonedas.getEstadosUnidos());

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
