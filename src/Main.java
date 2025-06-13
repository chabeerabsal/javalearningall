//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//            int a=10;
//            char b='a';
//            float f=.6f;
//            System.out.println(f);

            Car c= new Audi();
            System.out.println(c);
            System.out.println(c.a);
            System.out.println(((Audi) c).cvar);
            c.carbreak();
            Generics<Integer,String> generics=new Generics<>(10,"absal");
            System.out.println(generics.getKey());
            System.out.println(generics.getValue());
        }
    }

abstract  class Car{
    abstract public void carbreak();
    int a=20;

    @Override
    public String toString() {
        return "This is a Car";
    }
}
class  Audi extends Car{
    public void carbreak(){
        System.out.println("Audi");
    }
    public void accelerator(){
        System.out.println("Acceleratoe");
    }
    int cvar=200;

//    @Override
//    public String toString() {
//        return "This is a Audi";
//    }
    //  System.out.println(cvar);
}