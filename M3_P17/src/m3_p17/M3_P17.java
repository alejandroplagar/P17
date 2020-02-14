package m3_p17;

import java.text.DecimalFormat;
import java.util.Scanner;

public class M3_P17 {

    static Scanner keyboard = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.000");

    public static void main(String[] args) {
        int eu;
        float eu5;
        keyboard.useDelimiter("\n");
        int option = -1;
        do {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {
                case 1:
                    //1
                    System.out.print("euros: ");
                    eu = keyboard.nextInt();
                    float res = int_float(eu);
                    System.out.println(df.format(res));
                    int_float(eu);
                    break;
                case 2:
                    //2
                    System.out.print("Euro : ");
                    eu = keyboard.nextInt();
                    double res2 = int_double(eu);
                    System.out.println(df.format(res2));
                    int_double(eu);
                    break;
                case 3:
                    //3
                    System.out.print("Euro= ");
                    eu = keyboard.nextInt();
                    String res3 = int_String(eu);
                    System.out.println(df.format(res3));
                    int_String(eu);
                    break;
                case 4:
                    //4
                    System.out.print("Euro= ");
                    String eu4 = keyboard.next();
                    int res4 = String_int(eu4);
                    System.out.println(res4);
                    String_int(eu4);
                    break;
                case 5:
                    //5
                    System.out.print("Euro= ");
                    eu5 = keyboard.nextFloat();
                    int res5= float_int(eu5);
                    System.out.println(res5);
                    float_int(eu5);
                    break;
                case 6:
                    //6
                    System.out.print("Euro= ");
                    eu5=keyboard.nextFloat();
                    String res6= float_String(eu5);
                    System.out.println(res6);
                    float_String(eu5);
                    break;
                case 7:
                    char letter=(keyboard.next()).charAt(0);
                    System.out.print("Letter ?: ");
                    String letterBinary= Integer.toBinaryString(letter);
                    System.out.println(letter+"="+letterBinary);
                    char_to_binary(letter);
                    break;
                case 8:
                    System.out.print("word :");
                    String str=keyboard.next();
                    StringToBinary(str);
                    System.out.println(str);
                    break;
                case 9:
                    p9();
                    break;
                case 10:
                    ASCII();
                    break;
                default:
                    System.out.println("Invalid option");

            }
        } while (option != 0);

    }

    public static void userMenu() {

        System.out.println("Option 1:");
        System.out.println("Option 2:");
        System.out.println("Option 3:");
        System.out.println("Option 4:");
        System.out.println("Option 5:");
        System.out.println("Option 6:");
        System.out.println("Option 7:");
        System.out.println("Option 8:");
        System.out.println("Option 9:");
        System.out.println("Option 10:");

        System.out.println("Leave");

        System.out.print("\n\noption ?: ");
    }

    private static float int_float(int euro) {
        float result = 0;
        result = (float) euro / 0.91f;//cast

        return result;
    }

    private static double int_double(int euro) {
        double result = 0;
        result = (double) euro / 0.91d;//cast

        return result;
    }

    private static String int_String(int euro) {
        String result = "0";
        result = String.valueOf(euro / 0.91);
        return result;
    }

    private static int String_int(String euro) {
        int res4 = 0;
        res4 = (int) (Integer.parseInt(euro) / 0.91);
        return res4;
    }

    private static int float_int(float euro) {
        float resultFloat = 0;
        resultFloat = (float) euro/0.91f;
        int result = (int) resultFloat;
        return result;
    }

    private static String float_String(float euro) {
        String result;
        result=String.valueOf(euro/0.91);
        return result;
    }

    private static void char_to_binary(char ch) {
        String letterBinary= Integer.toBinaryString(ch);
        System.out.println(ch+"="+letterBinary);
    }

    private static String StringToBinary(String str) {
        String result="";
        String letterBinary;
        char ch=' ';
        for(int i=0;i<str.length();i++){
        ch=str.charAt(i);
        result+=Integer.toBinaryString(ch)+" ";
        }
        
        return result;
    }

    private static void p9() {

        System.out.print("Number between 0 and 255: ");
        
        
    }

    private static void ASCII() {
        System.out.println("ASCII");
        for(int i=0;i<255;i++){
            System.out.println(i+"\t"+Integer.toString(i,16)+"="+(char)i);
        }
    }
}