/**
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
class Solution {
    public int findScore(String s, String t) {
        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public void findSecretWord(String[] words, Master master) {
        List<String> wordList = new ArrayList();

        for (int i = 0; i < words.length; i++) {
            wordList.add(words[i]);
        }

        int track = 0;
        Random random = new Random();

        while (!wordList.isEmpty()) {
            System.out.println(wordList);
            String w = wordList.get(random.nextInt(wordList.size()));
            System.out.println(w);
            track = master.guess(w);
            if (track == 6)
                return;
            else {
                List<String> temp = new ArrayList();
                for (int i = 0; i < wordList.size(); i++) {
                    if (findScore(w, wordList.get(i)) == track) {
                        temp.add(wordList.get(i));
                    }
                }
                wordList = temp;
            }

        }

    }
}