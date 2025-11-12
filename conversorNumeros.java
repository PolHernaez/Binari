import java.util.Scanner;

public class conversorNumeros {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de conversió de números");
        System.out.println("Selecciona un mode:");
        System.out.println("A) Decimal a Binari");
        System.out.println("B) Binari a Decimal");

        String opcio = sc.nextLine().toLowerCase();

        switch (opcio) {
            case "a":
                int decimal = llegirDecimal(sc);
                System.out.println("Binari: " + decimalABinari(decimal));
                
                break;

            case "b":
                System.out.print("Introdueix un número binari: ");
                String binari = sc.nextLine();
                int valorDecimal = binariADecimal(binari);
                if (valorDecimal != -1) {
                    System.out.println("Decimal: " + valorDecimal);
                } else {
                    System.out.println("Error: només es permeten 0 i 1.");
                }
                
                break;

            default:
                System.out.println("Opció invàlida");
        }

        sc.close();
    }
    
    public static int llegirDecimal(Scanner sc) {
        while (true) {
            System.out.print("Introdueix un número decimal vàlid: ");
            String input = sc.nextLine();
            try {
                int decimal = Integer.parseInt(input);
                if (decimal < 0) {
                    System.out.println("Error: el número ha de ser positiu.");
                } else {
                    return decimal;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: entrada no vàlida. Torna-ho a provar.");
            }
        }
    }

   
    public static String decimalABinari(int decimal) {
        if (decimal == 0) return "0";
        String binari = "";
        for (; decimal > 0; decimal /= 2) {
            int residu = decimal % 2;
            binari = residu + binari;
        }
        return binari;
    }

    
  

   
    public static int binariADecimal(String binari) {
        int decimal = 0;
        int potencia = 1;
        for (int i = binari.length() - 1; i >= 0; i--) {
            char c = binari.charAt(i);
            if (c != '0' && c != '1') {
                return -1; 
            }
            int digit = c - '0';
            decimal += digit * potencia;
            potencia *= 2;
        }
        return decimal;
    }

    
}
