package JavaAssignment3;

public class q4 {
    public static void main(String[] args) {
        String a = "software";
        String b = "swear oft.";

        int freqA[] = new int[26];
        for(int i=0;i<a.length();i++){
            char x = a.charAt(i);
            if(x==' ' || x=='.' || x==',' || x=='!' || x=='?')continue;

            freqA[(int)x - (int)'a']++;
        }

        int freqB[] = new int[26];
        for(int i=0;i<b.length();i++){
            char x = b.charAt(i);
            if(x==' ' || x=='.' || x==',')continue;

            freqB[(int)x - (int)'a']++;
        }

        int i=0;
        for(i=0;i<26;i++){
            if(freqA[i]!=freqB[i]){
                System.out.println("Not Anagrams");
                break;
            }
        }
        if(i==26)System.out.println("Yes");
    }
}