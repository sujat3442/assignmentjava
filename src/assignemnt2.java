import java.util.Scanner;



import java.util.Scanner;

        //Write a program to take student details as input and display the result.
         class Question5 {
                public static void main(String[] args) {
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("Enter name:");
                        String name = scanner.nextLine();
                        System.out.println("Enter age:");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter address:");
                        String location = scanner.nextLine();
                        System.out.println("Enter contact:");
                        long  contact = scanner.nextLong();
                        System.out.println("Name is:"+name+"\n"+"Age is:"+age+"\n"+"address is:"+location+"\n"+"contact is:"+contact);
                }
        }

}



        import java.util.Scanner;

//. Write a program to calculate sum of four numbers taking user input.
 class Question6 {
        public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Enter first number");
                int num1=scanner.nextInt();
                System.out.println("Enter second number");
                int num2=scanner.nextInt();
                System.out.println("Enter third number");
                int num3=scanner.nextInt();
                System.out.println("Enter fourth number");
                int num4=scanner.nextInt();

                int sum=num1+num2+num3+num4;
                System.out.println("The sum is:"+sum);

        }
}


import java.util.Scanner;

//Write a program to take two integer inputs from user and print sum and product of them.
 class Question7 {
        public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Enter first number");
                int num1=scanner.nextInt();
                System.out.println("Enter second number");
                int num2=scanner.nextInt();
                int sum=num1+num2;
                System.out.println("The sum is:"+sum);
                int product=num1*num2;
                System.out.println("The product is:"+product);

        }
}




import java.util.Scanner;

//Take two integer inputs from user. First calculate the sum of two and then product.
//Finally, calculate the division of thus obtained sum and product and print the result.
 class Question8 {
        public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Enter first number");
                int num1=scanner.nextInt();
                System.out.println("Enter second number");
                int num2=scanner.nextInt();
                int sum=num1+num2;
                System.out.println("The sum is:"+sum);
                int product=num1*num2;
                System.out.println("The product is:"+product);

                float division=(sum/product);
                System.out.println("The division of sum and product is:"+division);

        }
}





import java.util.Scanner;

//Ask user to give two double input for length and breadth of a rectangle and print area type
//casted to int.
 class Question9 {
        public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Enter Length:");
                double l = scanner.nextDouble();
                System.out.println("Enter Breadth:");
                double b = scanner.nextDouble();
                double area= l*b;
                int areas=(int) (area);
                System.out.println("The area is:"+areas);

        }
}








//Take name, roll number and field of interest from user and print in the format below :Hey,
//my name is xyz and my roll number is xyz. My field of interest are xyz.
import java.util.Scanner;
 class Question10 {
        public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter name:");
                String name = scanner.nextLine();
                System.out.println("Enter rollno:");
                int rollno = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter field of interest:");
                String interest = scanner.nextLine();

                System.out.println("My name is: " + name+"\t"+"My roll no is:"+rollno+"\t"+"My field of interest is:"+interest);

        }
}



import java.util.Scanner;

//Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
//of triangle and Volume of Cube and Cuboid. Take the attributes as user input.
 class Question11 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a side of square:");
                int a= scanner.nextInt();
                int areaofsqr=a*a;
                System.out.println("The area of square is:"+areaofsqr);
                int periofsqr=4*a;
                System.out.println("The perimeter of square is:"+periofsqr);

                System.out.println("\n");

                System.out.println("Enter principle:");
                int p= scanner.nextInt();
                System.out.println("Enter rate:");
                int r= scanner.nextInt();
                System.out.println("Enter time:");
                int t= scanner.nextInt();
                double SI=(p*t*r)/100;
                System.out.println("The SI unit is:"+SI);

                System.out.println("\n");

                System.out.println("Enter length of triangle:");
                int len= scanner.nextInt();
                System.out.println("Enter breadth of triangle:");
                int bre= scanner.nextInt();
                double areaoftri=0.5*(len*bre);
                System.out.println("The area of triangle is:"+areaoftri);

                System.out.println("\n");

                System.out.println("Enter length of cube:");
                int lent= scanner.nextInt();
                int volofcube=lent*lent*lent;
                System.out.println("The volume of cube is:"+volofcube);

                System.out.println("\n");

                System.out.println("Enter length of cuboid:");
                int l= scanner.nextInt();
                System.out.println("Enter breadth of cuboid:");
                int b= scanner.nextInt();
                System.out.println("Enter height of cuboid:");
                int h= scanner.nextInt();
                int volofcuboid=l*b*h;
                System.out.println("The volume of cuboid is:"+volofcuboid);


        }
}






import java.util.Scanner;

//Write a program to find square of a number.
//E.g.- INPUT : 2 OUTPUT : 4
//INPUT : 5 OUTPUT : 25
 class Question12 {
        public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Enter a number:");
                int a=scanner.nextInt();
                int sqr= (int) Math.pow(a,2);
                System.out.println("The square of the number is:"+sqr);
        }
}





//Take two different string input and print them in same line. E.g.-
//INPUT : Codes
//Dope
//OUTPUT : CodesDope
 class Question13 {
        public static void main(String[] args) {
                System.out.print("Codes");
                System.out.print("Dope");
        }
}










import java.util.Scanner;

//Take 3 inputs from user and check :
//all are equal
//any of two are equal
//( use && || with ternary operator )
 class Question14 {
        public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Enter first number");
                int a=scanner.nextInt();
                System.out.println("Enter second number");
                int b=scanner.nextInt();
                System.out.println("Enter third number");
                int c=scanner.nextInt();
                String res;
                String result;
                result=(a==b||b==c||c==a)? "Any two are equal":"Any two are not equal";
                res=(a==b&&b==c&&c==a)? "All three are equal":"All are not equal";

                System.out.println(res);
                System.out.println(result);
        }
}








import java.util.Scanner;

//Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//check if both the conditions 'a < 50' and 'a < b' are true.
 class Question15 {
        public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Enter the value of a:");
                int a= scanner.nextInt();
                System.out.println("Enter the value of b");
                int b= scanner.nextInt();
                String check;
                check=(a<50&&a<b)? "True":"False";
                System.out.println(check);
        }
}










import java.util.Scanner;

// If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//    write a program to calculate his total marks and percentage marks.
 class Question16 {
        public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                String name="Robert";
                System.out.println("This is marks of  "+name);
                System.out.println("Enter marks in Maths:");
                double math= scanner.nextDouble();
                System.out.println("Enter marks in Science:");
                double sci= scanner.nextDouble();
                System.out.println("Enter marks in Nepali:");
                double nep= scanner.nextDouble();

                double total=math+sci+nep;
                System.out.println("The total marks is:"+total);
                double percentage= (total/4);
                System.out.println("The total percentage is:"+percentage);

        }
}
