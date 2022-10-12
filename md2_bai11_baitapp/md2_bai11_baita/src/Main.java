import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String str = "Rikkei Academy - Rikkei Academy la hoc vien dau tien ap dung mo hinh hoc dao nguoc";
        TreeMap<String,Integer> myMap = new TreeMap<>();
        String[]  arrStr = str.toUpperCase().split("");
        for (int i = 0; i < arrStr.length; i++) {
            if (myMap.containsKey(arrStr[i])){
                myMap.put(arrStr[i], myMap.get(arrStr[i])+1 );
            }else {
                myMap.put(arrStr[i], 1);
            }
        }
        for (String key: myMap.keySet()) {
            System.out.printf("%s - %d\n",key,myMap.get(key));

        }
    }
}