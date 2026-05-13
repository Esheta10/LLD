// // Circular Dependency is when class A needs class B and class B needs claas a, they both need each
// // other to be created first which creates a deadlock

// class A{
    
//     B b;
//     A(B b1){    // A ka constructor keh raha hai, mujhe B chahiye
//         b = b1;
//     }
//     void hello(){
//         System.out.println("Hello from A!");
//         b.hello();
//     }
// }

// class B{
//     A a;
//     B(A a1){    // B ka constructor keh raha hai, mujhe B chahiye
//         a = a1;
//     }
//     void hello(){
//         System.out.println("Hello from B!");
//     }
// }
// public class ConstructorCircularDI {
    
//     public static void main(String[] args) {
        
//         A ob1 = new A();
//         B ob2  = new B();
//         ob1.hello();
//         ob2.hello();
//     }
// }
