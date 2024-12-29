import java.time.LocalDate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Operation {

        private int id ;
        private LocalDate dateOperation;
        private double montant;
        private int compte;
        static private int count = 1;

        Scanner scanner = new Scanner(System.in);


        Operation (double montant , int compte)
        {
            this.id = count;
            this.compte = compte;
            this.montant = montant;
            this.dateOperation = LocalDate.now();
            count++;


        }

        Operation () {}



        public void depotOperation (){
            try {
                System.out.println("Veillez Saisir Votre ID");
                int compteId = scanner.nextInt();


                Compte compte = new Compte();

                Compte compteRecherher = compte.chercherCompteParId( compteId );

                if ( compteRecherher == null ){

                    System.out.println("Compte introuvable");

                }else {

                    System.out.println("Veullez Saisir Votre Montant");
                    double montant = scanner.nextDouble();
                    scanner.nextLine();

                    Operation operation = new Operation(montant, compteRecherher.getId());
                    Bank.comptes.add(compte);

                    compteRecherher.setOperations(operation);
                    compteRecherher.augmenterSolde(montant);
                }

            } catch (Exception e) {
                System.out.println("Veillez Saisir Numero Valide");
            }

        }
}
