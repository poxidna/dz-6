import java.util.*;

public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int[] array = new int[]{4, 6, 1, 8, 10, 7};
        System.out.println("The first task");
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 2) == 0) {
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
        System.out.println(" ");
        System.out.println("The second task");

        String s = "my first try";
        String [] words = new String[]{s};
        solver(words);
    }

    public static void solver(String[] words) {
        List<String> helpList = new ArrayList<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            Map<Character, Integer> helpMap = new HashMap<>();
            for (Character character : chars) {
                if (helpMap.containsKey(character)) {
                    Integer value = helpMap.get(character) + 1;
                    continue;
                } else {
                    helpMap.put(character, 1);
                    System.out.println(character);
                }
            }

        }
    }
}



