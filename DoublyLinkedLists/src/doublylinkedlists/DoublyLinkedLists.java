package doublylinkedlists;

 class DoublyLinkedLists<E> {
    Node<E> head = null;
    Node<E> tail = null;
    private int size = 0;
    
    DoublyLinkedLists(){
        
    }
    
    public void addFront(E item){
        Node<E> nnode = new Node(item);
        if (isEmpty()){
            head = nnode;
            tail = nnode;
        }else{
            nnode.next = head;
            head.prev = nnode;
            head = nnode;
        }
        size++;
    }
    
    public void addEnd(E item){
        Node<E> nnode = new Node(item);
        if (isEmpty()){
            head = nnode;
            tail = nnode;
        }else{
            tail.next = nnode;
            nnode.prev = tail;
            tail = nnode;
        }
        size++;
    }
    
    public void add(int index, E item){
        if (index == 0){
            addFront(item);
        }else if (index == size){
            addEnd(item);
        }else if (index<size){
            Node<E> nnode = new Node(item);
            
            Node<E> currentNode = null;
            
            for (int i = 0; i<=index; i++){
                if (i == 0){
                    currentNode = head;
                }else{
                    currentNode = currentNode.next;
                }
            }
            
            nnode.next = currentNode;
            nnode.prev = currentNode.prev;
            nnode.prev.next = nnode;
            currentNode.prev = nnode;
            
            size++;
        }
    }
    
    public E removeFront(){
        E returnData = null;
        if (size == 1){
            returnData = head.data;
            head = null;
            tail = null;
            size--;
            return returnData;
        }
        if (!isEmpty()){
            returnData = head.data;
            head.prev = null;
            head = head.next;
            size--;
        }
        return returnData;
    }
    
    public E removeEnd(){
        E returnData = null;
        if (size == 1){
            returnData = head.data;
            head = null;
            tail = null;
            size--;
            return returnData;
        }
        if (!isEmpty()){
            returnData = tail.data;
            tail = tail.prev;
            tail.next = null;
            size--;
        }
        
        return returnData;
    }
    
    public E remove(int index){
        E returnData = null;
        if (size == 1){
            returnData = head.data;
            head = null;
            tail = null;
            size--;
            return returnData;
        }
        if (index == 0){
            returnData = removeFront();
        }else if (index == size-1){
            returnData = removeEnd();
        }else if (!isEmpty() && index > 0 && index < size-1){
            Node<E> currentNode = null;
            
            for (int i = 0; i<=index; i++){
                if (i == 0){
                    currentNode = head;
                }else{
                    currentNode = currentNode.next;
                }
            }
            
            currentNode.prev.next = currentNode.next;
            currentNode.next.prev = currentNode.prev;
            returnData = currentNode.data;
            size--;
        }
        
        return returnData;
    }
    
    public E get(int index){
        E returnData = null;
        Node<E> currentNode = null;
        
        if (index >= size){
            return returnData;
        }
            
        for (int i = 0; i<=index; i++){
            if (i == 0){
                currentNode = head;
            }else{
                currentNode = currentNode.next;
            }
        }
        
        returnData = currentNode.data;
        
        return returnData;
    }
    
    public boolean isEmpty(){
        return (size==0);
    }
    
    class Node<E>{
        E data;
        Node<E> next, prev;
        
        Node(E d){
            data = d;
            next = prev = null;
        }
    }
    
    @Override
    public String toString(){
        if (isEmpty()){
            return "Doubly Linked List is empty";
        }
        String returnData = "";
        Node currentNode = head;
        int count = 0;
        if (head!=null){
            count++;
            returnData = returnData+ "Node "+count+": " + head.data;
        }
        while(currentNode.next != null){
            count++;
            currentNode = currentNode.next;
            returnData = returnData+ "\nNode "+count+": " + currentNode.data;
        }
        return returnData;
    }
    
    public static void main(String[] args) {
        java.io.PrintStream o = System.out;
        DoublyLinkedLists <String> list = new DoublyLinkedLists <>();
        list.addEnd("D");
        list.addFront("B");
        list.addEnd("E");
        list.add(1, "C");
        list.addFront("A");
        for(int i = 0; i < 5; i ++) o.print(" "+list.get(i));o.println();
        list.removeFront();
        list.removeEnd();
        list.remove(1);
        for(int i = 0; i < 2; i ++) o.print(" "+list.get(i));o.println();
        list.remove(0);
        list.remove(0);
        o.println(list.isEmpty());
        list.add(0, "B");
        list.addFront("A");
        list.add(2,"C");
        for(int i = 0; i < 3; i ++) o.print(" "+list.get(i));o.println();
        list.remove(3); //Note: the "3" is out of bounds
    }
}