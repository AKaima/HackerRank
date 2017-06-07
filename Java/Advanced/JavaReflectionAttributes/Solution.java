package HackerRank.Java.Advanced.JavaReflectionAttributes;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by kaima on 6/6/17.
 */

//Just put this in here to get rid of the errors. The actual class is automatically appended on submission.
class Student {

}

public class Solution {
    public static void main(String[] args){
        Class student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}
