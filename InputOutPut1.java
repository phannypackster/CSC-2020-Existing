package test.java.WalkSeries2;

import static java.lang.System.out;
public class InputOutPut1 {

    public static void main(String... args) {
        var startValue =1;
        var endValue = 100;
        var incrementValue  = 5;

        // it is always a good idea to inform what is happening
        out.println("Start of process");
        // reformatted the code so that it in in the general standard form
        for( startValue = 0; startValue<= endValue ; startValue = startValue + incrementValue){ 
                PrintData("The current Value", startValue);



        }
    }

    public static void PrintData(String message, Integer value){
        var header = "-";
        var output= message+"="+ Integer.toString(value);
        System.out.println( header.repeat (output.length()) );
       System.out.println(output);

    }
}