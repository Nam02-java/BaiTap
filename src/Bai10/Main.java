package Bai10;

import java.util.Scanner;

public class Main {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    public static void main(String[] args) {
        System.out.println("Nhap : ");
        String text = new Scanner(System.in).nextLine();
        System.out.println("so tu : " + countWords(text));
        System.out.println("----------------");
        count_repeat(text);
        chuanHoaVanBan(text);
    }

    private static int countWords(String input) {
        if (input == null) {
            return -1;
        }
        int count = 0;
        int size = input.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != SPACE && input.charAt(i) != TAB
                    && input.charAt(i) != BREAK_LINE) {
                if (notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }

    private static void count_repeat(String input) {
        int count = 0;
        char kyTu = 'a';
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == kyTu) {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
                " trong chuỗi " + input + " = " + count);
    }

    private static void chuanHoaVanBan(String input) {
        input = input.trim();
        input = input.replaceAll("\\s+", " ");
        System.out.println(input);
    }
}
