// package Generic;
// interface Add{
//     void add(int a,int b);
// }
// public class Lambda_expression {
//     public static void main(String[] args) {
//      Add obj = (a , b) -> System.out.println(a+b);
//      obj.add(2, 9);
//     }
// }
// so lambda function is that we can create a funtion without name and body.
package Generic;
interface Add{
     void add(int a,int b);
}
public class Lambda_expression {
    public static void main(String[] args) {
        Add obj =(int a, int b) -> System.out.println(a+b);
        obj.add(34, 5);
    }
}

