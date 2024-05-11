class volume{


    void area(int a){
        System.out.println("area is"+ a*a);
    }
    void area(int a , int b){
        System.out.println("area is"+ (a + b));
    }

}

public class A_01_basics {
    public static void main(String[] args){

        volume vol = new volume();

        vol.area(3);
        vol.area(4, 6);
    }
}

/*In Java, the program (source code) written by the programmer gets compiled and converted into byte code (compiled code) by the Java compiler.

All the byte codes required for the program are then given to the interpreter. The interpreter reads the byte code line by line, converts it to binary form, also called as machine language or binary language, and then executes it.

This process requires some support and an environment for the execution to happen. JDK (Java Development Kit) helps in this for execution of a Java program. It provides library support and Java Runtime Environment (JRE), the environment for developing and executing Java based applications and programs. */
