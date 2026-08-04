public class Javaday1 {
    public static void main(String[] args) {
        /* Ekrana bir yazı yazdırmak için bu kalıbı
         (System.out.println) ifadesini kullanmalıyız. */
        System.out.println("Merhaba Dünya");
        int ayse = 21;
        System.out.println("Merhaba Dünya" + ayse);
        ayse = 22;
        System.out.println("Merhaba Dünya" + ayse); 
        //ayse değerine atama yapıldığı için yeniden yazdırıldığında değişecek.
        double pi = 3.14f;
        String a = "Ayşegül Sefa";
        System.out.println("İsmim : " + a);
        System.out.println("pi " + pi + " " + a);
        String dizi = "String dizi demektir";
        System.out.println(dizi);
        a =a.toUpperCase();
        //toUpperCase() ifadesi ile string ifadeyi büyük harfe çevirebiliriz.
        a = a.toUpperCase();
        // ancak çevrilmiş halini tekrar a harfine atamamız lazım.
        System.out.println(a);
        int ilkBosluk = a.indexOf(" ");
        System.out.println(ilkBosluk);
        String ilkKelime = a.substring( 0,ilkBosluk);
        System.out.println("ilk Kelime değişkeni " + ilkKelime);
        int sonBosluk = a.lastIndexOf(" ");
        System.out.println(sonBosluk);
        String sonKelime = a.substring(sonBosluk);
        System.out.println(sonKelime);
        System.out.println("10. karakter : " +a.charAt(10));


        //DİZİLER : Arrayler köşeli patantezle gösterilir tipini ismini şeklini yazıp üretilir.
        int array [] = new int[5];
        array[3] = 4;
        // Bu demekdir ki 0,0,0,4,0,0 demek saymaya sıfırdan başlanır ilk index = 0 dır.
        System.out.println("" + array[3]); 
        // Baştaki "" ifadesi ile int sayıyı Stringe çevirmiş oluruz.
        int array2 [] = {1,2,3,4,5,6,7,8,9};
        System.out.println("" + array2[8]);
        String array3 [] = {"Ayşegül","Sefa","Java"};
        System.out.println(array3[1] + array2[6] + array[2]);

        //OPERATÖRLER 
        int num1 = 10 , num2 = 20 , num3 = 30;
        System.out.println("Sonuç 1 : " + (num1 + num2)); 
        // Eğer parantez kullanırlırsa toplama değil yan yana yazma görürüz.
        System.out.println("Sonuç 1 : " + num1 + num2);
        System.out.println("Sonuç 2 : " + (num2 - num1));
        System.out.println("Sonuç 3 : " + num2 * num1);
        System.out.println("Sonuç 4 : " + num3 / num1);
        // çarpma ve bölmede parantez şart değil çünkü işlem önceliği var artı işaretine.
        System.out.println("Sonuç 5 : " + (10>>2));
        // 10 sayısının binary yani ikilik karşılığına çevir demektir.
        //1010 olur binaryde 10 demek. parantez kullanmalıyız yoksa String olur.
        // sağa shift demektir.
        System.out.println("Sonuç 6 : " + (10>>>2));
        System.out.println("Sonuç 6 : " + (10<<2));
        System.out.println("Sonuç 6 : " + (num1 < num2));
        System.out.println("Abdullah Sefayı çok seviyorum!");









        




















    }
    
}
