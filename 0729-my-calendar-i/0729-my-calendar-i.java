class MyCalendar {
    TreeMap<Integer,Integer> hm;
    int limit;
    public MyCalendar() {
          hm = new TreeMap<>();
        limit = 1;
    }
    
    public boolean book(int start, int end) {
        
        hm.put(start,hm.getOrDefault(start,0) + 1);
        hm.put(end,hm.getOrDefault(end,0) - 1);
        
        int threshold = 0 ;
        for(int i : hm.keySet()){

          threshold = threshold + hm.get(i);

          if(threshold > limit){
                 
            hm.put(start,hm.getOrDefault(start,0) - 1);
            hm.put(end,hm.getOrDefault(end,0) + 1);
            
            return false;
          }
        }

        return true; 
    }
}
    
