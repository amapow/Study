/* K번째 수
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0 ; i < commands.length ; i++) {
            int firstCommand = (commands[i][0])-1;
            int secondCommand = commands[i][1];
            int thirdCommand = (commands[i][2])-1;
            int[] temp = Arrays.copyOfRange(array, firstCommand, secondCommand);
            Arrays.sort(temp);
            answer[i] = temp[thirdCommand];
            System.out.println(answer[i]);
        }
        return answer;
    }
}
*/

import java.util.Arrays;

class ReverseString {
    public static void main(String[] args) {
        int[] input = {30, 3, 34, 5, 9};
        ReverseString r = new ReverseString();
        r.returnAnswer(input);
    }

    public String solution(int[] numbers) {
        String answer = returnAnswer(numbers);
        return answer;
    }

    public static String returnAnswer(int[] numbers) {
        int[] temp = new int[numbers.length];
        int tmp, tmpp;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 10) {
                temp[i] = numbers[i] * 1111;
            } else if (numbers[i] > 10) {
                temp[i] = numbers[i] * 101;
            } else if (numbers[i] > 100) {
                temp[i] = numbers[i] * 10;
            }
        }
        for (int i = 0 ; i < numbers.length-1; i++) {
            for(int j = i ; j >= 0 ; j--) {
                if(temp[j+1] > temp[j]) {
                    tmp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = tmp;
                    tmpp = temp[j+1];
                    temp[j+1] = temp[j];
                    temp[j] = tmpp;
                }
            }
        }
        for(int a : numbers){
            System.out.print(" "+a);
        }
        String a = Arrays.toString(numbers).replaceAll("[^0-9]","");
        System.out.println(a);
        return a;

        //public static void main(String[] args) {
        /*
        String input = "abc 123 apple";
        ArrayList<String> strList = new ArrayList<>();
        String temp="";
        for(int i = 0 ; i < input.length() ; i++) {
            if(input.charAt(i) == ' ') {
                strList.add(temp);
                temp="";
            }
            else {
                temp += input.charAt(i);
            }
        }
        strList.add(temp);
        System.out.println(strList.get(1) + strList.size());
        Iterator<String> it = strList.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        for(String a:strList) {
            System.out.println(a);
        }
    }

    public static String reverse(String input) {
        StringBuffer strBuffer = new StringBuffer();

        for (int i = 0 ; i < input.length(); i++) {
            strBuffer.append(input.charAt(input.length() - i - 1));
        }
        return strBuffer.toString();
    }
    public static String split(String input) {
        ArrayList<String> strList = new ArrayList<>();
        String temp="";
        for(int i = 0 ; i < input.length() ; i++) {
            if(input.charAt(i) == ' ') {
                strList.add(temp);
                temp="";
            }
            else {
                temp += input.charAt(i);
            }
        }
        return "ac";
        /*
        StringBuffer strBuffer = new StringBuffer();
        for(int i = 0 ; i < input.length() ; i++) {
                    if(input.charAt(i) == ' ') {
                        strList.add(strBuffer.toString()); //strList에 strBuffer 추가
                        strBuffer = new StringBuffer(); //strBuffer 초기화
                }
                    else {
                        strBuffer.append(input.charAt(i));
                    }
            }
        strList.add(strBuffer.toString());
        return strList.toArray(new String[strList.size()]);
        */
    }
}


