import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by wangtao on 9/17/16.
 */
class DynamicProxy implements InvocationHandler {
    DynamicQuiz dynamicQuiz;

    DynamicProxy() {
    }
    DynamicQuiz bind(DynamicQuiz dynamicQuiz) {
        this.dynamicQuiz = dynamicQuiz;
        return (DynamicQuiz) Proxy.newProxyInstance(dynamicQuiz.getClass().getClassLoader(), dynamicQuiz.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("welcome");
        Object result = method.invoke(dynamicQuiz, args);
        System.out.println("see you agin");
        return result;
    }
}
