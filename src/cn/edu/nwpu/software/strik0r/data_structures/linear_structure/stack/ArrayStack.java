package cn.edu.nwpu.software.strik0r.data_structures.linear_structure.stack;
/**
 * {@code ArrayStack} 类是使用数组实现的栈 ADT.
 * @author Strik0r */
public class ArrayStack {
    private String[] items; // 存放栈中元素的数组
    private int top;        // 栈顶的下标
    private int capacity;   // 栈的大小
    /**
     * 构造函数, 申请一个大小为 {@code size} 的数组空间.
     * @param size 将要申请的数组空间的大小.*/
    public ArrayStack(int size) {
        this.items = new String[size]; // 申请一个大小为 capacity 的数组空间
        this.top = -1;
        this.capacity = size;
    }
    /**
     * 入栈操作, 将元素 {@code item} 压入栈中.
     * @param item 将要入栈的元素.
     * @return 如果入栈成功则返回 {@code true}, 否则 (栈已满时) 返回 {@code false}.*/
    public boolean push(String item) {
        if (top+1 == capacity) return false; // 栈已满, 入栈失败
        items[++top] = item; // 将新元素存储到栈中, 并令栈中元素的计数自增
        return true;
    }
    /**
     * 出栈操作, 返回栈顶元素.
     * @return 如果为空栈则返回 {@code null}, 否则返回栈顶元素.*/
    public String pop() {
        if (top == -1) return null; // 如果是空栈则返回 null
        String tmp = items[top];    // 将要返回的元素
        top--;                      // 栈中元素的个数 -1.
        return tmp;
    }
    /**
     * 在不移除栈顶元素的前提下返回栈顶元素.
     * @return 栈顶元素, 如果为空栈则返回 {@code null}.*/
    public String getTop() {
        if (top == -1) return null; // 如果是空栈则返回 null
        return items[top];
    }
}
