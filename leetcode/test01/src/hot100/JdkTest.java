package hot100;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class JdkTest {

    public static void main(String[] args) {
        //容器
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        Map<Integer,Integer> hashMap = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();
        Map<Integer,Integer> hashTable = new Hashtable<>();
        Map<Integer,Integer> curHashMap = new ConcurrentHashMap<>();

        //String
        String s_string= new String("123");
        StringBuffer s_stringbuffer;
        StringBuilder s_stringbuilder;

    }

}

