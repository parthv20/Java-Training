package JavaAssignment3;


public class q3 {
    public static void main(String[] args) {
        String words[] = {"grace", "graceful", "disgraceful", "gracefully"};
        
        int n = words.length;
        String s = words[0];
        String common = "";
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String stem = s.substring(i, j);
                int k = 1;
                for (k = 1; k < n; k++)
                    if (!words[k].contains(stem))
                        break; 
                        
                if (k == n && common.length() < stem.length())
                    common = stem;
            }
        }
        System.out.println(common);
    }
}