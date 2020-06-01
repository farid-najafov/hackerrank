package Algorithms;

/**
 * https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 */
public class DesignerPDFViewer {
    static int designerPdfViewer(int[] h, String word) {
//        int max = word.chars().map(i -> i - 97).map(i -> h[i]).max().orElseThrow(RuntimeException::new);
        int max = word.chars().map(i -> h[i-97]).max().orElseThrow(RuntimeException::new);
        return max * word.length();
    }

    public static void main(String[] args) {
        int[] data = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7};
        String word = "zaba";
        System.out.println(designerPdfViewer(data, word));
    }
}
