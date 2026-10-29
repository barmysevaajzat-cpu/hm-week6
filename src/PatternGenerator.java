import java.util.Scanner;
public class PatternGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("1 - Right Triangle");
        System.out.println("2 - Inverted Right Triangle");
        System.out.println("3 - Pyramid");
        System.out.println("4 - Inverted Pyramid");
        System.out.println("5 - Diamond");
        System.out.print("Your choice: ");
        int ch = sc.nextInt();
        System.out.println("Size: " + rows);
        if (ch == 1) {
            triangle(rows);
        } else if (ch == 2) {
          otriangle(rows);
        } else if (ch == 3) {
         pyramid(rows);
        } else if (ch == 4) {
           opyramid(rows);
        } else if (ch == 5) {
           diamond(rows);
        } else {
            System.out.println("Wrong choice!");}}
    public static void triangle(int rows) {
        System.out.println("Pattern: Right Triangle");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");}
            System.out.println();}}
    public static void otriangle(int rows) {
        System.out.println("Pattern: Inverted Right Triangle");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");}
            System.out.println();}}
    public static void pyramid(int rows) {
        System.out.println("Pattern: Pyramid");
        for (int i = 1; i <= rows; i++) {
            for (int place = 1; place <= rows - i; place++) {
                System.out.print(" ");}
            for (int star = 1; star <= (i * 2 - 1); star++) {
                System.out.print("*");}
            System.out.println();}}
    public static void opyramid(int rows) {
        System.out.println("Pattern: Inverted Pyramid");
        for (int i = rows; i >= 1; i--) {
            for (int place = 1; place <= rows - i; place++) {
                System.out.print(" ");}
            for (int star = 1; star <= (i * 2 - 1); star++) {
                System.out.print("*");}
            System.out.println();}}
    public static void diamond(int rows) {
        System.out.println("Pattern: Diamond");
        for (int i = 1; i <= rows; i++) {
            for (int place = 1; place <= rows - i; place++) {
                System.out.print(" ");}
            for (int star = 1; star <= (i * 2 - 1); star++) {
                System.out.print("*");}
            System.out.println();}
        for (int i = rows - 1; i >= 1; i--) {
            for (int place = 1; place <= rows - i; place++) {
                System.out.print(" ");}
            for (int star = 1; star <= (i * 2 - 1); star++) {
                System.out.print("*");}
            System.out.println();}}}