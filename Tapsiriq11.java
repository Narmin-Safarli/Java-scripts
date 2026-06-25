public class Tapsiriq11 {
    public static void main(String[] args) {
        String parol = "Abb@2024";

        boolean uzunUygun = parol.length() >= 8;
        boolean xarakterVar = parol.contains("@");
        boolean abbIleBaslayir = parol.toUpperCase().startsWith("ABB");
        boolean reqemVar = parol.contains("2024");
        boolean gucluParol = uzunUygun && xarakterVar && abbIleBaslayir && reqemVar;

        System.out.println("Uzunluq uyğundur:" + uzunUygun);
        System.out.println("@ xarakteri var:" + xarakterVar);
        System.out.println ("ABB ilə başlayır:" + abbIleBaslayir);
        System.out.println("2024 rəqəmi var:" + reqemVar);
        System.out.println("Parol güclüdür:" + gucluParol);
    }
}