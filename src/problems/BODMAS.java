package problems;

class BODMAS {
    public static void main(String[] args) {
        //String str = "30-2*4+(2*8)-4/2";
        //String str = "7-2*4+(2*1000+3)-4/2";
        //String str = "2*10";
        String str = "(3+(2*10)+10)";
        str = solve(str);
        System.out.print(str);
    }


    public static String solve(String str) {
        str = solveBracket(str);
        str = calculate(str);
        return str;
    }

    public static String solveBracket(String str) {
        if (!str.contains("(")) {
            return str;
        }
        int endIndex = closingBracket(str, str.indexOf('('));
        String temp = str.substring(str.indexOf('(') + 1, endIndex);
        String rec = solveBracket(temp);
        str = str.substring(0, str.indexOf('(')) + calculate(rec) + str.substring(endIndex + 1);
        return solveBracket(str);
    }

    public static int closingBracket(String str, int start) {
        int open = 1;
        for (int i = start + 1; i < str.length(); ++i) {
            if (str.charAt(i) == '(') {
                open++;
            } else if (str.charAt(i) == ')') {
                open--;
                if (open == 0) {
                    return i;
                }
            }
        }
        return 0;
    }

    public static String calculate(String str) {

        if (str.contains("/")) {
            str = solve(str, '/');
        }
        if (str.contains("*")) {
            str = solve(str, '*');
        }
        if (str.contains("+")) {
            str = solve(str, '+');
        }
        if (str.contains("-")) {
            str = solve(str, '-');
        }
        return str;
    }

    public static String solve(String str, char c) {
        for (int i = 0; i < str.length(); ++i) {
            String ans = "", prevNum = "", nextNum = "";
            if (str.charAt(i) == c) {
                int d = i;
                while (true) {
                    if ((i - 1 == -1) ||
                            (str.charAt(i - 1) == '+') ||
                            (str.charAt(i - 1) == '-') ||
                            (str.charAt(i - 1) == '*') ||
                            (str.charAt(i - 1) == '/')) {
                        prevNum += str.substring(i, d);
                        break;
                    } else {
                        i--;
                    }
                }
                i = d;
                while (true) {
                    if ((i + 1 == str.length()) ||
                            (str.charAt(i + 1) == '+') ||
                            (str.charAt(i + 1) == '-') ||
                            (str.charAt(i + 1) == '*') ||
                            (str.charAt(i + 1) == '/')) {
                        nextNum += str.substring(d + 1, i + 1);
                        break;
                    } else {
                        i++;
                    }
                }
                if (c == '+') {
                    ans += add(prevNum + c + nextNum);
                } else if (c == '-') {
                    ans += subtract(prevNum + c + nextNum);
                } else if (c == '*') {
                    ans += multiply(prevNum + c + nextNum);
                } else if (c == '/') {
                    ans += divide(prevNum + c + nextNum);
                }

                str = str.replace(prevNum + c + nextNum, ans);
                i = 0;
            }
        }
        return str;
    }

    public static String add(String str) {
        String pre = str.substring(0, str.indexOf('+'));
        int first = Integer.parseInt(pre);
        String pos = str.substring(str.indexOf('+') + 1);
        int sec = Integer.parseInt(pos);
        return String.valueOf(first + sec);
    }

    public static int subtract(String str) {
        String pre = str.substring(0, str.indexOf('-'));
        int first = Integer.parseInt(pre);
        String pos = str.substring(str.indexOf('-') + 1);
        int sec = Integer.parseInt(pos);
        return first - sec;
    }

    public static int multiply(String str) {
        String pre = str.substring(0, str.indexOf('*'));
        int first = Integer.parseInt(pre);
        String pos = str.substring(str.indexOf('*') + 1);
        int sec = Integer.parseInt(pos);
        return first * sec;
    }

    public static int divide(String str) {
        String pre = str.substring(0, str.indexOf('/'));
        int first = Integer.parseInt(pre);
        String pos = str.substring(str.indexOf('/') + 1);
        int sec = Integer.parseInt(pos);
        return first / sec;
    }
}

//for (int i = 0; i < str.length(); ++i) {
//        if (str.charAt(i) == '(') {
//int endI = str.indexOf(')');
//String temp = str.substring(i+1, endI);
//                while (temp.contains("(") && !temp.contains(")")) {
//endI = str.indexOf(')', endI+1);
//temp = str.substring(i+1, endI);
//                }
//                        if (temp.contains("(")) {
//temp = recursive(temp);
//                }
//str = str.replace("("+temp+")", calculate(temp));
//        }
//        }


