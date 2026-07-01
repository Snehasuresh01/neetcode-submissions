class Solution {
    public boolean isAnagram(String s, String t){
        char[] sn = s.toCharArray();
        char[] tn = t.toCharArray();

        Arrays.sort(sn);
        Arrays.sort(tn);

        String ss = new String(sn);
        String ts = new String(tn);

        System.out.println(ss);
        System.out.println(ts);

        if (ss.equals(ts))
            return true;
        return false;
}
}
