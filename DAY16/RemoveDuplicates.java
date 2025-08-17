package DAY16;

public class RemoveDuplicates {
    public static void removeduplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) { // base-case
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate
            removeduplicates(str, idx + 1, newStr, map); // next index ke liye call
        } else {
            // first time
            map[currChar - 'a'] = true; // array me true fill krrdenge
            removeduplicates(str, idx + 1, newStr.append(currChar), map); // newString me usko daal denge
        }
    }

    public static void main(String args[]) {
        String str = "apnacollege";
        removeduplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
