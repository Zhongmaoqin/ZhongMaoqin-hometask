import java.util.*;

public class program {
    public static void  main(String[] args){
        // 1.
        System.out.println("1. EnumMap class");
        EnumMap<AnimalType, String> em = new EnumMap<AnimalType, String>(AnimalType.class);
        em.put(AnimalType.Bird, "Seagull, Ostrich, Eagle");
        em.put(AnimalType.Fish, "Dolphin, Shark");
        System.out.println(em.entrySet());
        // 2.
        System.out.println("2. HashMap class");
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<10;i++){
            hm.put(i, 10 -i);
        }
        for (Integer key:
             hm.keySet()) {
            System.out.println(key + ":" + hm.get(key));
        }
        // 3.
        System.out.println("3. TreeMap class");
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(int i=0;i<10;i++){
            tm.put(i, 10 -i);
        }
        for (Integer key:
                tm.keySet()) {
            System.out.println(key + ":" + tm.get(key));
        }
        // 4.
        System.out.println("4. TreeSet class");
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=0;i<10;i++){
            ts.add(i);
        }
        System.out.println(ts.descendingSet());
        // 5.
        System.out.println("5. PriorityQueue class");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<10;i++){
            pq.add(i);
        }
        for(int i=0;i<10;i++){
            System.out.println(pq.poll());
        }
        // 6.
        System.out.println("6. ArrayDeque class");
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        for(int i=0;i<10;i++){
            if(i % 2 == 0)
                ad.addFirst(i);
            else
                ad.addLast(i);
        }
        System.out.println(ad);
        // 7.
        System.out.println("7. HashSet class");
        HashSet<Integer> hc = new HashSet<>();
        for(int i=0;i<10;i++){
            hc.add(i);
        }
        Iterator<Integer> itr = hc.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
        // 8.
        System.out.println("8. LinkedHashSet class");
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        for(int i=0;i<10;i++){
            lhs.add(i);
        }
        Iterator<Integer> lhsIterator = lhs.iterator();
        while (lhsIterator.hasNext()){
            System.out.println(lhsIterator.next());
        }
        // 9.
        System.out.println("9. ArrayList class");
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<10;i++){
            al.add(i);
        }
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i) + " ");
        }

        // 10.
        System.out.println("10. Vector class");
        Vector<Integer> vector = new Vector<>();
        for(int i=0;i<10;i++){
            vector.add(i);
        }
        for(int i=0;i<vector.size();i++){
            System.out.println(vector.get(i) + " ");
        }

    }

    public enum AnimalType{
        Fish,
        Bird
    }
}
