import java.util.*;
import java.io.*;
public class Main {

    static boolean isPolindrom(int count){

        int temp=count;
        int reverseCount=0;

        while (temp>0){
            reverseCount= reverseCount*10 + temp%10;
            temp=temp/10;

        }

        if (reverseCount==count){
            return true;
        }
        else {
            return false;
        }

    }
    public static void main(String[] args) {

        System.out.println(isPolindrom(6996));
    }
}