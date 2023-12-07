public class Main {
    static String[] productions;
    static String[] nonTerminals;
    static String[] expressions;
    static int length;
    
    public static void main(String[] args) {
        productions = new String[4];
        productions[0] = "E => Ta|b";
        productions[1] = "T => F";
        productions[2] = "F => id";
        productions[3] = "K => (E)";
        
        length = productions.length;
        
        nonTerminals = new String[length];
        expressions = new String[productions.length];
        for (int i = 0; i < length; i++) {
            nonTerminals[i] = productions[i].replaceAll(" ", "").substring(0, 1);
            expressions[i] = productions[i].replaceAll(" ", "").substring(3);
            
        }
        
        for (int i = 0; i < length; i++) {
            boolean isTerminal = true;
            String current = expressions[i];
            if (current.contains("|")) {
                String[] temp = expressions[i].split("\\|");
                System.out.print(nonTerminals[i] + " → ");
                for (int j = 0; j < temp.length; j++) {
                    if (j == temp.length - 1) {
                        System.out.print(findNonTerminalUsingRecursion(String.valueOf(temp[j].charAt(0))));
                        break;
                    }
                    System.out.print(findNonTerminalUsingRecursion(String.valueOf(temp[j].charAt(0))) + ", ");
                }
                System.out.println();
                continue;
            }
            for (int j = 0; j < length; j++) {
                if (current.charAt(0) == nonTerminals[j].charAt(0)) {
                    System.out.println(nonTerminals[i] + " → " + findNonTerminalUsingRecursion(String.valueOf(current.charAt(0))));
                    isTerminal = false;
                }
            }
            if (isTerminal) {
                System.out.println(nonTerminals[i] + " → " + findNonTerminalUsingRecursion(current));
            }
        }
        
    }
    
    public static String findNonTerminalUsingRecursion(String current) {
        for (int i = 0; i < expressions.length; i++) {
            if (current.equals(nonTerminals[i])) {
                return findNonTerminalUsingRecursion(expressions[i]);
            }
        }
        if (current.trim().equals("num") || current.trim().equals("id")) {
            return current;
        }
        return String.valueOf(current.charAt(0));
    }
}