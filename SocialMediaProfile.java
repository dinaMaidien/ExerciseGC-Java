public class SocialMediaProfile {

    String username;
    int age;
    String bio;

    public void createProfile(String username, int age, String bio){
     
        username = null ;
        age = 121;
        bio = "This is My Social Media";
    }

    public static void main(String[]args){
    SocialMediaProfile smf= new SocialMediaProfile();
    try{
        if (smf.username == null) { 
            // Throw an IllegalArgumentException if the name is null
            throw new IllegalArgumentException("Username cannot be null");
            
        }
         System.out.println("username: " + smf.username); 


         if(smf.age>=13 && smf.age<=120) { 
        // Throw an IllegalArgumentException if the age  
             throw new IllegalArgumentException("Age is invalid"); 
        }

        String bio;
        int length = smf.bio.length();
        if (length<160) { 
           
                 throw new IllegalArgumentException("bio is too long"); 
            }

   }  catch (ArithmeticException e) {
            System.out.println("Bio is more than 160: " + e.getMessage());

            }
    

        }


    
}
