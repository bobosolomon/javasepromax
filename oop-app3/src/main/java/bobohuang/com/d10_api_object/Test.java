package bobohuang.com.d10_api_object;

public class Test {
    public static void main(String[] args) {
        // // 当 Student类未重写，默认调用的是 Object 类的 toString() 方法
        // // 返回值是 包名 + 类名 + @ + 哈希值
        // Student student = new Student("高圆圆", 23);
        // System.out.println(student.toString()); // bobohuang.com.d10_api_object.Student@4eec7777


        // 当 Student类重写 toString方法，默认调用的是 Student 类的 toString() 方法
        // Student student = new Student("高圆圆", 23);
        // System.out.println(student.toString()); // Student{name='高圆圆', age=23}
        //


        Student student1 = new Student("高圆圆", 23);
        Student student2 = new Student("高圆圆", 23);

        // 子类重写之后，比较对象的属性值
        System.out.println(student1.equals(student2)); // true
        // “==”比较对象的地址
        System.out.println(student1 == student2); // false
    }
}
