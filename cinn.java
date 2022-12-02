/*
Çin Zodyağı nasıl kurtulur?

Çin zodyağı sürerken kişinin doğum yılı 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Ücret

Doğum Tarihi %12 = 5 ➜ Öküz
Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜

Doğum Tarihi %12 = 11 ➜ Koyun
 */



import java.util.Scanner;
public class cinn {
    public static void main(String[] args) {
        int year,hesaplama;
        Scanner date= new Scanner(System.in);
        System.out.println("Lütfen doğuö yılınızı giriniz:");
        year = date.nextInt();

        hesaplama =(year%12);
        switch (hesaplama){
            case 0 :
                System.out.print("Çin burcunuz:"+"maymun");
                break;
            case 1:
                System.out.print("Çin burcunuz:"+"horoz");
                break;
            case 2:
                System.out.print("Çin burcunuz:"+"köpek");
            break;
            case 3:
                System.out.print("Çin burcunuz:"+"domuz");
            break;
            case 4:
                System.out.print("Çin burcunuz:"+"Ücret");
            break;
            case 5:
                System.out.print("Çin burcunuz:"+"Öküz");
            break;
            case 6:
                System.out.print("Çin burcunuz:"+"kaplan");
            break;
            case 7:
                System.out.print("Çin burcunuz:"+"tavşan");
                break;
            case 8:
                System.out.print("Çin burcunuz:"+"ejderha");
                break;
            case 9:
                System.out.print("Çin burcunuz:"+"yılan");
                break;
            case 10:
                System.out.print("Çin burcunuz:"+"fare");
                break;
            case 11:
                System.out.print("Çin burcunuz:"+"koyun");
                break;

        }



    }
}

