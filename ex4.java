import java.util.Scanner;  
public class CalculatriceSimple { 
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);   
    System.out.print("Entrez une expression arithmétique simple: "); 
    String expression = scanner.nextLine(); // Lecture de l'expression 
    String[] elements = expression.split(" "); // Séparation des éléments 
    Double operande1 = Double.parseDouble(elements[0]); // Conversion du 1er 
opérande 
    String operateur = elements[1]; // Stockage de l'opérateur  
    Double operande2 = Double.parseDouble(elements[2]); // Conversion du 2ème 
opérande 
    Double resultat; 
    // Tests sur l'opérateur pour appliquer l'opération correcte 
    if(operateur.equals("+")) { 
      resultat = operande1 + operande2; 
    } 
    else if(operateur.equals("-")) { 
      resultat = operande1 - operande2; 
    } 
    else if(operateur.equals("x")) {  
      resultat = operande1 * operande2; 
    } 
    else {  
      resultat = operande1 / operande2;   
    } 
    System.out.println("Résultat: " + resultat); // Affichage du résultat 
  } 
}
