import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int num = 23;
        int numSave = num;
        Stack<Integer> myStack = new Stack<>();
        while (num /2 !=0){
            int soDu = num % 2;
            myStack.push(soDu);
            num = num / 2;
        }
        myStack.push(num);
        System.out.printf("So thap phan %d chuyen thanh he nhi phan: ",numSave);
        while (!myStack.isEmpty()){
            System.out.printf("%d\t",myStack.pop());
        }
    }
}