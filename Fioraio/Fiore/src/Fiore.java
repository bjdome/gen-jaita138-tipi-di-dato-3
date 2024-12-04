
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Fiore {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (cont) {
            System.out.println("Inserisci il tuo fiore preferito:");

            System.out.println("Nome:");
            String nome = sc.nextLine();

            System.out.println("Tipologia:");
            System.out.println("0 - ANNUALE");
            System.out.println("1 - PERENNE");
            System.out.println("2 - BULBOSO");
            System.out.println("3 - ARBUSTIVO");
            System.out.println("4 - TREPPIANTE");
            System.out.println("5 - ACQUATICO");
            byte tipologiaNum = sc.nextByte();
            TipologiaFiore tipologiaFiore = TipologiaFiore.values()[tipologiaNum];

            System.out.println("Prezzo:");
            float prezzo = sc.nextFloat();

            System.out.println("Quantita':");
            short quantita = sc.nextShort();
            sc.nextLine();

            System.out.println("Colore principale:");
            String colorePrincipale = sc.nextLine();

            System.out.println("Inizio disponibilita':");
            String inizioDispStr = sc.nextLine();
            LocalDate inizioDisponibilita = LocalDate.parse(inizioDispStr, formatter);

            System.out.println("Fine disponibilita':");
            String fineDispStr = sc.nextLine();
            LocalDate fineDisponibilita = LocalDate.parse(fineDispStr, formatter);

            System.out.println("Profumo (true o false):");
            boolean profumo = sc.nextBoolean();

            System.out.println("Artificiale (true o false):");
            boolean artificiale = sc.nextBoolean();

            System.out.println("Il tuo fiore preferito e': \nNome: " + nome + "\nTipologia: " + tipologiaFiore + "\nPrezzo: " + prezzo
                    + "\nQuantita': " + quantita + "\nColore principale: " + colorePrincipale + "\n Disponibile da: " + inizioDisponibilita + " a " + fineDisponibilita
                    + "\nProfumo: " + profumo + "\nArtificiale: " + artificiale);
            System.out.println("\n\n------------------------------------\n\n");
            System.out.println("Vuoi inserire un altro fiore? (true o false)");
            cont = sc.nextBoolean();
            sc.nextLine();
        }
        sc.close();
    }
}
