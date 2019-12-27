public class Hindex {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        Solution s = new Solution();
        System.out.println(s.solution(citations));
    }
}
class Solution {
    public int solution(int[] citations) {
        int[] maxMin = searchMax(citations);
        int answer = returnAnswer(citations, maxMin);
        return answer;
    }
    public int[] searchMax(int[] citations) {
        int max = citations[0];
        int min = citations[0];
        for(int i = 0 ; i < citations.length; i++) {
            if (citations[i] > max) max = citations[i];
        }
        for(int i = 0 ; i < citations.length; i++) {
            if (citations[i] < min) min = citations[i];
        }
        int[] maxMin = {max, min};
        return maxMin;
    }
    public int returnAnswer(int[] citations, int[] maxMin) {
        int max = maxMin[0];
        int min = maxMin[1];
        int answer = 0;
        for(int i = max ; i >= min ; i--) {
            int index = 0;
            for(int j = 0; j < citations.length; j++) {
                if(citations[j] >= max) {
                    index++;
                }
            }
            if (index == max) {
                int minIndex = 0;
                for(int j = 0 ; j < citations.length; j++) {
                    if(citations[j] <= max) minIndex++;
                }
                if(minIndex == index) answer = index;
                System.out.println(index + "찾음");
            }
            System.out.println(max + "보다 많이 인용된 논문의 수는 "+index+"개 입니다.");
            max--;
        }
        return answer;
    }

}
