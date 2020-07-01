/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Click
 */
public class AuthFactoryPattern {
     public static void main(String args[]) {
       
      AuthFactory auth = new AuthFactory();
      
      Authentication a = auth.setAuth("login");
      a.authlogin();
        //new Login();
    }
}
