public class Tapsiriq13 {
    public static void main(String[] args) {
        String metn = "  Java proqramlaşdırma dili çox güclüdür!  ";

        //Trim-dən əvvəl və sonra uzunluq fərqi
        System.out.println(metn.length() - metn.trim().length());

        //"Java" sözü varmı? Böyük hərfə yazanda da varmı?
        System.out.println(metn.contains("Java"));
        System.out.println(metn.toUpperCase().contains("JAVA"));

        //"proqramlaşdırma" sözünü "programming" ilə əvəz edin
        System.out.println(metn.replace("proqramlaşdırma", "programming"));

        //İlk 4 hərf nədir?
        System.out.println(metn.trim().substring(0, 4));

        //"!" işarəsi varmı?
        System.out.println(metn.contains("!"));

        //Bütün mətn kiçik hərfə və trim edilmiş şəkildə
        System.out.println(metn.toLowerCase().trim());
    }
}