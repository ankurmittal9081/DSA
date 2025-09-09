import java.util.*;
class Pair {
    String word;
    int count;

    Pair(String word, int count) {
        this.word = word;
        this.count = count;
    }
}
class TopKfrequentword {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String ele:words){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.count==b.count) {
                return b.word.compareTo(a.word);
            }
            return a.count - b.count; 
        });
        for(Map.Entry<String,Integer> entry :map.entrySet()){
            String ele=entry.getKey();
            int freq=entry.getValue();
            pq.add(new Pair(ele,freq));

            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String> list=new ArrayList<>();
        int i=0;
        while(pq.size()>0){
            list.add(pq.poll().word);
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
       
    }
}