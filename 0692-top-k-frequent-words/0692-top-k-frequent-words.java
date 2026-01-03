class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String,Integer> hm = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(int i = 0 ; i < words.length ; i++){

            if(hm.containsKey(words[i])){
                hm.put(words[i],hm.get(words[i]) + 1);
            }

            else{
                hm.put(words[i],1);
            }
        }
        
    PriorityQueue<Pair> pq = new PriorityQueue<>(
    (a, b) -> {
       
        if (a.val != b.val) {
            return Integer.compare(b.val, a.val);
        }

        return a.key.compareTo(b.key);
    }
);


        for(String i : hm.keySet()){

            pq.add(new Pair(i,hm.get(i)));
        }
   
        while(k != 0){
          Pair p = pq.poll();
          list.add(p.key);
          k--;
        }
        return list;
    }
}

class Pair{

    String key;
    int val;
    Pair(String key,int val){
        this.key = key;
        this.val = val;
    }
}