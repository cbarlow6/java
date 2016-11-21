package edu.gsu.cis3270.assignment2.chapter15;
import java.util.ArrayList;

public class TestMyStack{
	public static void main(String[] args) throws CloneNotSupportedException{
		
		MyStack stack = new MyStack();		
		stack.push("yes");
		
		
		MyStack stack1 = (MyStack)(stack.clone());
		stack1.push("yes");
		
		System.out.println(stack.getSize());
		System.out.println(stack1.getSize());
	}
}	
class MyStack implements Cloneable {
	private ArrayList<Object> list = new ArrayList<Object>();
	
	MyStack(){
		
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public int getSize(){
		return list.size();
	}
	public Object peek(){
		return list.get(getSize() - 1);
	}
	public Object pop(){
		Object o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	public void push(Object o){
		list.add(o);
	}
	@Override
	public String toString(){
		return "stack: " + list.toString();
	}
	
//}		

	/*public Object clone() throws CloneNotSupportedException{
		ArrayList<Object> stack1 = (ArrayList<Object>)(list.clone());
		return stack1;
	}*/
	
	
	@SuppressWarnings("unchecked")
	public Object clone(){
		try{
			//ArrayList<Object> list2 = (ArrayList<Object>)list.clone();
			//ArrayList<MyStack> list = new ArrayList<MyStack>();
			//ArrayList<MyStack> list2 = (ArrayList<MyStack>)list.clone();
			MyStack clone1 = (MyStack)super.clone();
			//ArrayList<MyStack> myStackClone = (ArrayList<MyStack>)list.clone();
			clone1.list = (ArrayList<Object>)this.list.clone();
			return clone1;
		}
		catch (CloneNotSupportedException ex){
			return null;
		}
	}
}
