package com.example.test;

import java.util.Stack;
import java.util.PriorityQueue;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
public class UserInfo {
public static void main(String... args) throws IOException{
    var fileName = "./test/src/main/java/com/example/test/data.txt";
    // it is a good habit to check if the file can be found using java code
    var filePath = Paths.get(fileName);
    if(!Files.exists(filePath)){
        System.out.println("The File "+ fileName + " Could not be found");
    }
    
    // *** Arrays/collections are data structure in memory storage 
    Stack<User> stack = new Stack<User>();
    PriorityQueue<String> q = new PriorityQueue<String>();
    var userInfos = new ArrayList<String>(); //** only store strings 
    var readStream = Files.newBufferedReader(filePath);
    var data = readStream.readLine(); // skip the line as this line is usually the header
  
    // ** new key word looping with Java key word while
 
     while(data !=null && data.length()>0 ) { // ** null in java signifies that the value is unknown 
    
// your code should go here
userInfos.add(data) ;
stack.push(data) ;
q.add(data) ;
data = readStream.readLine(); // read the data line 
} 
var userDetails= new ArrayList<User>();
        // print out each element of the data line
        System.out.println("------------NAMES PHONES ADDRESSES---------"); 
        for (var userData : userInfos) {
            var elements  = userData.split(",");   // split the data with comma as the separator
            var user = new User();
            user.Name = elements [0];
            user.Address = elements[1];
            user.Phone = elements[2];
            userDetails.add(user);

        }

        for (var userInfo : userDetails) {
            System.out.println(userInfo.Name + "," +userInfo.Phone+ "," + userInfo.Address);
        }
        System.out.println("------------STACK----------");
        while(!stack.empty()){
            System.out.println(stack.pop());
        }
        System.out.println("------------QUEUE----------");
        while(q.peek() != null){
            System.out.println(q.remove());
        }
    }

}
