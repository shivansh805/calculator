import java.util.Scanner;
 class calc {
     public static void main(String[]args){
         char operator;
         double a,b,c;
         Scanner input= new Scanner(System.in);
         System.out.println("enter the operator you want to perform: +,-,*,/");
         operator=input.next().charAt(0);
         System.out.println("enter first no");
         a=input.nextDouble();
         System.out.println("enter second number");
         b=input.nextDouble();

         switch(operator){
             case '+':
                 c=a+b;
                 System.out.println(a+"+"+b+"="+c);
                 break;
             case'-':
                 c=a-b;
                 System.out.println(a+"-"+b+"="+c);
                 break;
             case'*':
                 c=a*b;
                 System.out.println(a+"*"+b+"="+c);
                 break;
             case'/':
                 c=a/b;
                 System.out.println(a+"/"+b+"="+c);
                 break;
             default:
                 System.out.println("wrong operator");
                 break;
         }
         input.close();
     }
}
