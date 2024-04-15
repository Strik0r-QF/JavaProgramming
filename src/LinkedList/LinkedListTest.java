package LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        // 创建链表
        LinkedList linkedList = new LinkedList();

        // 在链表末尾添加节点
        linkedList.append(114514);
        linkedList.append(1919810);
        linkedList.append(1);
        linkedList.append(5);

        // 在链表头部插入节点
        linkedList.prepend(0);

        // 打印链表元素
        linkedList.printList();
    }
}


