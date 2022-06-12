class box{
    double width;
    double height;
    double depth;

 double volume(double w,double h,double d){
    width = w;
    height = h;
    depth = d;
    return width * height * depth;
 }
//  void setdim(double w,double h,double d){
//     width = w;
//     height = h;
//     depth = d;
//     }
}
class test{
    public static void main(String args[]){

    box mybox1 = new box();
    box mybox2 = new box();

    // mybox1.volume(10,20,15);
    // mybox2.volume(3,6,9);

    System.out.println(mybox1.volume(10,20,15));
    System.out.println(mybox2.volume(3,6,9));
    }
}

