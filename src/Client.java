import java.util.ArrayList;
import java.util.Scanner;

public class Client {

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

    public void ajoutrClient () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir le Nom");
        String nom = scanner.next();

        System.out.println("Saisir le Prenom");
        String prenom = scanner.next();

        System.out.println("Saisir le Adresse");
        String adresse = scanner.next();

        System.out.println("Saisir le Email");
        String email = scanner.next();

        System.out.println("Saisir le Telephone");
        String tel = scanner.next();


        client.add(new Client(nom, prenom, email, adresse, tel));
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


