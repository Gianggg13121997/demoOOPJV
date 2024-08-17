package input;

import java.util.Scanner;

public class Input {
    private static Scanner input = new Scanner(System.in);
    public static int inputNumber(){
        try{
            String dataInput = input.nextLine();
            int number = Integer.parseInt(dataInput);
            return number;
        }catch (NumberFormatException e){
            System.out.println("Sai dinh dang. Vui long nhap lai !");
        }
        while (true);
    }
    public static String inputString(){
        String dataInput = input.nextLine();
        return dataInput;
    }

}
