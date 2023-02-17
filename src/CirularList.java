public class CirularList {

    private Node head;
    private Node turn;

    public void addNode(Node node) {
        if (head == null) {
            head = node;
            turn = node;
            head.setNext(head);
            head.setPrevious(head);
        } else {
            Node tail = head.getPrevious();
            node.setNext(head);
            head.setPrevious(node);
            tail.setNext(node);
            node.setPrevious(tail);
        }
    }

    public void printTurn() {
        if (head == null) {
            System.out.println("Lista vacia");
        } else {
            System.out.println(turn.getName());
        }
    }

    public void delete(int goal) {
        if (head == null) {
            System.out.println("Lista vacia");
        } else {
            delete(head, goal);
        }
    }

    private void delete(Node current, int goal) {
        if (head.getNext().equals(head)) {
            head.setNext(null);
            head.setPrevious(null);
            head = null;
            turn = null;
            return;
        }
        if (head.getName() == (goal)) {
            turn = head.getNext();
            head.getNext().setPrevious(head.getPrevious());
            head.getPrevious().setNext(head.getNext());
            head = head.getNext();
            return;
        }
        if (current.getName() == (goal)) {
            current.getPrevious().setNext(current.getNext());
            current.getNext().setPrevious(current.getPrevious());
            turn = current.getNext();
            return;
        }
        delete(current.getNext(), goal);
    }

    public void passTurn() {
        if (head == null) {
            System.out.println("Lista vacia");
        } else if (turn.getPass() >= 3) {
            turn = turn.getNext();
            delete(turn.getPrevious().getName());
        } else {
            turn.setPass(turn.getPass() + 1);
            turn = turn.getNext();
        }
    }

    public void continueTurn() {
        if (head == null) {
            System.out.println("Lista vacia");
        } else {
            turn = turn.getNext();
            delete(turn.getPrevious().getName());
        }
    }
}