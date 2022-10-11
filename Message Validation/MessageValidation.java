//implement this method in your main class


	public static List MessageValidation(String string) {
		ArrayList list = new ArrayList();
		
		int index = string.length();
		boolean answer = true;
		
		 Stack<String> stack = new Stack<>();
		   for(int i = 0; i <= string.length() - 1; i ++){

		       if(string.substring(i, i+1).equals("("))
		           stack.push((string.substring(i, i+1)));

		       else if(string.substring(i, i+1).equals("["))
		           stack.push((string.substring(i, i+1)));

		       else if(string.substring(i, i+1).equals("{"))
		           stack.push((string.substring(i, i+1)));

		       else if(string.substring(i, i+1).equals(")"))
		           if(stack.peek().equals("("))
		               stack.pop();
		           else {
		        	   answer=false;
		       		   index = i;
		       		   break;
		           }
		       else if(string.substring(i, i+1).equals("]"))
		           if(stack.peek().equals("["))
		               stack.pop();
		           else {
		        	   answer=false;
		       		   index = i;
		       		   break;
		           }

		       else if(string.substring(i, i+1).equals("}"))
		           if(stack.peek().equals("{"))
		               stack.pop();
		           else {
		        	   answer=false;
		       		   index = i;
		       		   break;
		           }
		       }
		   if(!stack.empty()) {
			   answer=false;
		   }
		list.add(answer);
		list.add(index);
		return list;
	}
