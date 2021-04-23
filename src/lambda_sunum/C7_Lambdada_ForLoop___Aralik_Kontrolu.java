package lambda_sunum;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C7_Lambdada_ForLoop___Aralik_Kontrolu {
    public static void main(String[] args) {


    }
    // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1,2,.... seklinde siralayalim (for loopsuz)
    public static void sirala1(int bas, int bits){
        IntStream.range(bas,bits).forEach(t-> System.out.print(t+","));

    }

    //S2 1 den 30 kadar olan sayilari (30 dahil ) 1,2,.... seklinde siralayalim (for loopsuz)
    public static void sirala2(int bas, int bits){
        IntStream.rangeClosed(bas,bits).forEach(t-> System.out.print(t+","));
    }
    //S3 Istenen iki deger arasindaki sayilari toplayalim

    //S4: 30 ile 40 arasindaki sayilarin ortalamasini bulalim

    //S5: 325 ile 468 arasinda 8 bolunen kac sayi vardir

    //S6: 325 ile 468 arasinda 8 bolunen sayilari yazdiralim

    // S7:325 ile 468 arasinda 8 bolunen sayilarin toplamini bulalim

    // S8: 7ile 55 arasindaki tek sayilarin carpimini bulalim
    public static int car(int a,int b){
        return IntStream.rangeClosed(a,b).filter(Methods::tekMi).reduce(1,Math::multiplyExact);
    }
 //S9: poz tek sayilarin ilk 10 elemanin yazdiralim
    public static void tekler(int son){
        IntStream.iterate(1,i->i+2).limit(10).forEach(Methods::yaz);
    }
    //S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yaziralim
    public  static void yedikatyaz(int son){
        IntStream.iterate(21, T->T+7).limit(son).filter(Methods::tekMi).forEach(Methods::yaz);
    }

    //S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim
    public  static int yedikatyazTop(int son){
      return  IntStream.iterate(21, T->T+7).limit(son).sum();
    }
}
