class revnbr{

static int sum= 0;
   static void  rev1(int n){
    if(n == 0){
       return;
   }
   int rem = n%10;
   sum = sum *10 + rem;
   rev1(n/10); 
}  
public static void main(String[] args){ 
    rev1(1234);
    System.out.println(sum);
}}



/*  int c=getrevnbr(123);
    System.out.println(c);
}
   static int getrevnbr(int n){
        if(n/10==0){
            return n;
        }
        else{
            return getrevnbr(n/10*n%10);
        }*/
     
    

   
   