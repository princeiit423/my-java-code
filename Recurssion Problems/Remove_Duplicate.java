//---------------- Code by FAIZ HUSSAIN --------------------------------->

public class Remove_Duplicate {
    public static void RemoveDuplicate(String str, int idx, StringBuilder Newstr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(Newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if (map[currchar - 'a'] == true) {
            // Duplcate
            RemoveDuplicate(str, idx + 1, Newstr, map);
        } else {
            map[currchar - 'a'] = true;
            RemoveDuplicate(str, idx + 1, Newstr.append(currchar), map);
        }
    }

    public static void main(String args[]) {
        String str = "appnnacollege";
        RemoveDuplicate(str, 0, new StringBuilder(""), new boolean[26]);

    }
}
