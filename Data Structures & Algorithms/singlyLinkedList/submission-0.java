class LinkedList {

    private class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public int get(int index) {
        if(index <0 || index >= size) return -1;
        Node curr = head;
        for(int i=0; i<index; i++){
            curr = curr.next;
        }
        return curr.val;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }else{
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
        size++;
    }

    public boolean remove(int index) {
        if(index<0 || index >= size) return false;
        if(index ==0){
            head = head.next;
        }else{
            Node curr = head;
            for(int i=0; i<index-1; i++){
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();
        Node curr = head;

        while(curr != null){
            result.add(curr.val);
            curr = curr.next;
        }
        return result;

    }
}
