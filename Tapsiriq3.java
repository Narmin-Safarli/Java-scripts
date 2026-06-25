public class Tapsiriq3 {
    public static void main(String[] args) {
        int a=8, b=3;
        boolean p=true, q=false;
        String s = "QA";

        System.out.println("Toplamanın nəticəsi:" + (a + b));                          // 11
        System.out.println("Çıxmanın nəticəsi:" + (a - b *2));                         // 2
        System.out.println("Bölmənin nəticəsi:" + (a / b));                            // 2
        System.out.println("Bölmənin qalıq nəticəsi:" + (a % b));                      // 2
        System.out.println("And operatorunun nəticəsi:" + (p && q));                   //biri false olduğu üçün cavab false olacaq
        System.out.println("Or operatorunun nəticəsi:" + (p || q));                    //biri true olduğu üçün cavab true olacaq
        System.out.println("Not operatorunun nəticəsi:" + (!p && !q));                 //NOT birini false, digərini true'a dəyişib.Cavab yenə false qalacaq
        System.out.println("Müqayisə operatorunun nəticəsi:" + (a > 5 || b > 5));      //1 false 1 true cavab true olacaq
        System.out.println("Toplama mətn birinci:" + (s + a + b));                     //Cavab QA83 olacaq mətn əvvəldə olduğu üçün ədədləri birləşdirir
        System.out.println("Toplama mətn sonuncu:" + (a + b + s));                     //Cavab 11QA olacaq mətn sonda olduğu üçün
}

     }