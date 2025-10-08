class LRUCache {
    class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}
    Node head = new Node(-1, -1);
    Node tail = new Node(-1, -1);
    int cap;
    HashMap<Integer, Node> hm = new HashMap<>();

    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    private void addNode(Node newnode){
        Node tm1 = tail.prev;

        newnode.next = tail;
        newnode.prev = tm1;

        tm1.next = newnode;
        tail.prev = newnode;
    }

    private Node deleteNode(Node delnode) {
        Node dm1 = delnode.prev;
        Node dp1 = delnode.next;

        dm1.next = dp1;
        dp1.prev = dm1;
    return delnode;
    }

    public int get(int key) {
        if(!hm.containsKey(key)){
            return -1;
        }

        Node node = hm.get(key);
        Node temp = deleteNode(node);
        addNode(temp);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            Node node = hm.get(key);
            node.val = value;
            deleteNode(node);
            addNode(node);
        }else{
            if(hm.size() == cap){
                Node node = head.next;
                hm.remove(node.key);
                deleteNode(node);
            }
            Node node = new Node(key, value);
            hm.put(key, node);
            addNode(node);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */