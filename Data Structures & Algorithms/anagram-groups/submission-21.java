class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String fixedWord = new String(word);
            if (!map.containsKey(fixedWord)) {
                map.put(fixedWord, new ArrayList<String>());
            }
            map.get(fixedWord).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
