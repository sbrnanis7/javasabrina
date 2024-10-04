// class course {
//     String courseName;
//     Course(){
//         Course c = new Course();
//         c.courseName = "Oracle";
//     }

// }

// class EJavaGuruPrivate{
//     public static void main (String[] args){
//         Course c = new Course();
//         c.courseName = "Java";
//         System.out.println(c.courseName);

//     }
// }

try {
    int[] arr = {1, 2, 3};
    System.out.println(arr[3]);  // This would throw an exception
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index is out of bounds!");
}
