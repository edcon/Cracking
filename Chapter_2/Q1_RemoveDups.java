public class Q1_RemoveDups{
public static void main(String[] args){

        Node head = new Node(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(6);
        head.appendToTail(3);
        head.appendToTail(8);
        head.appendToTail(1);
        head.appendToTail(0);
        head.appendToTail(2);
        head.appendToTail(7);
        head.appendToTail(3);


        System.out.println("---- Before: -----");
        head.printList();

        int currentInt;
        Node n = head;
        
        while(n != null){
            Node runner = n;
            while(runner.next!= null){
                if(runner.next.data == n.data){
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
        n = n.next;
        }

        System.out.printf("\n---- After: -----\n");
        head.printList();

    }
    

}

class Node{
        int data;
        Node next = null;

        public Node(int d, Node next){
            data = d;
            this.next = next;
        }
        public Node(int d){
            this(d, null);
        }

        Node deleteNode(Node head, int d){
            Node n = head;

            if(n.data == d){
                return head.next;
            }

            while(n.next != null){
                if(n.next.data == d){
                    n.next = n.next.next;
                    return head;
                }
                n = n.next;
            }
            return head;
        }

        void appendToTail(int d){
            Node end = new Node(d);
            Node n = this;
            while(n.next!=null){
                n = n.next;
            }
            n.next = end;
        }

        void printList(){
            Node n = this;
            while(n != null){
                System.out.printf(n.data + "  ");
                n = n.next;
            }
        }
    }   