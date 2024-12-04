
import java.util.Scanner;

public class Fornitore {

    public static void main(String[] args) {
        //nome, categoria, piva, luogo, telefono, email, linguaPrincipale, iban, nomeReferente, note tutti string
        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        while (cont) {
            System.out.println("Inserisci il tuo fornitore preferito:");

            System.out.println("Nome:");
            String nome = sc.nextLine();

            System.out.println("Categoria:");
            System.out.println("0 - PIANTE");
            System.out.println("1 - VASELLAME");
            System.out.println("2 - CONCIME");
            System.out.println("3 - GIARDINAGGIO");
            byte categoriaNum = sc.nextByte();
            sc.nextLine();
            TipoFornitore categoriaFornitore = TipoFornitore.values()[categoriaNum];

            System.out.println("Partita iva:");
            String partitaIva = sc.nextLine();

            System.out.println("Luogo:");
            String luogo = sc.nextLine();

            System.out.println("Telefono:");
            String telefono = sc.nextLine();

            System.out.println("Email:");
            String email = sc.nextLine();

            System.out.println("Lingua principale di comunicazione:");
            String lingua = sc.nextLine();

            System.out.println("Iban");
            String iban = sc.nextLine();

            System.out.println("Nome referente:");
            String nomeReferente = sc.nextLine();

            System.out.println("Note:");
            String note = sc.nextLine();

            System.out.println("Il tuo fornitore preferito e': \nNome: " + nome + "\nCategoria: " + categoriaFornitore + "\nPartita iva: " + partitaIva
                    + "\nLuogo: " + luogo + "\nTelefono: " + telefono + "\nEmail: " + email + "\nLingua di comunicazione: " + lingua
                    + "\nIban: " + iban + "\nNome del referente: " + nomeReferente + "\nNote: " + note);
            System.out.println("\n\n------------------------------------\n\n");
            System.out.println("Vuoi inserire un altro fornitore? (true o false)");
            cont = sc.nextBoolean();
            sc.nextLine();
        }
        System.out.println("Grazie per aver usato il nostro servizio, buona giornata.");
        sc.close();
    }
}
