import java.util.Scanner; 
public class verifier { 
  public static void main(String[] args) { 
// Demande à l'utilisateur de saisir un nombre 
    Scanner scanner = new Scanner(System.in); 
    System.out.print("Veuillez entrer un nombre : ");   
    String nombreSaisi = scanner.nextLine();   
    int nombre; 
        if(isInteger(nombreSaisi)) { 
      nombre = Integer.parseInt(nombreSaisi);      
      System.out.println("Le nombre saisi est : " + nombre);    
// Vérification pair ou impair 
      if(nombre % 2 == 0) { 
        System.out.println(nombre + " est pair");   
      } else { 
        System.out.println(nombre + " est impair");   
      }  
    } else { 
      System.out.println("Erreur : la saisie n'est pas un nombre entier"); 
    } 
  } 
