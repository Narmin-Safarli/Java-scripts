public class Tapsiriq7 {
    public static void main(String[] args) {
        double temp = 36.8;
        boolean isNormalTemp = temp > 36 && temp < 37.5;
        System.out.println("Temperatur normaldırmı? " + isNormalTemp);

        int suret = 95;
        int yanacaq = 0;
        boolean suretYanacaqYaxsidir = (suret > 0 && suret < 120) || (yanacaq > 0);
        System.out.println("Sürət və yanacaq uyğundurmu? " + suretYanacaqYaxsidir);

        boolean aktiv = false;
        double balans = -50.0;
        boolean hesabProblemlidir = !aktiv || balans < 0;
        System.out.println("Hesabda problem varmı? " + hesabProblemlidir);

        String ad = "Anar";
        int yas = 22;
        boolean adVeYasUygundur = ad.length() > 0 && yas > 18;
        System.out.println("Ad və yaş uyğundurmu? " + adVeYasUygundur);
    }
}