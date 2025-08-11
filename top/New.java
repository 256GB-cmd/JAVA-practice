package  top;

import java.util.Scanner;

public class New {
   public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);

     System.out.print("x 값 입력: ");
     String strX = scanner.nextLine();
     int x = Integer.parseInt(strX);

     System.out.print("y 값 입력: ");
     String strY = scanner.nextLine();
     int y = Integer.parseInt(strY);

     int reason = x + y;
     System.out.println("x + y:  " + reason);
    System.out.println();
    
    while(true) {
        System.out.print("입력 문자열: ");
        String data = scanner.nextLine();

        if(data.equals("q")) {
            break;
        }
        System.out.println("입력한 문자열: " + data);
        System.out.println();
    }
    System.out.println("프로그램 종료");
    }
}