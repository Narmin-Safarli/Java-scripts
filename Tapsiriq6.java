public class Tapsiriq6 {
    public static void main(String[] args) {
        final double PI = 3.14159;
        final int MAX_DENEME = 3;
        final String BANK_KODU = "ABB01";

        System.out.println("PI dəyəri: " + PI);
        System.out.println("Maksimum cəhd sayı: " + MAX_DENEME);
        System.out.println("Bankın kodu: " + BANK_KODU);

        //PI = 3.15;               //java: cannot assign a value to final variable PI
        //MAX_DENEME = 5;          //java: cannot assign a value to final variable MAX_DENEME
        //BANK_KODU = "ABB05";     //java: cannot assign a value to final variable BANK_KODU
    }
}
