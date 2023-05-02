import java.util.Scanner;

/**
 * ClassName: ManavKasa
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 5/2/2023 10:40 AM
 * @Version 1.0
 */
//Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram
// değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
//
//Meyveler ve KG Fiyatları
//
//Armut : 2,14 TL
//Elma : 3,67 TL
//Domates : 1,11 TL
//Muz: 0,95 TL
//Patlıcan : 5,00 TL
public class ManavKasa {
    public static void main(String[] args){
        double armut =2.14,elma = 3.67,domates =1.11,muz = 0.95,patlican = 5.00;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç kilo : ");
        double armutkilo = input.nextDouble();
        System.out.print("Elma Kaç kilo : ");
        double elmakilo = input.nextDouble();
        System.out.print("Domates Kaç kilo : ");
        double domateskilo = input.nextDouble();
        System.out.print("Muz Kaç kilo : ");
        double muzkilo = input.nextDouble();
        System.out.print("Patlican Kaç kilo : ");
        double patilcankilo = input.nextDouble();
        double armutfiyat = armut * armutkilo;
        double elmafiyat = elma * elmakilo;
        double domatesfiyat = domates * domateskilo;
        double muzfiyat = muz * muzkilo;
        double patilcanfiyat = patlican * patilcankilo;
        double toplapfiyat = armutfiyat + elmafiyat + domatesfiyat + muzfiyat + patilcanfiyat;
        System.out.println("Armut Fiyati : " + armutfiyat);
        System.out.println("Elma fiyati : " + elmafiyat);
        System.out.println("Domates fiyati :" + domatesfiyat);
        System.out.println("Muz fiyati : " + muzfiyat);
        System.out.println("Patilcan Fiyati : " + patilcanfiyat);
        System.out.println("Toplam Tutari : " + toplapfiyat);
    }
}
