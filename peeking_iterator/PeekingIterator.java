class PeekingIterator implements Iterator<Integer> {
    LinkedList<Integer> list =null;
       public PeekingIterator(Iterator<Integer> iterator) {
           list= new LinkedList<Integer>();
           while (iterator.hasNext()){
               list.add(iterator.next());
           }
           // initialize any member here.
       }

       // Returns the next element in the iteration without advancing the iterator.
       public Integer peek() {
          return list.peek();

       }

       // hasNext() and next() should behave the same as in the Iterator interface.
       // Override them if needed.
       @Override
       public Integer next() {
           
return list.remove();
       }

       @Override
       public boolean hasNext() {
           return list.size() > 0;

       }
}