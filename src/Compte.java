import java.util.ArrayList;
import java.util.Scanner;

public class Compte {


    private Double numero;
    private double solde;
    private Client  proprietaire;
    private ArrayList<Compte> comptes = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public Compte (double numero, double solde ) {

        this.numero = this.numero;
        this.solde = this.solde;
        this.proprietaire = null;

    }

    public Compte (){

    }

    public void creeCompte(){



        System.out.println(" -> Veuillez Saisir Le Numero De Compte");
        Double numero = scanner.nextDouble();

        System.out.println("Veullez Saisir Votre Solde");
        double solde = scanner.nextDouble();

        comptes.add(new Compte(solde,numero));

    }

    public void depotCompte(){

        System.out.println(" -> Veuillez Depot Votre Solde");
        double solde = scanner.nextDouble();
        this.solde+=solde;
        System.out.println("Votre depot est " + solde);

    }




}
