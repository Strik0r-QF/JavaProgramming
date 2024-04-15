package LinkedList;

/**
 * 自定义的链表类
 *
 * head: 首节点
 * */
public class LinkedList {
    Node head; // 首节点

    public LinkedList() {
        this.head = null;
    }

    /**
     * 在链表末尾附加节点的方法
     * @param data 放入新节点中的数据
     * */
    public void append(int data) {
        Node newNode = new Node(data);

        // 如果首节点没有值, 则将新元素直接给到首节点
        if (head == null) {
            head = newNode;
            return;
        }

        // 定义尾节点, 并遍历链表使得 last.next 指向 null
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }

    /**
     * 在链表头部插入一个新节点
     * @param data 放入新节点的数据
     * */
    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    /**
     * 打印链表元素
     * */
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
