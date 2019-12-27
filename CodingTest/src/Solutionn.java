import java.util.Vector;


public class Solutionn {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            Vector<String> vector1 = new Vector<String>(); // 참가자
            Vector<String> vector2 = new Vector<String>(); // 완주자
            for(int i = 0 ; i < participant.length ; i++) {
                vector1.add(participant[i]);
            }
            for(int i = 0 ; i < completion.length ; i++) {
                vector2.add(completion[i]);
            }
            for(int i = 0 ; i < participant.length ; i++) {
                if (vector2.contains(vector1.get(i))==true) {
                    int j = vector2.indexOf(vector1.get(i));
                    vector2.remove(j);
                    vector2.insertElementAt("", j);
                }
                else
                    answer = vector1.get(i);
            }
            return answer;
        }
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        Solutionn s = new Solutionn();
        System.out.println(s.solution(participant, completion));

    }
}
