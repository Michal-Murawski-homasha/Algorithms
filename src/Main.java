import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static String[] stringTab = new String[] {"Adam", "Ewa", "Bogdan", "Natalia"};
//    static int[] intTab = new int[] {1, 4, 6, 2, 7};
    static int[] intTab = new int[10];
    private static String someWords = "Natalia";
    private static int topNumber;
    private static int numGuard;
    private static int[] randomTab = new int[50];
    private static boolean booleanSearchMyNum = true;

    public static void main(String[] args) {
        Scanner giveNumber = new Scanner(System.in);
//        for (int i = 0; i < intTab.length; i++) {
//            System.out.println("Podaj " + (i + 1) + " liczbę: ");
//            intTab[i] = giveNumber.nextInt();
//            System.out.println();
//            topNumber = intTab[i];
//        }
        System.out.print("Podaj liczbę: ");
        numGuard = giveNumber.nextInt();
        randomTab[49] = numGuard;
        createRoundTab();
//        linearSearchAlgorithm();
//        searchTopNumber();
//        baubleSortAlgorithm();
        searchGuard();
    }

    private static void createRoundTab() {
        for (int i = 0; i < randomTab.length - 1; i++) {
            Random random = new Random();
            randomTab[i] = random.nextInt(99) + 1;
            System.out.println("INDEX/POZYCJA: " + i + "/" + (i + 1) + " LICZBA: " + randomTab[i]);
        }
        System.out.println("INDEX/POZYCJA: 49/50 LICZBA: " + randomTab[49]);
        System.out.println(Arrays.toString(randomTab));
    }

    private static void searchGuard() {
        for (int i = 0; i < randomTab.length - 1; i++) {
            if (numGuard != randomTab[i]) {
                booleanSearchMyNum = true;
            } else {
                booleanSearchMyNum = false;
                System.out.println("Znaleziono szukaną liczbę (" + numGuard + ") na pozycji o indexie: " + i);
            }
        }
        if ((booleanSearchMyNum) & (randomTab[49] != numGuard)) {
            System.out.println("Nie znaleziono szukanej liczby");
        }
    }

    private static void searchTopNumber() {
        for (int i = 0; i < intTab.length; i++) {
            if (intTab[i] > topNumber) {
                topNumber = intTab[i];
            }
        }
        System.out.println("Największą liczbą jest: " + topNumber);
    }

    private static void linearSearchAlgorithm() {
        System.out.println(Arrays.toString(stringTab));
        for (int i = 0; i < stringTab.length; i++) {
            if (someWords.equals(stringTab[i])) {
                System.out.println("Szukane słowo \"" + someWords + "\" znaleziono na pozycji o indeksie " + i);
            } else {
                System.out.println("Na pozycji " + i + " nie znaleziono szukanego słowa " + "\"" + someWords + "\"");
            }
        }
    }

    private static void baubleSortAlgorithm() {
        System.out.println("Tablica przed posortowaniem " + Arrays.toString(intTab));
        for (int i = 0; i < intTab.length; i++) {
            for (int j = 0; j < intTab.length - 1; j++) {
                if (intTab[j] > intTab[j + 1]) {
                    int tmp = intTab[j + 1];
                    intTab[j + 1] = intTab[j];
                    intTab[j] = tmp;
                }
            }
        }
        System.out.println("Tablica posortowana " + Arrays.toString(intTab));
    }
}
