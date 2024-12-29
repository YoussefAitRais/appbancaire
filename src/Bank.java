import java.util.ArrayList;
import java.util.Scanner;


public class Bank {
    static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Client> clients = new ArrayList();
    public static ArrayList<Compte> comptes = new ArrayList<>();

    public static void main(String[] args) {
        int choix = 0;
        while (choix != 5)
        {
            System.out.println("--------------------------");

            System.out.println("1 >> Cree un compte");
            System.out.println("2 >> Cree un client");
            System.out.println("3 >> Gerer les operations");
            System.out.println("4 >> Efectuer un Fitlrage");
            System.out.println("5-> Quitter le programme");

            System.out.println("---------------------------");

            System.out.println("Veullez Entrer Votre Choix!");

            choix = scanner.nextInt();
            switch (choix){

                case 1 :
                    menuCompte();
                    break;
                case 2 :
                    menuclient();
                    break;
                case 3 :
                    menuOperation();
                    break;
                case 4:
                    // Gerant des operation
                    break;
                case 5:
                    System.exit(0);
                    break;
            }

        }
    }
    public static void menuclient()
    {
        Client client = new Client();

        int choix = 0;
                while (choix!=2)
        {
            System.out.println("--------------------------");
            System.out.println(" 1>> Cree un Client");
            System.out.println(" 2>> Afficher un CLient");
            System.out.println("---------------------------");

            choix = scanner.nextInt();

            switch (choix)
            {
                case 1 :
                    client.ajouterClient();
                    break;
                case 2 :
                    client.afficherClient();
                    break;
                case 3:
                    System.out.println(" Voila Les Information de Client");
                    break;


            }

        }
    }
    public static void menuCompte(){

        Compte compte = new Compte();

    int choix = 0;
            while (choix!=3)

            {
                System.out.println("Cree Un Compte");
                System.out.println("Depot Votre Solde");

                choix = scanner.nextInt();

                switch (choix)
                {

                    case 1 :
                        compte.creeCompte();
                        break;
                    case 2 :
                        compte.depotCompte();
                        break;
                }



            }
    }
    public static void menuOperation(){

        Operation operation = new Operation();

        int choix = 0;
        while (choix!=3)

        {
            System.out.println("Cree un operation");
            System.out.println("1-> Effectuer un depot");

            choix = scanner.nextInt();

            switch (choix)
            {

                case 1 :
                    operation.depotOperation();
                    break;
            }
        }
    }
}