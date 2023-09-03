package yogesh_package.BINARY_SEARCH;

public class smallest_letter {
    public static void main(String[] args) {
        char[] letters = {'a', 'c', 'e', 'f'};
        char res = func(letters, 'e');
        System.out.println("Result: " + res);
    }

    private static char func(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (letters[mid]>target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println("value : "+start+"letter length : "+letters.length);
        return letters[start%letters.length];
    }
}
