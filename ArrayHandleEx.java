public class ArrayHandleEx {

    public static void main(String[]args){
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number:numbers){
            System.out.println(number);
        }

    try{
        System.out.println(numbers[6]);  // salahkan dia dengan bagi lenght lain
    }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("caugt bad" + e.getMessage());
    }

    }
}


                                        