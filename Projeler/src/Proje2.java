import java.util.Scanner;

public class Proje2 {
    public static void main(String[] args) {
        double tutar,kdvOrani,kdvtutar,kdvlitutar;
        Scanner inp=new Scanner(System.in);
        System.out.print("Tutarı Giriniz: ");
        tutar= inp.nextDouble();
        kdvOrani=(tutar <1000)&&(tutar >0)  ? 0.18 : 0.08;
        kdvtutar=tutar*kdvOrani;
        kdvlitutar=tutar+kdvtutar;
        System.out.println("KDV'li tutar:"+kdvlitutar);
        System.out.println("KDV'siz tutar:"+tutar);
        System.out.println("KDV oranı:"+kdvOrani);
                            


    }
}


