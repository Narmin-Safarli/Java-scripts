public class Tapsiriq10 {
    public static void main(String[] args) {
        int mebler = 5000;
        int faiz  = 15;
        double faizMeblegi = mebler * faiz / 100.0;

        //Tam dəqiq hesablamaq üçün 100 yox, 100.0 yazmalıyıq

        System.out.println("Faiz məbləği: " + faizMeblegi);
    }
}