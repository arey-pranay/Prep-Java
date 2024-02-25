import java.util.*;
class Main
{
  public static void main(String args[])
  {
    LinkedList<Integer> l1 = new LinkedList<Integer>();
    Scanner sc = new Scanner(System.in);
    int sz = sc.nextInt();
    for(int i=0;i<sz;i++){
    int temp = sc.nextInt();
    l1.add(temp);
    }
    int i=0;
    int j=l1.size()-1;
    while(i<j){
    	if(l1.get(i)!=l1.get(j)){
          System.out.print("False");
          return;        
        }
      	i++;j--;
    }
    System.out.println("True");
  }
  
  
}
