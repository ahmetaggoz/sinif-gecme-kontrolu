package Giris;
import java.util.Scanner;
public class proje12 {
    public static void main(String[] args) {
        int mat,turkce,fizik,kimya,muzik;


        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = inp.nextInt();


        if (mat < 0 || mat > 100){
            mat = 0;
        }if (turkce < 0 || turkce > 100){
            turkce = 0;
        }if (fizik < 0 || fizik > 100){
            fizik = 0;
        }if (kimya < 0 || kimya > 100){
            kimya = 0;
        }if (muzik < 0 || muzik > 100){
            muzik = 0;
        }

        double avarage = (mat + fizik + turkce + kimya + muzik) / 5.0;

        if (avarage < 55){
            System.out.println("Sınıfta kaldınız...");
        }else {
            System.out.println("Geçtiniz... Tebrikler!");
        }

        System.out.println("Ortalamanız : " + avarage);








    }
}
