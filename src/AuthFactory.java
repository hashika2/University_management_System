/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Click
 */
public class AuthFactory {
   public Authentication setAuth(String type){
       if(type.equalsIgnoreCase("login")){
          return new Login();
       }
       else if(type.equalsIgnoreCase("register")){
           return new Register();
       }
       else {
           return null;
       }
   }
}
