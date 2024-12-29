import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Compte {

    static public int count = 1;
    private int numero;
    private double solde;
    private int  proprietaire;
    private int id ;
    private ArrayList<Operation> operations = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

     Compte (int numero, double solde , int proprietaire ) {
        this.id = count;
        this.numero = numero;
        this.solde = solde;
        this.proprietaire = proprietaire;

    }



    public Compte (){

    }

    public int getId (){
         return this.id;
    }

    public void setOperations( Operation operation ){
         this.operations.add(operation);

    }

    public void augmenterSolde ( double montant ){
         this.solde += montant;
    }

    public void creeCompte(){
        try {
            System.out.println(" -> Veuillez Saisir L'ID De Client'");
            int clientId = scanner.nextInt();

            scanner.nextLine();

            Client client = new Client();

            Client clientRecherher = client.chercherClientParId( clientId );

            if ( clientRecherher == null ){

                System.out.println("Client introuvable");

            }else {

                System.out.println(" -> Veuillez Saisir Le Numero De Compte");
                int numero = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Veullez Saisir Votre Solde");
                double solde = scanner.nextDouble();

                Compte compte = new Compte(numero, solde, clientRecherher.getId());
                Bank.comptes.add(compte);

                clientRecherher.setComptes(compte);
            }


        } catch (InputMismatchException e) {
            System.out.println("Veillez Sasir le numero valide");
        }
    }

    public void depotCompte(){

        System.out.println(" -> Veuillez Depot Votre Solde");
        double solde = scanner.nextDouble();
        this.solde+=solde;
        System.out.println("Votre depot est " + solde);

    }

    public Compte chercherCompteParId ( int compteId ) {

        for ( Compte compte : Bank.comptes ) {

            if ( compteId == compte.getId()){
                return compte ;
            }
        }

        return null;
    }




}
