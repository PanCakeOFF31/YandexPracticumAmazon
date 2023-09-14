// Вспомогательный класс, для визуального оформления в консоль вывода
package helpers;

public class Helpers {
    public static void printLine() {
        System.out.println();
    }

    public static void printArticle() {
        String newLine = "======================================================================";
        System.out.println(newLine);
//        printLine();
    }

    public static void printArticle(String text) {
        String newLine = "======================================================================";
        System.out.println(newLine);
        System.out.println("\t\t\t" + text);
//        printLine();
    }

    public static void printArticleEnding() {
        printArticle();
    }

    public static void printSection() {
        String newLine = "----------------------------------------------------------------------";
        System.out.println(newLine);
//        printLine();

    }

    public static void printSection(String text) {
        String newLine = "----------------------------------------------------------------------";
        System.out.println(newLine);
        System.out.println("\t\t" + text);
//        printLine();
    }

    public static void printSectionEnding() {
        printSection();
    }
    public static void printSubSection() {
        String newLine = "-----------------------------------";
        System.out.println(newLine);
    }

    public static void printSubSection(String text) {
        String newLine = "-----------------------------------";
        System.out.println(newLine);
        System.out.println("\t" + text);
    }

    public static void printSubSectionEnding() {
        printSubSection();
    }


    public static void printTextWithTab(String text) {
        System.out.println("\t" + text);
    }
}

/* printArticle("Article #1");
        // ...
        printArticleEnding();*/
        /*
        printSection("Section #1");
        printSubSection("SubSection #1");
        // ...
        printSubSectionEnding();
        printSubSection("SubSection #2");
        // ...
        printSubSectionEnding();
        printSectionEnding();*/
