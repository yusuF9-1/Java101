import java.util.Scanner;
public class Proje1 {
    public static void main(String[] args) {
        float fizik,kimya,turkce,muzik,matematik,tarih;
        Scanner inp=new Scanner(System.in);
        System.out.print("Fizik notunuzu giriniz:");
        fizik=inp.nextFloat();
        System.out.print("Kimya notunuzu giriniz:");
        kimya=inp.nextFloat();
        System.out.print("Türkçe notunuzu giriniz:");
        turkce=inp.nextFloat();
        System.out.print("Matematik notunuzu giriniz:");
        matematik=inp.nextFloat();
        System.out.print("Müzik notunuzu giriniz:");
        muzik=inp.nextFloat();
        System.out.print("Tarih notunuzu giriniz:");
        tarih=inp.nextFloat();
        float ortalama=(matematik+fizik+tarih+muzik+turkce+kimya)/6;
        String gectikaldi=ortalama>60 ? "Sınıfı Geçti" : ortalama==60 ? "Onu Söyleyemiyoruz Malesef" :"Sınıfı Geçemedi";
        System.out.println("Sınıf Durumu: "+gectikaldi);


    }
}
