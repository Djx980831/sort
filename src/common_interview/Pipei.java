package common_interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * @param
 * @Description TODO
 * @Author dongjingxiong
 * @return
 * @Date 2020-04-03 19:41
 */
public class Pipei {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(isTrue(str));
    }

    public static boolean isTrue(String str) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            Character character = str.charAt(i);
            if (map.containsValue(character)) {
                stack.push(character);
            } else if (map.containsKey(character)) {
                if (stack.empty()) {
                    return false;
                }
                if (stack.peek() == map.get(character)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }
}
