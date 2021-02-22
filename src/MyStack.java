public class MyStack {
  char arr[];
  int top;
  int capacity;
  public MyStack(int capacity)
  {
      arr = new char[capacity];
      top = -1;
      this.capacity = capacity;
  }
  public boolean isEmpty()
  {
    return (top == -1);

  }
  public boolean isFull()
  {
    if(top == arr.length-1)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public void push(char value)
  {
    if(isFull())
    {
      return;
    }
  else
    {
      arr[++top]= value;
    }
  }
  public char pop()
  {
    return (arr[top--]);
  }
  public char peek()
  {
    return arr[top];
  }


}
