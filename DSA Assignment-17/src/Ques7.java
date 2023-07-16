import java.util.ArrayList;
import java.util.List;
public class Ques7 {
	List<Integer> beforeMiddle;
    List<Integer> afterMiddle;

    public void FrontMiddleBackQueue() {
        beforeMiddle = new ArrayList<>();
        afterMiddle = new ArrayList<>();
    }

    public void pushFront(int val) {
        beforeMiddle.add(0, val);
        balanceLists();
    }

    public void pushMiddle(int val) {
        beforeMiddle.add(beforeMiddle.size() / 2, val);
        balanceLists();
    }

    public void pushBack(int val) {
        afterMiddle.add(val);
        balanceLists();
    }

    public int popFront() {
        if (isEmpty()) {
            return -1;
        }
        int val = beforeMiddle.remove(0);
        balanceLists();
        return val;
    }

    public int popMiddle() {
        if (isEmpty()) {
            return -1;
        }
        int val = beforeMiddle.remove((beforeMiddle.size() - 1) / 2);
        balanceLists();
        return val;
    }

    public int popBack() {
        if (isEmpty()) {
            return -1;
        }
        int val;
        if (!afterMiddle.isEmpty()) {
            val = afterMiddle.remove(afterMiddle.size() - 1);
        } else {
            val = beforeMiddle.remove(beforeMiddle.size() - 1);
        }
        balanceLists();
        return val;
    }

    private boolean isEmpty() {
        return beforeMiddle.isEmpty() && afterMiddle.isEmpty();
    }

    private void balanceLists() {
        while (beforeMiddle.size() > afterMiddle.size()) {
            afterMiddle.add(0, beforeMiddle.remove(beforeMiddle.size() - 1));
        }
        while (beforeMiddle.size() < afterMiddle.size() - 1) {
            beforeMiddle.add(afterMiddle.remove(0));
        }
    }
	public static void main(String[] args) {
		Ques7 queue = new Ques7();
        queue.pushFront(1);
        queue.pushBack(2);
        queue.pushMiddle(3);
        queue.pushMiddle(4);
        System.out.println(queue.popFront()); // Output: 1
        System.out.println(queue.popMiddle()); // Output: 3
        System.out.println(queue.popMiddle()); // Output: 4
        System.out.println(queue.popBack());   // Output: 2
	}

}
