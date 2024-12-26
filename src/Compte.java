import java.util.ArrayList;
import java.util.Scanner;

public class Compte {

    private int id;
    private double numero;
    private double solde;
    private Client  proprietaire;
    private ArrayList<Compte> comptes = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public Compte () {
        this.id = id;
        this.numero = numero;
        this.solde = solde;
        this.proprietaire = null;

    }

    public Compte (double solde, double numero){

    }

    public void creeCompte(){



        System.out.println(" -> Veuillez Saisir Le Numero De Compte");
        double numero = scanner.nextInt();

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
