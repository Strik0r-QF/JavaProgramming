package cn.edu.nwpu.software.strik0r.data_structures.linear_structure.stack;

public class ArrayStackTest {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        // 入栈测试
        System.out.println("Pushing elements onto the stack:");
        System.out.println("Pushing 'A': " + stack.push("A")); // true
        System.out.println("Pushing 'B': " + stack.push("B")); // true
        System.out.println("Pushing 'C': " + stack.push("C")); // true
        System.out.println("Pushing 'D': " + stack.push("D")); // true
        System.out.println("Pushing 'E': " + stack.push("E")); // true
        System.out.println("Pushing 'F': " + stack.push("F")); // false (stack full)

        // 出栈测试
        System.out.println("\nPopping elements from the stack:");
        System.out.println("Popped: " + stack.pop()); // E
        System.out.println("Popped: " + stack.pop()); // D
        System.out.println("Popped: " + stack.pop()); // C
        System.out.println("Popped: " + stack.pop()); // B
        System.out.println("Popped: " + stack.pop()); // A
        System.out.println("Popped: " + stack.pop()); // null (stack empty)
    }
}
