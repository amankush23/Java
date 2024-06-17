public class FirstAndLastOccurrence {
    public static int first = -1;
    public static int last = -1;

    public static void printOccurrence(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println("First occurrence: " + first);
            System.out.println("Last occurrence: " + last);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }

        printOccurrence(str, idx + 1, element);
    }

    public static void main(String[] args) {
        String str = "aldfjsasaaalsaasas";
        printOccurrence(str, 0, 'a');
    }
}
