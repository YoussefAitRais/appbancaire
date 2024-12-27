import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {

    Scanner scanner = new Scanner(System.in);

    private int id;
    private String nom, prenom, adresse, email, tel;
    private ArrayList<Client> client = new ArrayList();


public Client (String nom , String prenom , String adresse , String email , String tel)
{
    this.nom = nom;
    this.prenom = prenom;
    this.adresse = adresse;
    this.email = email;
    this.tel = tel;

}

public Client ()
{

}

    public int getId(){
    return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void ajouterClient() {
        System.out.println("Saisir le Nom");
        String nom = scanner.next();


        while (!valideNom(nom)) {
            System.out.println("Entrer un nom valide (espaces autorisés, lettres seulement)");
            nom = scanner.next();
        }

        System.out.println("Saisir le Prenom");
        String prenom = scanner.next();

        while(!validePrnom(prenom)){
            System.out.println("Entrer un prenom valide (espaces autorisés, lettres seulement");
            prenom = scanner.next();
        }

        System.out.println("Saisir le Adresse");
        String adresse = scanner.next();

         while (!valideAdresse(adresse))
         {
             System.out.println("Entrer Votre Adresse Valide");
             adresse = scanner.next();
         }

        System.out.println("Saisir le Email");
        String email = scanner.next();

        while(!valideEmail(email)){
            System.out.println("Entrer un Email valide (example@domain.com)");
            email = scanner.next();
        }

        System.out.println("Saisir le Telephone");
        String tel = scanner.next();

        while(!valideTel(tel)){
            System.out.println("Entrer Votre valide");
            tel = scanner.next();
        }


        client.add(new Client(nom, prenom, email, adresse, tel));
    }


    public static boolean valideNom ( String text ){

        Pattern pattern = Pattern.compile( "[a-zA-Z\\\\s]+");
        Matcher matcher = pattern.matcher(text);

        return matcher.matches();

    }

    public boolean validePrnom (String text){

        Pattern pattern = Pattern.compile("[a-zA-Z\\\\s]+");
        Matcher matcher = pattern.matcher(text);
        return matcher.matches();
    }

    public boolean valideEmail (String text)
    {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+\n");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();§§
    }

    public boolean valideAdresse (String text)
    {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9\\s]+");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }

    public boolean valideTel (String text)
    {
        Pattern pattern = Pattern.compile("\"[0-9]+\"gm");
        Matcher matcher = pattern.matcher(text);
        return matcher.find();
    }



    public void afficherClient(){

    for ( int i = 0 ; i< client.size() ; i++) {


        System.out.println(" Les Listes Des Client");
        System.out.println(" -> Le ID est :" + client.get(i).getId());
        System.out.println(" -> Le Nom est : " + client.get(i).getNom());
        System.out.println(" -> Le Prenom est : " + client.get(i).getPrenom());
        System.out.println(" -> Le Adresse est : " + client.get(i).getAdresse());
        System.out.println(" -> Le Email est : " + client.get(i).getEmail());
        System.out.println(" -> Le Telephone est : " + client.get(i).getTel());

    }

    }

    }


