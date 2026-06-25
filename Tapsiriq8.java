public class Tapsiriq8 {
    public static void main(String[] args) {
        int yas = 25;
        double gelir = 1200.0;
        boolean tarix = true;

// Kredit şərti: yaş 21-65, gəlir 800-dən çox, tarix true olmalı

        boolean yasUygun  = yas >= 21 && yas < 65;   // ① nəticə: false — düzdürmü?
        boolean gelirUygun = gelir > 800;              // ② nəticə: true  — düzdürmü?
        boolean uygun      = yasUygun && gelirUygun && tarix; // ③ düzdürmü?

        System.out.println("Yaş uyğun:   " + yasUygun);
        System.out.println("Gəlir uyğun: " + gelirUygun);
        System.out.println("Kredit:      " + uygun);


        // Kredit şərti: yaş 21-65, gəlir 800-dən çox, true olmalı
        //21 yaşın özünün də daxil olması üçün >= istifadə edirik
        //bütün şərtlər eyni anda ödənməli olduğu üçün && etdik
    }
}
