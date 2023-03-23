package Mentoring;

public class _5_2_IntoString {
    public static void main(String[] args) {
        String girilenBilgi = "65"; // şu haliyle ahet gibi bir kelimedir. sayısal işleme giremez
        int girilenSayi=65;

        // Kelimenin sayıya çevrilmesi
        int girilenBilgininSayiHali = Integer.parseInt(girilenBilgi); // dönüşecek tipe uygun dönüşüm
        short shortDeger = Short.parseShort(girilenBilgi);

        double oran = Double.parseDouble(girilenBilgi);

        // Sayının kelimeye çevrilmesi
        String girilenSayininKelimeHali = Integer.toString(girilenSayi); // değişiikenin tipine uygun dönüşüm
        String kelimeOran = Double.toString(oran);
    }
}
