
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Giacomo
 */
public class Esercizi {    
    public static void NumeriPari() {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il numero di dati da leggere: ");
        int n = input.nextInt(); // legge il numero di dati da leggere
        int[] numeri = new int[n]; // crea un array di lunghezza n per i dati
        System.out.println("Inserisci i dati:");
        for (int i = 0; i < n; i++) {
            numeri[i] = input.nextInt(); // legge i dati uno alla volta
        }
        System.out.println("I numeri pari sono:");
        for (int i = 0; i < n; i++) {
            if (numeri[i] % 2 == 0) {
                System.out.println(numeri[i]); // stampa solo i numeri pari
            }
        }
    }
    
    public static void MultipliDiCinque(){
        for(int i = 1; i <= 100; i++) {
            if(i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
       
    public static void SommaEMedia(){  
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il numero di dati da leggere: ");
        int n = input.nextInt(); // legge il numero di dati da leggere
        int[] numeri = new int[n]; // crea un array di lunghezza n per i dati
        System.out.println("Inserisci i dati:");
        int somma = 0;
        for (int i = 0; i < n; i++) {
            numeri[i] = input.nextInt(); // legge i dati uno alla volta
            somma = somma + numeri[i]; // aggiunge il valore alla somma
        }
        double media = somma / n; // calcola la media
        System.out.println("La somma dei dati è: " + somma);
        System.out.println("La media dei dati è: " + media);
    }
 
    
    public static void ValoriAssoluti(){
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il numero di dati da leggere: ");
        int n = input.nextInt(); // legge il numero di dati da leggere
        System.out.println("Inserisci i dati:");
        for (int i = 0; i < n; i++) {
            int in = input.nextInt(); // legge un numero da input
            int valoreAssoluto = Math.abs(in); // metodo che calcola il valore assoluto
            System.out.println("Il valore assoluto di " + in + " è " + valoreAssoluto);
        }
        System.out.println("fine programma");
    }
    
    
    public static void CalcolaCubo() {
        Scanner input = new Scanner(System.in);
        boolean inputValido = false;
        do {
             try {
                System.out.print("Inserisci un numero: ");
                int numero = input.nextInt(); // legge un numero da input
                int cubo = numero * numero * numero; // calcola il cubo del numero
                System.out.println("Il cubo di " + numero + " è " + cubo);
                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("L'input inserito non è valido. Riprova.");
                input.nextLine(); // pulisce il buffer dell'input
                }
        } while (!inputValido);
    }
    
    
    public static void DivisoriDiN(){
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int n = input.nextInt(); // legge un numero da input
        System.out.println("I divisori di " + n + " sono:");
        for (int i = 1; i <= n; i++) { // utilizzo un for per creare tutti i numeri compresi tra 1 e n.
            if (n % i == 0) {      //controllo se tutti numeri precenedeti, compreso n, sono dei divisori traminte il modulo 
                System.out.println(i);
            }
        }
    }    
        
        
        
    public static void SommaPrimiDieciNumeri(){
        Scanner input = new Scanner(System.in);
        boolean controllo = false;
        while (!controllo) {
            try {
                System.out.print("Inserisci un numero: ");
                int n = input.nextInt(); // legge un numero da input
                int somma = 0;
                for (int i = n + 1; i <= n + 10; i++) {
                   somma = somma + i; // aggiunge il numero alla somma
                }
                System.out.println("La somma dei primi 10 numeri successivi a " + n + " è: " + somma);
                controllo = true;
            } catch (InputMismatchException e) {
            System.out.println("Errore, inserire un numero intero.");
            input.nextLine(); // pulisce il buffer dell'input
            }
         }
    }
    

    
    
    public static void MediaAritmetica(){ 
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci la quantità di numeri da leggere: ");
        int n = input.nextInt(); // legge il numero di numeri da leggere
        double somma = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Inserisci il " + i + "° numero: ");
            double numero = input.nextDouble(); // legge il numero da input
            somma = somma + numero; // aggiunge il numero alla somma
        }
        double media = somma / n; // calcolo della media
        System.out.println("La media dei numeri inseriti è: " + media);
    }
    
    
    public static void Multipli(){
        Scanner input = new Scanner(System.in);
        boolean inputValido = false;
        do {
            try {
                System.out.print("Inserisci un numero: ");
                int n = input.nextInt(); // legge un numero da input
                System.out.println("I primi 12 multipli di " + n + " sono:");
                for (int i = 1; i <= 12; i++) {
                   System.out.println(i * n);
                }
                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("L'input inserito non è valido. Riprova.");
                input.nextLine(); // pulisce il buffer dell'input
            }
         } while (!inputValido);
    }
    
    
    public static void SommaNumeriNaturali(){
        Scanner input = new Scanner(System.in);
        int somma = 0;
        int numero;
        do {
            System.out.print("Inserisci un numero naturale, se voui terminare il programma inserisci un numero negativo: ");
            numero = input.nextInt(); // legge un numero da input
            if (numero >= 0) {
                somma = somma + numero; // aggiunge il numero alla somma solo se è positivo
            }
        } while (numero >= 0); // continua finché non viene inserito un numero negativo
        System.out.println("La somma dei numeri inseriti è: " + somma);
    }





    






    


    
    



    
}
