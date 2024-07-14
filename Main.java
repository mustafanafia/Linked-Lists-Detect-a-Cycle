/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/


boolean hasCycle(Node head) {
        HashSet<Node> hs = new HashSet<>();

        while(head != null){
        if(hs.contains(head)){
        return true;
        }
        else{
        hs.add(head);
        head = head.next;
        }
        }
        return false;
        }




                                //*** Floyd Warshall Algorithm solution ***


boolean hasCycle(Node head) {

        Node Rabbit = head;
        Node Turtle = head;


        while(Rabbit != null && Turtle != null && Rabbit.next != null){

        Rabbit = Rabbit.next.next;
        Turtle = Turtle.next;

        if(Rabbit == Turtle){
        return true;
        }
        }

        return false;

        }
