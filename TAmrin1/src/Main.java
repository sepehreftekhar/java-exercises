import java.util.*;


public class Main {
    public static void main(String[] args) {

        //CheckPrime(args);
        //CheckIsInteger(args);
        //CheckCharIsIneteger(args);
        TestFindGCD2(args);


    }
    public static boolean isCharInetegr(char character){
        char[] digits = {'0','1','2','3','4','5','6','7','8','9'};
        for(int i = 0; i<digits.length;i++){
            if(character == digits[i]){
                return true;
        }
        }
        return false;
    }

    public static boolean isInteger(String str){
        //24a2bc  / length = 6,
        //i = 0, for condition = true, charAt(i) = 2, if = false, next for loop
        //i = 1, for condition = true, charAt(i) = 4, if = false, next for loop
        //i = 2, for condition = true, charAt(i) = a, if = true,  return false
        //
        for(int i = 0 ; i < str.length() ; i++ ){
            if(!isCharInetegr(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int number) {
        for (int i= 2; i <= number; i++){
            if(number % i ==0){
                return false;
            }
        }
        return true;
    }

    public static void CheckCharIsIneteger(String[] args){
        char c1 = 'a';
        char c2 = '0';
        char c3 = 'A';
        char c4 = '3';
        if(isCharInetegr(c1)){
            System.out.println("Test not passed "+ c1);
        }else{
            System.out.println("*Test passed "+ c1);
        }
        if(!isCharInetegr(c2)){
            System.out.println("Test not passed "+ c2);
        }else{
            System.out.println("*Test passed "+ c2);
        }
        if(isCharInetegr(c3)){
            System.out.println("Test not passed "+ c3);
        }else{
            System.out.println("*Test passed "+ c3);
        }
        if(!isCharInetegr(c4)){
            System.out.println("Test not passed "+ c4);
        }else{
            System.out.println("*Test passed "+ c4);
        }
    }
    public static void CheckIsInteger(String[] args){
        //true:  "123"
        //true:  "0123"
        //false: "abc"
        //false: "a1b2c"
        //false: "1abc"
        //false: "abc1"
        //false: "1abc2"
        String s1 = "123";
        String s2 = "0123";
        String s3 = "abc";
        String s4= "a1b2c";
        String s5 = "1abc";
        String s6 = "abc1";
        String s7 = "1abc2";
        if(isInteger(s1)){
            System.out.println("*Test passed "+ s1);
        }else{
            System.out.println("!Test not passed "+ s1);
        }
        if(isInteger(s2)){
            System.out.println("*Test passed "+ s2);
        }else{
            System.out.println("!Test not passed "+ s2);
        }
        if(!isInteger(s3)){
            System.out.println("*Test passed "+ s3);
        }else{
            System.out.println("!Test not passed "+ s3);
        }
        if(!isInteger(s4)){
            System.out.println("*Test passed "+ s4);
        }else{
            System.out.println("!Test not passed "+ s4);
        }
        if(!isInteger(s5)){
            System.out.println("*Test passed "+ s5);
        }else{
            System.out.println("!Test not passed "+ s5);
        }
        if(!isInteger(s6)){
            System.out.println("*Test passed "+ s6);
        }else{
            System.out.println("!Test not passed "+ s6);
        }
        if(!isInteger(s7)){
            System.out.println("*Test passed "+ s7);
        }else{
            System.out.println("!Test not passed "+ s7);
        }

    }
    public static void CheckPrime(String[] args){

        String inputStr = "";
        int number = -1;
        boolean isExit = false;


        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number('exit' for exit): ");
            inputStr = scanner.nextLine();
            isExit = getValidInputNumberAndCheckExit(inputStr);
            if(isExit){
                break;
            }
            checkIfNumberIsPrime(inputStr);

        }while(true);
    }

    public static boolean checkIfNumberIsPrime(String inputStr){
        int number = Integer.parseInt(inputStr);
        if (number <= 1) {
            System.out.println("It's not a prime number");
        } else {
            if (!isPrime(number)) {
                System.out.println("It's  a prime number");
                return true;
            } else {
                System.out.println("It's not a prime number");
            }
        }return false;
    }

    public static boolean getValidInputNumberAndCheckExit(String inputStr) {
        do {
            if (inputStr.equals("exit")) {
                return true;
            }
            if (isInteger(inputStr)) {
                return false;
            }
                System.out.println("invalid input");

        } while (true);
    }

    public static void oldCheckPrime(){
        Scanner scanner = new Scanner(System.in);
        String inputStr;
        int number = -1;
        do {
            System.out.println("Starting 1st loop");
            do {
                System.out.println("Starting 2nd loop");
                System.out.println("Enter your number: ");
                inputStr = scanner.next();
                if (inputStr.equals("exit")) {
                    break;
                }
                if (isInteger(inputStr)) {
                    number = Integer.parseInt(inputStr);
                    break;
                } else {
                    System.out.println("invalid input");
                }
            } while (true);
            System.out.println("after 2nd loop");
            if(inputStr.equals("exit")){
                System.out.println("exiting");
                break;
            }else if (number <= 1) {
                System.out.println("It's not a prime number");
            } else {
                if (isPrime(number)) {
                    System.out.println("It's  a prime number");
                } else {
                    System.out.println("It's not a prime number");
                }
            }
        } while(true);
    }
    public static void TestFindGCD(String[] args){
        if(FindGCD(10,5)==5){
            System.out.println("*Test passed(10, 5) == 5");
        }else{
            System.out.println("!Test not passed(10, 5) != 5");
        }
        if(FindGCD(14,9)==1){
            System.out.println("*Test passed(14, 9) == 1");
        }else{
            System.out.println("!Test not passed(14, 9) != 1");
        }
        if(FindGCD(54,24)==6){
            System.out.println("*Test passed(54, 24) == 6");
        }else{
            System.out.println("!Test not passed(54, 24) != 6");
        }
        if(FindGCD(24,54)==6){
            System.out.println("*Test passed(24, 54) == 6");
        }else{
            System.out.println("!Test not passed(24, 54) != 6");
        }
    }
    public static void TestFindGCD2(String[] args){
        if(FindGCD2(10,5)==5){
            System.out.println("*Test passed(10, 5) == 5");
        }else{
            System.out.println("!Test not passed(10, 5) != 5");
        }
        if(FindGCD2(14,9)==1){
            System.out.println("*Test passed(14, 9) == 1");
        }else{
            System.out.println("!Test not passed(14, 9) != 1");
        }
        if(FindGCD2(54,24)==6){
            System.out.println("*Test passed(54, 24) == 6");
        }else{
            System.out.println("!Test not passed(54, 24) != 6");
        }
        if(FindGCD2(24,54)==6){
            System.out.println("*Test passed(24, 54) == 6");
        }else{
            System.out.println("!Test not passed(24, 54) != 6");
        }
    }

    public static int FindGCD(int number1,int number2){
        //n1 = 10, n2 = 5, i = 10, for i condition = true, if condition = true, return 10
        //10 = 2 = 5

        for(int i = number1; i > 0; i--){
            if(number1 % i == 0 && number2 % i == 0){
                return i;

                }
            }
        return -1;
    }

    public static int FindGCD2(int number1,int number2){
        //n1 = 54, n2 =24, if = false, find(24, 6)
        //n1 = 24, n2 =6 , if = false, find(6, 0)
        //n1 = 6 , n2 =0 . if = true , return 6
        if(number2 == 0){
            return number1;
        }
        return FindGCD2(number2, number1%number2);


    }
}



//p1: if(c1){do1} if(c2){do2}
//p2: if(c1){do1} else if(c2){do2}
//c1: true, c2: true   |  p1: do1 / do2  |  p2: do1
//c1: true, c2: false  |  p1: do1 / do2  |  p2: do1
//c1: false, c2: false |  p1: do1 / do2  |  p2: do1
//c1: false, c2: true  |  p1: do1 / do2  |  p2: do1





