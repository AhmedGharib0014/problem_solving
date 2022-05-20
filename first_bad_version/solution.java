public class solution {

    public int firstBadVersion(int n) {
        return findBadVersion(1,n,n);
    }
    
     public int findBadVersion(int start, int end, int currentBadVersion){
        if(start> end) return  currentBadVersion;
        int mid = start + (end-start)/2;
        if(isBadVersion(mid)) return  findBadVersion(start,mid-1,mid);
         else  return  findBadVersion(mid+1,end,currentBadVersion);
    }
    
}
