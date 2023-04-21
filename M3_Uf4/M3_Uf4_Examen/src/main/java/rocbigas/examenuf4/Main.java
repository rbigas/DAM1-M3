package rocbigas.examenuf4;

import java.time.LocalDate;
import java.time.Month;

/**
 * 
 *
 * @author rocbigas
 */
public class Main {

    public static void main(String[] args) {
        Asseguranca[] llistaAss = {
            new Vida(LocalDate.of(2001, Month.MARCH, 11), "Roc Bigas Ortuño", LocalDate.now(), "21782429A", 55000.00),
            new Llar("C/Sant Vicenç 25, 08001 Barcelona", LocalDate.now(), "21782429A", 155600.00),
            new Cotxe("5478JKH", LocalDate.of(2016, Month.APRIL, 24), 4, LocalDate.now(), "21782429A", 30500.00),
            new Vida(LocalDate.of(2001, Month.MARCH, 11), "Roc Bigas Ortuño", LocalDate.now(), "21782429A", 55000.00),
            new Cotxe("5478JKH", LocalDate.of(2016, Month.APRIL, 24), 4, LocalDate.now(), "21782429A", 30500.00)
        };
        
        for (Asseguranca llistaAs : llistaAss) {
            System.out.println(llistaAs);
        }
        
        System.out.println("Preu Vida: " + (((Vida) llistaAss[0]).getPreu()));
        System.out.println("Preu Llar: " + ((Llar) llistaAss[1]).getPreu());
        System.out.println("Preu Cotxe: " + ((Cotxe) llistaAss[2]).getPreu());

        System.out.println("Punts Vida: " + (((Vida) llistaAss[0]).puntsPremi()));
        System.out.println("Punts Llar: " + ((Llar) llistaAss[1]).puntsPremi());
        System.out.println("Punts Cotxe: " + ((Cotxe) llistaAss[2]).puntsPremi());
    }
}
