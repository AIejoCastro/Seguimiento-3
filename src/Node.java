public class Node {

    private int name;
    private int pass;
    private Node next;
    private Node previous;

    public Node(int name) {
        this.name = name;
    }

    public int getName() {
        return name;
    }

    public void getName(int number) {
        this.name = number;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
