public class fibonacci{

    public static void main(String[] args){
    System.out.println("fibonacci series\n");

    int firstTerm=0,secondTerm=1,n=5;

    for(int i=1; i<n; i++){
     
     System.out.print(firstTerm+",");

     int nextTerm=(firstTerm+secondTerm);

     firstTerm=secondTerm;
     secondTerm=nextTerm;


   }
 }
}