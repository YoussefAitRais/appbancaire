import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Compte {

    private int numero;
    private float solde;
    private String  proprietaire;
    private ArrayList<Compte> comptes = new ArrayList<>();


    public Compte (int numero, float solde, String proprietaire) {

        this.numero = numero;
        this.solde = solde;
        this.proprietaire = proprietaire;
        
    }






}
