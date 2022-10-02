class Solution {
     public int ladderLength(String beginWord, String endWord, List<String> wordList) {
       Set<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;

        Queue<String> queue= new LinkedList<>();
        int changes =1;

        queue.add(beginWord);


        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i <size ; i++) {
                String currentWord = queue.poll();
                for (int j = 0; j < currentWord.length(); j++) {

                    char[] currentCharArray = currentWord.toCharArray();
                    char originalChar = currentCharArray[j];

                    for (char k = 'a'; k <='z' ; k++) {
                        if(currentCharArray[j]==k) continue;;
                        currentCharArray[j]=k;
                        String newWord =String.valueOf(currentCharArray);
                        if(newWord.equals(endWord)) return changes+1;
                        if(set.contains(newWord)){
                            queue.add(newWord);
                            set.remove(newWord);
                        }
                        currentCharArray[j]=originalChar;
                    }
                }
            }

            ++changes;
        }

        return 0;


    }

}