public class Tapsiriq9 {
    public static void main(String[] args) {
        String kod = "  abb-2024  ";

        // Cavab: 12. Boşluqları da sayır
        System.out.println(kod.length());

        // Cavab: false. Böyük "ABB" olmalıdır, mətndə isə kiçikdir
        System.out.println(kod.contains("ABB"));

        // Cavab: false. String müqayisəsində == işləmir
        System.out.println(kod.trim() == "abb-2024");

        // Cavab: true. Doğrudur
        System.out.println(kod.toUpperCase().contains("ABB"));
    }
}