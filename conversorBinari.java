import java.util.InputMismatchException;
import java.util.Scanner;

public class conversorBinari {
    public static void main(String[] args) {
    int decimal = 0;
    String menu = "";
    Scanner entrada = new Scanner(System.in);
    System.out.println("Selecciona un mode:");
    System.out.println("A) Enter a binari");
    System.out.println("(a/)");
    try {
    menu = entrada.nextLine();
    }
    catch (InputMismatchException e){
    System.out.println("Introdueix lletres");
    }
    catch (Exception e){
        System.out.println("Error desconegut");
    }
    switch (menu) {
        case "a":
        System.out.print("Introdueix un numero: ");
    try {
    decimal = entrada.nextInt(); 
    }
    catch (InputMismatchException e) {
    System.out.println("Introdueix un nombre enter");
    }
    catch (Exception e) {
    System.out.println("Error inesperat");
     
    }
    
    String binari = "";
    for (; decimal > 0; decimal /= 2) {
            int residu = decimal % 2;
            binari = residu + binari;
        }
    System.out.println(binari);
            
            break;
    
        default: 
        System.out.println("Escriu una lletra vàlida");
            break;
    }
    
        
    

}
}
