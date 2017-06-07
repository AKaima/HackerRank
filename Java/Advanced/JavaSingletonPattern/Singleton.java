package HackerRank.Java.Advanced.JavaSingletonPattern;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * Created by kaima on 6/7/17.
 */
public class Singleton {
    public String str;
    private static Singleton instance = new Singleton();

    private Singleton(){}

    static Singleton getSingleInstance(){
        return instance;
    }
}
