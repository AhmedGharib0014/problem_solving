

    class MyHashSet {
        int arrsySize = 1024;
              ArrayList<LinkedList<Integer>> listarray = new ArrayList<LinkedList<Integer>>();
              public MyHashSet() {
                  for(int i=0;i<arrsySize;i++){
                      listarray.add(new  LinkedList<Integer>());
                  }
              }
      
              public void add(int key) {
                   int hashCode = key % arrsySize;
                  if(contains(key)) return;
                  LinkedList<Integer> list = listarray.get(hashCode);
                  if(list.contains(key)) return;
                  else list.add(key);
      
              }
      
              public void remove(int key) {
                  if(contains(key)){
                      LinkedList<Integer> list = listarray.get(key % arrsySize);
                      if(list.contains(key)){
                          int index= list.indexOf(key);
                          list.remove(index);
                      }
      
                  }
              }
      
              public boolean contains(int key) {
                  int hashCode = key % arrsySize;
                  return listarray.get(hashCode).contains(key);
              }
      }
