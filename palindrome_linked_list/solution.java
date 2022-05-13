
public class solution {
    // thre is another solution by using fast/slow pointers and reverse linkedList
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
       while (head!= null){
           arrayList.add(head.val);
           head=head.next;
       }
       int size= arrayList.size();
       
       for(int i=0;i<size/2;i++){
           if(arrayList.get(i) != arrayList.get(size-1-i)) return false;
       }
       return true;

   }
    
}
