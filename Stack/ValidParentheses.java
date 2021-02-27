public class ValidParentheses {
	public boolean isValid(String s) {
		Map<Character, Character> map = new HashMap<Character, Character>();

		map.put('(',')');
		map.put('{','}');
		map.put('[',']');

		// Convert s to a char array
		char[] chars = s.toCharArray();

		Stack<Character> stack = new Stack<Character>();

		for(char c: chars) {
			if(map.containsKey(c)) {
				stack.push(c);
			} else {
				if(stack.isEmpty()) {
					return false;
				} else {
					char top = stack.pop();
					if(c != map.get(top)) {
						return false;
					}
				}
			}
		}

		return stack.isEmpty();
	}
}