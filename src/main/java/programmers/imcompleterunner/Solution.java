package programmers.imcompleterunner;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();
        for (String p : participant) {
            participantMap.put(p, participantMap.getOrDefault(p, 0) + 1);
        }

        for (String completedRunner : completion) {
            int count = participantMap.get(completedRunner) - 1;
            if (count == 0) {
                participantMap.remove(completedRunner);
            } else {
                participantMap.put(completedRunner, count);
            }
        }

        return participantMap.keySet().iterator().next();
    }
}
