

class Solution{
    class MyHashMap {
        int arraySize = 1000;
        ArrayList<LinkedList<MyMapEntry>> arr = new ArrayList<LinkedList<MyMapEntry>>();
        public MyHashMap() {
             for(int i=0;i<arraySize;i++){
                arr.add(new  LinkedList<MyMapEntry>());
            }

        }

        public void put(int key, int value) {
            int hashedKey = key % arraySize;
            MyMapEntry myMapEntry= getMapEntry(key);
            if(myMapEntry != null){
                myMapEntry.value=value;
            }else{
                MyMapEntry newEntry= new MyMapEntry(key,value);
                getLinkedlist(key).addLast(newEntry);
            }
        }

        public int get(int key) {
            MyMapEntry mapEntry = getMapEntry(key);
            if(mapEntry == null){
                return  -1;
            }else {
                return  mapEntry.value;
            }
        }



        public  MyMapEntry getMapEntry(int key){
            MyMapEntry mapEntry = null;
            LinkedList<MyMapEntry> temp = getLinkedlist(key);
            for (MyMapEntry myMapEntry : temp){
                if(myMapEntry.key==key){
                    mapEntry=myMapEntry;
                    break;
                }
            }
            return  mapEntry;
        }

        public void remove(int key) {
            MyMapEntry mapEntry = getMapEntry(key);
            getLinkedlist(key).remove(mapEntry);
        }


        public LinkedList<MyMapEntry>  getLinkedlist(int key){
            int hashedKey = calculateHash(key);
            return  arr.get(hashedKey);
            
        }


        public  int calculateHash(int key){
            return   key % arraySize;
        }
    
     class MyMapEntry{
            Integer key;
            Integer value;
            MyMapEntry(){}
            MyMapEntry(int key,int value){
                this.key= key;
                this.value= value;
            }

        }
    }
}