import java.util.Scanner;
public class grader {
    public static String calculgrade(int score) {
        if (score < 0 && score > 100) {
            return "Validation! The score should be between 0 and 100.";}
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if ( score>= 70){
            return " C";
        } else if ( score>= 60){
            return " D";
        } else{
            return "F";}}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int overall = sc.nextInt();
        String grade = calculgrade(overall);
        System.out.println("Grade: " +grade);}}
