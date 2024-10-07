public class ArrayBoolean {
  public static void main(String[]args){
    
    boolean isLoggedIn= true;
    boolean hasPermission= false;


    for (int i = 0; i<3; i++){
        if (isLoggedIn && hasPermission){
            System.out.println("U hv permission");
            else{
                System.out.println("U dont hv permission"); 
            }
        }
    }


  }
    
}
