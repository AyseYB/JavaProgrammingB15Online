package day34;

public class LoginActivity {

    public static void main(String[] args) {
        login1("user", "123");
        login1("user" , "abc123");
        
        boolean result = login2("user", "abc123");
        System.out.println("result = " + result);

        login2("user", "abc123");
        System.out.println( login2("user", "abc123"));
        
        

    }

    public static void login1(String user, String password){
        if(user.equals("user") && password.equals("abc123")){
            System.out.println("Log in succesfull");
        }else{
            System.out.println("login failed");
        }

    }

//1, login1 :  static void method
//	it has two String method paramters
//			called username and password
//	(it accept 2 String object as argument when being called)
//	it check whther username and password  "user" and "abc123"
//	if yes
//		print login successful
//	else
//		print login failed (OPTIONALLY FIND EXACTLY WHY FAILED)



//2, login2 :  static method boolean return type
//        it has two String method paramters
//        called username and password
//        (it accept 2 String object as argument when being called)
//        it check whther username and password  "user" and "abc123"
//        if yes
//        return true
//        else
//        return false
            public static boolean login2(String user, String password) {
//                if (user.equals( "user") && password.equals( "abc123")) {
//                    return true;
//                } else {
//                    return false;
//                }
                return user.equals("user")&& password.equals("abc123");  // short way

            }
            }
