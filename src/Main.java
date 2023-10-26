public class Main {

    public static void main(String[] args) {

    }

    // Question 1 - calculateGrade
    public static char calculateGrade(int g){
        if (g>=90) return 'A';
        else if (g>=80) return 'B';
        else if (g>=70) return 'C';
        else if (g>=60) return 'D';
        else if (g>=50) return 'E';
        else return 'F';
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int x){
        if (x%3==0&&x%5==0) return "fizzbuzz";
        if (x%3==0) return "fizz";
        if (x%5==0) return "buzz";
        return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String s){
        if (s.length()<2) return s;
        String fst2 = s.substring(0,2);
        return fst2 + s + fst2;
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        if (a+b==c||a+c==b||c+b==a) return true;
        return false;
    }

    // Question 5 - endUp
    public static String endUp(String s){
        if (s.length()<3){
            return s.toUpperCase();
        }
        String x = s.substring(0,s.length()-3);
        String last3up = s.substring(s.length()-3,s.length()).toUpperCase();
        return x + last3up;
    }

}
