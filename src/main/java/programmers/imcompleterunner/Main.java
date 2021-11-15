package programmers.imcompleterunner;

public class Main {

    public static void main(String[] args) {

        var participant = new String[] {"mislav", "stanko", "mislav", "ana"};
        var completion = new String[] {"stanko", "ana", "mislav"};

        Solution solution = new Solution();
        var result = solution.solution(participant, completion);
        System.out.println(result);
    }
}
