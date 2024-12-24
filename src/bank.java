import java.util.Scanner;


public class bank {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int choix = 0;
        while (choix != 5)
        {
            System.out.println("--------------------------");
            
            System.out.println("1 >> Cree un compte");
            System.out.println("2 >> Cree un client");
            System.out.println("3 >> Gerer les operations");
            System.out.println("4 >> Efectuer un Fitlrage");
            System.out.println(" 4 -> Quitter le programme");

            System.out.println("---------------------------");

            System.out.println("Veullez Entrer Votre Choix!");

            choix = scanner.nextInt();
            switch (choix){

                case 1 :
                // Creation dun compte
                    break;
                case 2 :
                // Creation d'un client
                    break;
                case 3 :
                // Gerant des operation
                    break;
                case 4:
                    // Gerant des operation
                    break;
                case 5:
                //Quiter le programme
                    System.exit(0);
                    break;
            }





        }









    }
}