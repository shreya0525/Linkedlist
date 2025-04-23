public class LinkedListDemo {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;

        // Add a node at the end
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // Print the list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

   
        public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add(10);
    list.add(20);
    list.add(30);
    
    // 👇 New elements added by collaborator
    list.add(40);
    list.add(50);

    System.out.print("Current list: ");
    list.printList();
}


        System.out.print("Current list: ");
        list.printList();
    }
}
