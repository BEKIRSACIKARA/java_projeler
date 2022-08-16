package deneme;

    /* Basarili Market-manav alış-veriş programı.

* 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
        No        Ürün         Fiyat
        ====     =======      =========
        00  Domates           20.10 TL
        01  Patates           30.20 TL
        02  Biber             30.50 TL
        03  Soğan             20.30 TL
        04  Havuç             30.10 TL
        05  Elma               50.20 TL
        06  Muz                 100.90 TL
        07  Çilek              60.10 TL
        08  Kavun              40.30 TL
        09  Üzüm              20.70 TL
        10  Limon             10.50 TL
* 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini
* isteyiniz.
* 3. Adım: Kaç kg satın almak istediğini ve urun kodunu  aliniz.
* 4. Adım: Alınacak bu ürünü sepete ekleyiniz
* 5. Sepeti yazdırınız.
* 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına
* yönlendiriniz.
* 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
* ödeme sonrasında programı bitirinzi.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class RestoranProjesi {
        public static void main(String[] args) {

            // kullanıcıdan hangi yemekleri yemek istediğini sorup
            // o yemeğin menüde olup olmadığını kontrol edin varsa
            // siparişiniz hazırlanıyo, yoksa bu yemek menüde yoktur yazdırın


            Scanner scan=new Scanner(System.in);
            String hosgeldinizMesaji="---HOŞGELDİNİZ---";
            System.out.println(hosgeldinizMesaji);
            System.out.println();
            String menu="Menü " + "CORBALAR : Mercimek Çorbası, Yoğurt Çorbası, Arabaşı Çorbası " +
                    "ARA SICAKLAR : Yaprak Sarma, Su Böreği, Patlıcanlı Yoğurt " +
                    "SALATALAR : Mevsim Salata, Çoban Salata, Sezar Salata, Rus Salatası " +
                    "ANA YEMEKLER : Lahmacun, Adana Kebap, Urfa Ciğer, Pilav Üstü Et, Pizza, Küşleme, Kavurma " +
                    "TATLILAR : Künefe, Islak Kek, Baklava, Havuçlu Kek, Fırın Sütlaç " +
                    "ICECEKLER : Acılı Şalgam, Acısız Şalgam, Açık Ayran, Kapalı Ayran, Su, Meyve Suyu ";

            String CORBALAR = "mercimek çorbası" + "yoğurt çorbası" + "arabaşı çorbası";
            String ARA_SICAKLAR = "yaprak sarma" + "su böreği" + "patlıcanlı yoğurt";
            String SALATALAR = "mevsim salata" + "çoban salata" + "sezar salata" + "rus salatası";
            String ANA_YEMEKLER = "lahmacun" + "adana kebap" + "ciğer tava" + "pilav üstü et" + "pizza" + "küşleme";
            String TATLILAR = "künefe" + "ıslak kek" + "kazandibi" + "havuçlu kek" + "fırın sütlaç";
            String ICECEKLER = "acılı şalgam" + "acısız şalgam" + "açık ayran" + "kapalı ayran" + "su" + "meyve suyu";

            System.out.println(menu);
            System.out.println();
            System.out.println("Hangi çorbayı istersiniz : ");
            String corba= scan.nextLine().toLowerCase();
            System.out.println("Hangi ara sıcağı istersiniz : ");
            String araSicak= scan.nextLine().toLowerCase();
            System.out.println("Hangi salatayı istersiniz : ");
            String salata= scan.nextLine().toLowerCase();
            System.out.println("Hangi ana yemeği istersiniz : ");
            String anaYemek= scan.nextLine().toLowerCase();
            System.out.println("Hangi tatlıyı istersiniz : ");
            String tatli= scan.nextLine().toLowerCase();
            System.out.println("Hangi içeceği istersiniz : ");
            String icecek= scan.nextLine().toLowerCase();


            if (CORBALAR.contains(corba)){
                System.out.println("Çorba siparişi hazırlanıyor");

            }else{
                System.out.println("Bu çorba yoktur, lütfen başka çorba seçiniz");
            }
            if (ARA_SICAKLAR.contains(araSicak)){
                System.out.println("Ara sıcak siparişi hazırlanıyor");

            }else{
                System.out.println("Bu ara sıcak yoktur, lütfen başka ara sıcak seçiniz");
            }
            if (SALATALAR.contains(salata)){
                System.out.println("Salata siparişi hazırlanıyor");

            }else{
                System.out.println("Bu salata yoktur, lütfen başka salata seçiniz");
            }
            if (ANA_YEMEKLER.contains(anaYemek)){
                System.out.println("Ana yemek siparişi hazırlanıyor");

            }else{
                System.out.println("Bu ana yemek yoktur, lütfen başka ana yemek seçiniz");
            }
            if (TATLILAR.contains(tatli)){
                System.out.println("Tatlı siparişi hazırlanıyor");

            }else{
                System.out.println("Bu tatlı yoktur, lütfen başka tatlı seçiniz");
            }
            if (ICECEKLER.contains(icecek)){
                System.out.println("Içecek siparişi hazırlanıyor");

            }else{
                System.out.println("Bu içecek yoktur, lütfen başka içecek seçiniz");
            }

            List<Double> fiyatToplam=new ArrayList<>();
            double mercimekCorbaFiyat=15;
            double yogurtCorbaFiyat=18.50;
            double arabasiCorbaFiyat=20;
            double yaprakSarmaFiyat=23.10;
            double suBöregiFiyat=22.10;
            double patlicanliYogurtFiyat=21.50;
            double mevsimSalataFiyat=14.60;
            double rusSalataFiyat=16;
            double cobanSalataFiyat=14;
            double sezarSalataFiyat=15;
            double lahmacunFiyat=28.40;
            double adanaKebapFiyat=35;
            double cigerTavaFiyat=34;
            double kuslemeFiyat=32.59;
            double pilavUstuEtFiyat=35.50;
            double pizzaFiyat=33.10;
            double kazandibiFiyat=27.70;
            double kunefeFiyat=24.90;
            double islakKekFiyat=23.20;
            double havucluKekFiyat=23.20;
            double firinSutlacFiyat=25.30;
            double suFiyat=2;
            double meyveSuyuFiyat=4;
            double aciliSalgamFiyat=4.90;
            double acisizSalgamFiyat=4.70;
            double acikAyranFiyat=4.60;
            double kapaliAyranFiyat=4.10;

            if (corba.contains("mercimek")){
                fiyatToplam.add(mercimekCorbaFiyat);
            } else if (corba.contains("yoğurt")) {
                fiyatToplam.add(yogurtCorbaFiyat);
            }else if (corba.contains("arabaşı")){
                fiyatToplam.add(arabasiCorbaFiyat);
            } else
                fiyatToplam.add(0.0);

            if (araSicak.contains("yaprak")){
                fiyatToplam.add(yaprakSarmaFiyat);
            } else if (araSicak.contains("su ")) {
                fiyatToplam.add(suBöregiFiyat);
            }else if (araSicak.contains("patlıcan")){
                fiyatToplam.add(patlicanliYogurtFiyat);
            } else {
                fiyatToplam.add(0.0);
            }

            if (salata.contains("mevsim")){
                fiyatToplam.add(mevsimSalataFiyat);
            } else if (salata.contains("çoban")) {
                fiyatToplam.add(cobanSalataFiyat);
            } else if (salata.contains("sezar")){
                fiyatToplam.add(sezarSalataFiyat);
            } else if (salata.contains("rus")){
                fiyatToplam.add(rusSalataFiyat);
            } else {
                fiyatToplam.add(0.0);
            }

            if (anaYemek.contains("lahmacun")){
                fiyatToplam.add(lahmacunFiyat);
            } else if (anaYemek.contains("adana kebap")) {
                fiyatToplam.add(adanaKebapFiyat);
            } else if (anaYemek.contains("ciğer tava")){
                fiyatToplam.add(cigerTavaFiyat);
            } else if (anaYemek.contains("pizza")){
                fiyatToplam.add(pizzaFiyat);
            } else if (anaYemek.contains("küşleme")) {
                fiyatToplam.add(kuslemeFiyat);
            } else if (anaYemek.contains("pilav")){
                fiyatToplam.add(pilavUstuEtFiyat);
            } else {
                fiyatToplam.add(0.0);
            }

            if (tatli.contains("ıslak kek")){
                fiyatToplam.add(islakKekFiyat);
            } else if (tatli.contains("künefe")) {
                fiyatToplam.add(kunefeFiyat);
            } else if (tatli.contains("kazandibi")){
                fiyatToplam.add(kazandibiFiyat);
            } else if (tatli.contains("havuçlu kek")){
                fiyatToplam.add(havucluKekFiyat);
            } else if (tatli.contains("fırın")){
                fiyatToplam.add(firinSutlacFiyat);
            } else {
                fiyatToplam.add(0.0);
            }

            if (icecek.contains("su")){
                fiyatToplam.add(suFiyat);
            } else if (icecek.contains("acılı şalgam")) {
                fiyatToplam.add(aciliSalgamFiyat);
            } else if (icecek.contains("acısız şalgam")) {
                fiyatToplam.add(acisizSalgamFiyat);
            } else if (icecek.contains("açık ayran")) {
                fiyatToplam.add(acikAyranFiyat);
            } else if (icecek.contains("kapalı ayran")) {
                fiyatToplam.add(kapaliAyranFiyat);
            } else if (icecek.contains("meyve")){
                fiyatToplam.add(meyveSuyuFiyat);
            } else {
                fiyatToplam.add(0.0);
            }

            double sum = 0;
            //Advanced for loop
            for( Double num : fiyatToplam) {
                sum = sum+num;
            }
            System.out.println("Dizi elemanları toplamı : "+sum);

            System.out.println(fiyatToplam);
        }
    }