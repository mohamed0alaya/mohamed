package tp1;
import java.util.Scanner; // Import de la classe Scanner pour saisir les entrées clavier 
public class calcul { 
 public static void main(String[] args) { 
 Scanner scanner = new Scanner(System.in); // Création d'un objet Scanner
 System.out.print("Entrez le premier nombre: "); 
 int nombre1 = scanner.nextInt(); // Saisie du premier nombre
 System.out.print("Entrez le deuxième nombre: "); 
 int nombre2 = scanner.nextInt(); // Saisie du deuxième nombre
 System.out.print("Entrez le troisième nombre: "); 
 int nombre3 = scanner.nextInt(); // Saisie du troisième nombre 
 int somme = nombre1 + nombre2 + nombre3; // Calcul de la somme 
 int produit = nombre1 * nombre2 * nombre3; // Calcul du produit 
 double moyenne = (nombre1 + nombre2 + nombre3) / 3.0; // Calcul de la moyenne 
 System.out.println("La somme est: " + somme); // Affichage de la somme 
 System.out.println("Le produit est: " + produit); // Affichage du produit
 System.out.println("La moyenne est: " + moyenne); // Affichage de la moyenne 
 } 
}