package edu.gsu.cis3270.assignment2.chapter15;
import java.util.ArrayList;
public class TestMyStack{
	public static void main(String[] args){
		
		MyStack stack = new MyStack();
		stack.push("s1");
		stack.push("s2");
		stack.push("s");
		
		MyStack stack1 = (MyStack) (stack.clone());
		stack1.push("s1");
		stack1.push("s2");
		stack1.push("s");
	
		System.out.println(stack.getSize());
		System.out.println(stack1.getSize());
	}
}	
class MyStack {
	private ArrayList<Object> list = new ArrayList<Object>();
	
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
	
		
	public Object clone(){
		try{
			MyStack myStackClone = (MyStack)super.clone();
			myStackClone.list = (ArrayList<Object>) this.list.clone();
			return myStackClone;
		}
		catch (CloneNotSupportedException ex){
			return null;
		}
	}
}
