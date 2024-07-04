import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


//        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input
        System.out.println("*********************************************");

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter two numbers to do mathematics : ");
        System.out.print("Number 1 : ");
        int num1 = input1.nextInt();
        System.out.print("Number 2 : ");
        int num2 = input1.nextInt();
        System.out.println("addition : "+(num1 +num2) +"\n"+
                           "subtract : "+(num1 -num2) +"\n"+
                           "multiply : "+(num1 *num2) +"\n"+
                           "divide : "+(num1 /num2) +"\n"+
                           "remainder : "+(num1 %num2) +"\n");

//    2. Write a Java program that takes a number as input and prints its multiplication table up to 10.
        System.out.println("*********************************************");

        System.out.print("Enter a number to print the multiplication table up to 10 : ");
        Scanner input2 = new Scanner(System.in);
        int num_multi10= input2.nextInt();

        for (int i = 1; i <=10 ; i++) {
            System.out.println(num_multi10 +" * "+(i)+" = " +(num_multi10*i));
        }


//        3. Write a Java program to print the area and perimeter of a circle.
        System.out.println("*********************************************");

        System.out.print("Enter The radius to find the perimeter and the area : ");
        Scanner input3= new Scanner(System.in);
        double radius= input3.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is : " + perimeter);
        System.out.println("Area is : " + area);


//        4. Java program to find out the average of a set of integers
        System.out.println("*********************************************");

        Scanner input4 = new Scanner(System.in);
        double sum = 0;
        System.out.print("Enter the count of numbers:  ");
        double user_number = input4.nextDouble();
        for (int i = 1; i <= user_number; i++) {
            System.out.print("Enter number " + i + ": ");
            double numbers = input4.nextDouble();
            sum = sum + numbers;
        }
        double average = sum / user_number;
        System.out.println("The average is : " + average);

//    5. Write a Java program that accepts three integers as input, adds the first two integers
//    together, and then determines whether the sum is equal to the third integer.
        System.out.println("*********************************************");

        Scanner input5 = new Scanner(System.in);
        System.out.println("Enter two number to sum then enter the third number"+"\n"+
                "and see if the third number is the result or not.");
        System.out.print("Input the first number : ");
        int first_num = input5.nextInt();
        System.out.print("Input the second number : ");
        int second_num = input5.nextInt();
        System.out.print("Input the third number : ");
        int third_num = input5.nextInt();

        if (first_num+second_num==third_num){
            System.out.println("The result is: true");
        }else{
            System.out.println("The result is: false");
        }

//        6. Write a Java program to reverse a word.
        System.out.println("*********************************************");
        Scanner input6 = new Scanner(System.in) ;
        System.out.print("Enter a word to reverse it : ");
        String string_reverse = input6.nextLine();
        String new_string = "";
        for (int i = string_reverse.length(); i !=0 ; i--) {
            new_string = new_string+string_reverse.charAt(i-1);
        }

        System.out.println("Reverse word : "+new_string);

//        7 - Java program to check whether the given number is even or odd
//
        System.out.println("*********************************************");

        Scanner input7 = new Scanner(System.in) ;
        System.out.print("Enter a number to check if it odd or even : ");
        int odd_even = input7.nextInt();
        if (odd_even %2==0){
            System.out.println("The number is Even");
        }else{
            System.out.println("The number is Odd");
        }

//
//        8 - Java program to convert the temperature in Centigrade to Fahrenheit
        System.out.println("*********************************************");

        Scanner input8 = new Scanner(System.in) ;
        System.out.print("Enter temperature in Centigrade: ");
        double centigrade = input8.nextDouble();
        double fahrenheit =(1.8*centigrade) + 32;
        System.out.println("Temperature in Fahrenheit is: "+fahrenheit);

//        9.Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.

        System.out.println("*********************************************");

        System.out.print("Enter the string (start with 0): ");
        Scanner input9 = new Scanner(System.in) ;
        String string = input9.nextLine();
        System.out.print("Enter the number of the char : ");
        int char_index = input9.nextInt();
        if (char_index >= string.length()){
            System.out.println("number of char index you entered have exceed the number length ");
        }else {
            System.out.println("The character you want : " + string.charAt(char_index));
        }

//    10. Write a Java program to print the area and perimeter of a rectangle.
        System.out.println("*********************************************");

        Scanner input10= new Scanner(System.in);
        System.out.print("Enter the width : ");
         double width= input10.nextDouble();
        System.out.print("Enter the height : ");
         double height= input10.nextDouble();
        System.out.println("Area is "+width +" * "+ height +" = "+String.format("%.2f", (height*width)) );
        System.out.println("Perimeter is 2 * " +"(" +(width) +" + "+(height)+")" +" = " +String.format("%.2f",(2*(width+height))));

