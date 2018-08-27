package Reloj;

import Logica.CronometroTemporizador;
import java.util.Scanner;

public class Reloj {

    public static void main(String[] args) {
        int numero,caso;
        CronometroTemporizador ct = new CronometroTemporizador();
        Scanner sc= new Scanner(System.in)
        System.out.println("¿Hasta que tiempo quiere cronometrar?");
        numero = sc.nextInt();
        ct.gettiempo(numero);
        System.out.println("¿En que unidad de tiempo?");
        System.out.println("1. Milesimas");
        System.out.println("2. Centesimas");
        System.out.println("3. Decimas");
        System.out.println("4. segundos");
        System.out.println("5. Minutos");
        System.out.println("6. Horas");
        caso=sc.nextInt();
        
        switch(caso){
            case 1: 
                ct.gettopemilesimas(numero);
                break;
            case 2:
                ct.gettopecentesimas(numero);
                break;
            case 3:
                ct.gettopedecimas(numero);
                break;
            case 4:
                ct.gettopesegundos(numero);
                break;
            case 5:
                ct.gettopeminutos(numero);
                break;
            case 6:
                
                
        }
    }
    
}
