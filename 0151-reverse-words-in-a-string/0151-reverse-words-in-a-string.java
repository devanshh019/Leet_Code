class Solution {
    public String reverseWords(String s) {
        int i = s.length() - 1;
        StringBuilder sb = new StringBuilder("");
        while (i >= 0) {
            char ch = s.charAt(i);
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            if (i < 0)
                break;
            int j = i - 1;
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }
            sb.append(s.substring(j + 1, i + 1));
            sb.append(" ");

            i = j - 1;
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}