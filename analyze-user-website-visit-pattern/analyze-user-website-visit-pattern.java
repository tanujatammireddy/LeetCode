class Solution {
    static class Record {
        private final String username;
        private final String website;
        private final int time;

        public Record(String username, String website, int time) {
            this.username = username;
            this.website = website;
            this.time = time;
        }
    }

    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
        // merge three inputs array and sort it by time
        Record[] records = new Record[username.length];
        for (int i = 0; i < username.length; i++) {
            records[i] = new Record(username[i], website[i], timestamp[i]);
        }
        Arrays.sort(records, Comparator.comparingInt(record -> record.time));
        // classify it by username
        Map<String, List<String>> map = new HashMap<>();
        for (Record record : records) {
            map.putIfAbsent(record.username, new ArrayList<>());
            map.get(record.username).add(record.website);
        }
        int[] maxCount = new int[1];
        String[] maxPattern = new String[1];
        Map<String, Integer> scope = new HashMap<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            // generate unique pattern for each user
            List<String> websites = entry.getValue();
            List<String> list = new ArrayList<>();
            Set<List<String>> set = new HashSet<>();
            for (int i = 0; i <= websites.size() - 3; i++) {
                list.add(websites.get(i));
                for (int j = i + 1; j <= websites.size() - 2; j++) {
                    list.add(websites.get(j));
                    for (int k = j + 1; k <= websites.size() - 1; k++) {
                        list.add(websites.get(k));
                        set.add(new ArrayList<>(list));
                        list.remove(2);
                    }
                    list.remove(1);
                }
                list.remove(0);
            }
            // count patterns
            for (List<String> l : set) {
                count(l, maxCount, maxPattern, scope);
            }
        }
        return Arrays.asList(maxPattern[0].split(","));
    }

    private void count(List<String> list, int[] maxCount, String[] maxPattern, Map<String, Integer> scope) {
        String pattern = list.get(0) + "," + list.get(1) + "," + list.get(2);
        int count = scope.getOrDefault(pattern, 0) + 1;
        scope.put(pattern, count);
        if (maxCount[0] < count || (maxCount[0] == count && (maxPattern[0] == null || maxPattern[0].compareTo(pattern) > 0))) {
            maxCount[0] = count;
            maxPattern[0] = pattern;
        }
    }
}