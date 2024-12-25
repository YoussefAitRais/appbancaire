import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Compte {

    private int numero;
    private double solde;
    private Client  proprietaire;
    private ArrayList<Compte> comptes = new ArrayList<>();


    public Compte (int numero, float solde, Client proprietaire) {

        this.numero = numero;
        this.solde = solde;
        this.Client = proprietaire;

    }

    public Compte (){

    }

    public void creeCompte(){

        Scanner scanner = new Scanner(System.in);

        System.out.println(" -> Veuillez Saisir Le Numero De Compte");
        int numero = scanner.nextInt();

        System.out.println("Veullez Saisir Votre Solde");
        double solde = scanner.nextDouble();

        System.out.println(" Votre Proprietere");








    }




}
