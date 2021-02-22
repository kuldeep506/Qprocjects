public class BalancedBracket {
  String str ;
  public BalancedBracket(String s)
  {
    str = s;
  }
  // define the logic of the balanced bracket
  public void check()
  {
    MyStack obj = new MyStack(str.length());
    char ch;
    for (int i = 0; i <str.length() ; i++) {
      ch = str.charAt(i);
      if(ch=='['|| ch=='{' || ch== '(')
      {
        obj.push(ch);
      }
      else if (ch==']'|| ch=='}'|| ch==')')
      {
        if(obj.isEmpty())
        {
          System.out.println("invalid");
          return;
        }
        //char  stchar= obj.arr[obj.top];
        char stchar = obj.peek();
        if((stchar =='('&& ch==')')||(stchar =='['&& ch==']')||(stchar =='{'&& ch=='}'))
        {
         obj.pop();
        }
        else
        {
          System.out.println("invalid");
          return;
        }
      }


    }
    if(obj.isEmpty())
    {
      System.out.println("Balanced Brackets");
    }

  }

}
