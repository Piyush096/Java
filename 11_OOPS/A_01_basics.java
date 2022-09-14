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
