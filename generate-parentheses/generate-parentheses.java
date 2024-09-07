class Solution {
public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n < 1) return result;
        genrate(n, n, "", result);
        return result;
    }

    void genrate(int opens, int closes, String str, List<String> result) {
        if (opens == 0 && closes == 0) {
            result.add(str);
            return;
        }
        if (opens > 0) {
            genrate(opens - 1, closes, str + "(", result);
        }

        if (closes > 0 && closes > opens) {
            genrate(opens, closes - 1, str + ")", result);
        }

    }
}