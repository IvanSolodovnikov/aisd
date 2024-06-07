import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileInputName = "H:\\Java прога\\for4task.txt";
        File fileInput = new File(fileInputName);
        Scanner sc = new Scanner(fileInput);


        HashMap<String, Integer> sortedList = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();


        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            String[] elems = str.split("[!?.,;:\\s]+");
            for (String elem : elems) {
                for (int i = 0; i < elem.length() - 1; i++) {
                    String part = "" + elem.charAt(i) + elem.charAt(i + 1);
                    list.add(part);
                    if (sortedList.containsKey(part)){
                        sortedList.put(part, sortedList.get(part)+1);
                    }else {
                        sortedList.put(part, 1);
                    }
                }
            }
        }

        System.out.println(sortedList);
        list.clear();
        int size = sortedList.size();
        for (int i = 0; i < size; i++) {
            String key = "";
            int value = -1;
            for (Map.Entry<String, Integer> entry : sortedList.entrySet()){
                if (entry.getValue() > value) {
                    key = entry.getKey();
                    value = entry.getValue();
                }
            }
            list.add(key);
            sortedList.remove(key);
        }
        System.out.println(list);
    }
}