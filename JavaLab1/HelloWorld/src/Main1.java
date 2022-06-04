import com.greatlearning.corejava.A;
import com.greatlearning.corejava.B;
import com.greatlearning.corejava.Hello;

class A{

   

    public void printName(){

        System.out.println("hello john");

    }

}

 

 class Main1 extends A{

   

    public void printname(){

        System.out.println("Hello Sam");

    }



    public static void main(String[] args)
    {

        Main1 obj = new Main1();

        obj.printName();

    }


}