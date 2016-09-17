public class Main {

    public static void main(String[] args) {
        //生成$DynamicProxy0.class
        // System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        DynamicQuiz dynamicQuiz = new DynamicProxyTest();
        DynamicQuiz quizeResult = new DynamicProxy().bind(dynamicQuiz);
        quizeResult.run();

    }
}
