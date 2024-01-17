package MutableStringAssign17;

public class Que4 {
    public static void main(String[] args){
        StringBuffer s=new StringBuffer("DSPFSMV");
        String ss="adad";
        char arr[]=ss.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]>arr[j]){
                    char a=arr[i];
                    arr[i]=arr[j];
                    arr[j]=a;
                }
            }
            
        }
        System.out.println(arr);

    }
}
