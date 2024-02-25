import java.util.*;
public class Main{
	public static void main(String args[]){
    LinkedList<Integer> l1 = new LinkedList<Integer>();
    LinkedList<Integer> l2 = new LinkedList<Integer>();
    LinkedList<Integer> l3 = new LinkedList<Integer>();
    Scanner sc = new Scanner(System.in);
    int s1 = sc.nextInt();     
    for(int i =0;i<s1;i++){
      	int temp = sc.nextInt();
	    l1.add(temp);
    }
    int s2 = sc.nextInt();     
    for(int i =0;i<s2;i++){
      	int temp = sc.nextInt();
	    l2.add(temp);
    } 
    int i=0;
    int j=0;
    while(i<l1.size() && j<l2.size()){
    	if(l1.get(i)<l2.get(j)){
        	l3.add(l1.get(i));
          	i++;
        } else {
        	l3.add(l2.get(j));
          	j++;
        }
    }
    if(i==l1.size()) for(int k=j;k<l2.size();k++) l3.add(l2.get(k));
    if(j==l2.size()) for(int k=i;k<l1.size();k++) l3.add(l1.get(k));
    for(int i1 =0;i1<l3.size()-1;i1++) System.out.print(l3.get(i1)+"->");
    System.out.print(l3.get(l3.size()-1)+"->NULL");
    }
}
