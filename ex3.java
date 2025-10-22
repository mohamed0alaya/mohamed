import java.util.Scanner; 
public class AnneeBissextile { 
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in); // Scanner pour lire l'entrée 
utilisateur 
    System.out.print("Veuillez saisir une année: "); 
    int annee = scanner.nextInt(); // Lecture de l'année 
    // Tests pour déterminer si l'année est bissextile 
    if(annee % 4 == 0) { // Divisible par 4 
      if(annee % 100 == 0) { // Et aussi par 100 
        if(annee % 400 == 0) { // Divisible par 400  
          System.out.println(annee + " est bissextile"); 
        } 
        else {  
          System.out.println(annee + " n'est pas bissextile"); 
        } 
      } else { // Pas divisible par 100 
        System.out.println(annee + " est bissextile");  
      } 
    } else { // Pas divisible par 4 
      System.out.println(annee + " n'est pas bissextile"); 
    } 
  } 
} 
