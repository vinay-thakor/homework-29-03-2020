package java1;

public class WithReturnWithParameter {
    public static void main(String[]args){
        //object creation
        WithReturnWithParameter  m2 = new WithReturnWithParameter();
    //addition method calling to main method And this method int value
    int result = m2.addition(10,20);
        System.out.println(result);
    int result1 = m2.subtract(50,30);//caling secound method
        System.out.println(result1);

    }
    //with return type with parameter method

    public int addition(int a, int b){
    int result = a+b;
    return result;
    }
    public int subtract(int c,int d){
        int result1 = c-d;
        return result1;

    }

//    public void multiplication(){
//        WithReturnWithParameter m3 = new WithReturnWithParameter();
//        int reusult3 =
//        System.out.println(reusult3);
//    }

}