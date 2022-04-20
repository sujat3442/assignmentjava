public class HelloWorld {
    static int a=10; //static or class variable
    int b =12; //instance variable

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(a);
        System.out.println(helloWorld.b);
        System.out.println("Hello world!!!!");
        helloWorld.printName();


    }
    void printName(){
        String name="suju bhai";
        System.out.println(name);


    }

}