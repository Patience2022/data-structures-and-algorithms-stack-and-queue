package stack;

public class MyStack {

	private Node top;
	private int height;
		
	public Node getTop() {
		return top;
	}

	public int getHeight() {
		return height;
	}
	public MyStack(int value) {
		Node newNode = new Node(value);
		top = newNode;
		height = 1;		
	}
	
	public void printElements()
	{
		Node temp = top;
		while(temp != null)
		{
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void push(int value)
	{
		Node newNode = new Node(value);
		if(height == 0)
		{
			top = newNode;
		}
		else
		{
			newNode.next = top;
			top = newNode;
		}
		height++;
	}
	public Node pop()
	{
		if(height ==0) return null;
		Node temp = top;
		top = temp.next;
		temp.next = null;
		height--;
		return temp;
	}
}