//        11. Write a Java program to compare two numbers.
        System.out.println("*********************************************");

        Scanner input11= new Scanner(System.in);
        System.out.println("Enter two numbers to compare");
        System.out.print("first integer : ");
        int num1_compare = input11.nextInt();
        System.out.print("second integer : ");
        int num2_compare = input11.nextInt();
        if(num1_compare!=num2_compare){
            System.out.println(num1_compare+"!="+num2_compare);
        }
        if(num1_compare==num2_compare){
            System.out.println(num1_compare+"=="+num2_compare);
        }
        if(num1_compare<=num2_compare){
            System.out.println(num1_compare+"<="+num2_compare);
        }
        if(num1_compare<num2_compare){
            System.out.println(num1_compare+"<"+num2_compare);
        }if(num1_compare>=num2_compare){
            System.out.println(num1_compare+">="+num2_compare);
        }if(num1_compare>num2_compare){
            System.out.println(num1_compare+">"+num2_compare);
        }

//        12. Write a Java program to convert seconds to hours, minutes and seconds.

        System.out.println("*********************************************");
        System.out.print("Enter number of seconds to convert it to hh:mm:ss : ");
        Scanner input12= new Scanner(System.in);
        int seconds = input12.nextInt();
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int seconds_left = seconds % 60;
        System.out.println("the result is " + hours+":"+minutes+":"+seconds_left);

//        13. Write a Java program that accepts four integers from the user and prints equal if all
//        four are equal, and not equal otherwise.

        System.out.println("*********************************************");
        Scanner input13= new Scanner(System.in);
        System.out.println("Enter four numbers to check if it all of them equal or not ");
        System.out.print("Number 1 :");
        int num1_equal = input13.nextInt();
        System.out.print("Number 2 :");
        int num2_equal = input13.nextInt();
        System.out.print("Number 3 :");
        int num3_equal = input13.nextInt();
        System.out.print("Number 4 :");
        int num4_equal = input13.nextInt();
        if(num1_equal == num2_equal && num1_equal == num2_equal && num1_equal == num2_equal &&
           num2_equal == num3_equal && num2_equal == num4_equal &&
           num3_equal == num4_equal ){
            System.out.println("Numbers are equal ");
        }else{
            System.out.println("Number are not equal");
        }

//        14. Write a Java program that reads an integer and check whether it is negative, zero, or
//        positive.
        System.out.println("*********************************************");
        Scanner input14= new Scanner(System.in);
        System.out.print("Enter a number to check if it is negative, zero, or positive : ");
        int num_check = input14.nextInt();
        if (num_check >0 ){
            System.out.println("Number is positive");
        } else if (num_check<0) {
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is 0");
        }


//        15.Write a program to enter the numbers till the user wants and at the end it should
//        display the count of positive, negative and zeros entered
//                (End loop use -1 , Don’t count -1).

        System.out.println("*********************************************");
        Scanner input15= new Scanner(System.in);

        int neg = 0 ;
        int pos = 0 ;
        int zero = 0 ;
        int num;
        do {
            System.out.println("Enter your numbers to count the positive, negative and zeros (type -1 to exit) : ");
            num = input15.nextInt();


            if(num >0){
                pos++;
            }else if (num<0){
                if (num==-1){

                }else{
                    neg++;
                }
            }else {
                zero++;
            }



        }while(num!=-1);

        System.out.println("Number of positve numbers entered : " + pos);
        System.out.println("Number of negative numbers entered : " + neg);
        System.out.println("Number of zeros numbers entered : " + zero);

//        16 - Write a program that prompts the user to input an integer and then outputs the
//        number with the digits reversed.
        System.out.println("*********************************************");
        Scanner input16 = new Scanner(System.in);
        System.out.print("Enter a integer number to reverse it : ");
        int reverse_number_input = input16.nextInt();
        String number_string = Integer.toString(reverse_number_input);
        String reverse_number = "";
        for (int i = number_string.length(); i != 0; i--) {
            reverse_number = reverse_number + number_string.charAt(i - 1);
        }
        int convert_number = Integer.valueOf(reverse_number);
        System.out.println("Your number reversed : " + convert_number);


//    17 - Write a program to enter the numbers till the user wants and at the end the program
//    should display the largest and smallest numbers entered.


        System.out.println("*********************************************");
        Scanner input17= new Scanner(System.in);
        int largest = 0 ;
        int smallest = 0 ;
        String text_large_small;
        do {
            System.out.println("Enter your number to find what is the smallest and the largest (Press n to exit)  : ");
            text_large_small = input17.nextLine();
          if (text_large_small.matches("-?\\d+")){
              int num_lar_smal = Integer.valueOf(text_large_small);

            if(num_lar_smal > largest){
                largest= num_lar_smal;
            }
            if (num_lar_smal<smallest){
                smallest = num_lar_smal;
            }
            }


        }while(!text_large_small.equalsIgnoreCase("n"));
        System.out.println("the large number : " + largest);
        System.out.println("the smallest number : " + smallest);



//     18 - Determine and print the number of times the character ‘a’ appears in the input
//          entered by the user.
        System.out.println("*********************************************");

         Scanner input18 = new Scanner(System.in);

        System.out.println("Enter a string to count how many the letter (a) appears : ");
        String count_a_string = input18.nextLine();
        int counter =0 ;

        for (int i =0 ; i < count_a_string.length(); i++) {
            if(count_a_string.charAt(i) == 'a'){
                counter++;
            }

        }
        System.out.println("Number of a's: "+ counter);



    }


}