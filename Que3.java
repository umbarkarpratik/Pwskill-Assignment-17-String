package MutableStringAssign17;
//WAP to reverse a sentence while preserving the position.
//lazy dog
//yzal god
public class Que3 {
    public static void main(String[] args){
        String str="Lazy Dog";
        String s="";
        char[] arr=str.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            s=s+arr[i];
        }
       String ss[]= s.split(" ");
        for(int i=ss.length-1;i>=0;i--){
            System.out.print(ss[i] + " ");
        }

        
        

        
        
      
         
       
       
       

    }
}
