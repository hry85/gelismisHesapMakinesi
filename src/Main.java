import java.util.Scanner;
public class Main {
    static int sum(int a , int b){
        int result = a+b;
        System.out.println("Toplam : " +result);
        return result;
    }
    static int minus(int a , int b){
        int result =a-b;
        System.out.println("Cikarma : " +result);
        return result;
    }
    static int times(int a , int b){
        int result= a*b;
        System.out.println("Carpma : " +result);
        return result;
    }
    static int divided(int a , int b){
        if (b == 0){
            System.out.println("Ikinci sayi 0'dan farkli olmalidir.");
            return 0;
        }
        int result=a/b;
        System.out.println("Bolme : "+result);
        return result;
    }
    static int power(int a , int b){
        int result = 1;
        for(int i = 1 ; i <= b ; i++ ){
            result*= a;
        }
        return result;
    }
    static int mod(int a , int b){
        return a % b;
    }
    static void calc(int a , int b){
        System.out.println("Cevresi : " +(2*(a+b)));
        System.out.println("Alani : " +(a*b));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int select;

        String menu = "1- Toplama islemi\n"
                    + "2- Cikarma islemi\n"
                    + "3- Carma islemi\n"
                    + "4- Bolme islemi\n"
                    + "5- Uslu sayi hesaplama\n"
                    + "6- Mod alma\n"
                    + "7- Dikdortgen alan ve cevre hesaplama\n"
                    + "8- Cikis yap";
        System.out.println(menu);
        while (true){
           System.out.println("Bir islem seciniz : ");
           select=sc.nextInt();
           if (select == 0){
               break;

           }
           System.out.print("Ilk sayiyi : ");
           int a= sc.nextInt();
           System.out.print("Ikinci sayiyi : ");
           int b=sc.nextInt();

           switch (select){
          case 1 :
            sum(a,b);
            break;
            case 2 :
                minus(a,b);
                break;
               case 3 :
                   times(a,b);
                   break;
               case 4:
                   divided(a,b);
                   break;
               case 5:
                   System.out.println("Us hesabi : " +power(a,b));
                   break;
               case 6:
                   System.out.println("Mod islemi : " +mod(a,b));
                   break;
               case 7:
                   calc(a,b);
                   break;
          default:
              System.out.println("Gecersiz bir islem girdiniz .");
    }

}
        System.out.println("Gule gule");

    }
}
