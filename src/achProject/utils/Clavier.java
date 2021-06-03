package achProject.utils;

import java.util.Scanner;

public class Clavier {

    private static Scanner sc = new Scanner(System.in);

    public static int readInt(){
        try {
            int result =sc.nextInt();
            sc.close();
            return result;
        } catch (Exception e) {
            System.out.println("Erreur saisie");
        }
        return -1;
    }

    public static String readString(){
        try{
            String result = sc.nextLine();
            return result;
        } catch (Exception e) {
            System.out.println("Erreur saisie");
        }
        return null;
    }
}
