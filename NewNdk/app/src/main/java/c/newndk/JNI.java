package c.newndk;

/**
 * Created by hasee on 2017/6/30.
 */

public class JNI {
    {
        System.loadLibrary("Hello");
    }
    /**
     * 调用c代码对应方法
     * @return
     */
    public  native String sayHello();
}
