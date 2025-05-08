import java.math.BigInteger;
import java.util.ArrayList;

class MinStack {
    private ArrayList<Integer> values;

    public MinStack() {


    }

    public void push(int val) {
        if(values == null){
            values = new ArrayList<Integer>();
        }
        values.add(val);

    }

    public void pop() {
        values.remove(values.size()-1);

    }

    public int top() {
        return values.get(values.size()-1);
    }

    public int getMin() {
//        BigInteger min=1000000000;
//
//        for(int i=0; i<values.size()-1; i++){
//            if(values.get(i)<min){
//                min=values.get(i);
//            }
//        }
//        return min;
//    }
        int num = 0;
        return num;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */