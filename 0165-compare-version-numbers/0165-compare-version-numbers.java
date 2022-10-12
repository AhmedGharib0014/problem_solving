class Solution {
    public int compareVersion(String version1, String version2) {
        int revision1 =0;
		int revision2=0;
		
		int index1=0;
		int index2=0;

		while (index1<version1.length() || index2<version2.length()){

			while (index1<version1.length() && version1.charAt(index1) != '.'){
				revision1=10*revision1+(version1.charAt(index1)-'0');
				index1++;
			}

			while (index2<version2.length() && version2.charAt(index2) != '.'){
				revision2=10*revision2+(version2.charAt(index2)-'0');
				index2++;
			}

			if(revision1>revision2) return 1;
			else if(revision2>revision1) return -1;
			
			index1++;
			index2++;

			revision1=0;
			revision2=0;
		}

		return 0;
    }
}