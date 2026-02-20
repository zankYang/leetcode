import java.util.Arrays;

class LongestCommonPrefix {
    static void main(String[] args) {
        System.out.println(longestPrefix(new String[] {"flower","flow","flight"}));
    }

    static String longestPrefix(String [] array){
        Arrays.sort(array);
        int limit = Math.min(array[0].length(),array[array.length-1].length());
        for (int i = 0; i < limit; i++){
            if (array[0].charAt(i)!=array[array.length-1].charAt(i)){
                return array[0].substring(0,i);
            }
        }
        return array[0].substring(0,limit);
    }
}
