public class TapsiriqBonus {
    public static void main(String[] args) {
        final int minYas = 18;
        final int minParol = 8;
        final double minGelir = 500.0;

        String ad = "Narmin";
        int yas = 22;
        double gelir = 600.0;
        String parol = "123456789";
        String email = "test@mail.com";

        boolean adBosDeyil = ad.length() > 0;
        boolean yasUygun = yas >= minYas;
        boolean gelirUygun = gelir > minGelir;
        boolean parolUygun = parol.length() >= minParol;
        boolean emailUygun = email.contains("@");
        boolean qeydiyyatUgurludur = adBosDeyil && yasUygun && gelirUygun && parolUygun && emailUygun;


        System.out.println("Ad: " + ad.substring(0,1).toUpperCase() + ad.substring(1));
        System.out.println("Ad bos deyil: " + adBosDeyil);
        System.out.println("Yas uygundur: " + yasUygun);
        System.out.println("Gelir uygundur: " + gelirUygun);
        System.out.println("Parol uygundur: " + parolUygun);
        System.out.println("Email uygundur: " + emailUygun);
        System.out.println("Yekun status: " + qeydiyyatUgurludur);
    }
}