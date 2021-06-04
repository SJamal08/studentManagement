package achProject.utils;

import java.util.Scanner;

public class Clavier {

    public static int readInt(){
        try {
            Scanner sc = new Scanner(System.in);
            int result =sc.nextInt();
            return result;
        } catch (Exception e) {
            System.out.println("Erreur saisie");
        }
        return -1;
    }

    public static String readString(){
        try{
            Scanner sc = new Scanner(System.in);
            String result = sc.nextLine();
            return result;
        } catch (Exception e) {
            System.out.println("Erreur saisie");
        }
        return null;
    }
}
