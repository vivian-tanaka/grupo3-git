package aula4.exercicio6.main;

public class StringUtils {

    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "  1 2 3";
        String s3 = "123   1  1    ";

        System.out.println(rpad(s1, '0', 6));

        System.out.println(ltrim(s2));
        System.out.println(ltrim(s1));
        System.out.println(ltrim(s3));

        System.out.println(rtrim(s3));
        System.out.println(rtrim(s3).equals("123   1  1    "));
        System.out.println(rtrim(s3).equals("123   1  1"));

        System.out.println(trim(s3));
        System.out.println(trim(s1));

        System.out.println(indexOfN(s3, '1', 2));
        System.out.println(indexOfN(s3, '1', 3));
        System.out.println(indexOfN(s3, 'x', 3));
        System.out.println(indexOfN(s3, '1', 4));
        System.out.println(indexOfN(s3, ' ', 2));
    }

    public static String rpad(String s, char c, int n){
        while (s.length() < n)
            s = s + c;

        return s;
    }

    public static String ltrim(String s) {
        while(s.charAt(0) == ' ')
            s = s.substring(1, s.length());

        return s;
    }

    public static String rtrim(String s) {
        while(s.charAt(s.length() -1) == ' ')
            s = s.substring(0, s.length() -1);

        return s;
    }

    public static String trim(String s) {
//        s.replace(" ", "");
        while(s.indexOf(' ') != -1)
            s = new StringBuilder(s).deleteCharAt(s.indexOf(' ')).toString();

        return s;
    }

    public static int indexOfN(String s, char c, int n) {
        int qtd = 0;
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c){
                qtd++;
            }
            if(qtd == n){
                index = i;
                break;
            }
        }

        return index;
    }
}
