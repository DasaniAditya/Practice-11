// Number of Good Pairs

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i] , 1);
            } else {
                result+= map.get(nums[i]);
                map.put(nums[i] , map.get(nums[i])+1);
            }
        }
        return result;
    }
}


// Reverse String in each Parantheses


class Solution {
    public String reverseParentheses(String s) {
        if(s == null || s.length() == 0) {
            return s;
        }
        
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length(); i++) {
            if(s.charAt(i) != ')') {
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == ')') {
                StringBuilder sb = new StringBuilder();
                while(stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                stack.pop();
                int j = 0;
                while(j < sb.length()) {
                    stack.push(sb.charAt(j++));
                }
            }
        }
        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}

