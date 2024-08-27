public class removeDuplicate{

    public static void removeDup(String str, int idx, StringBuilder newstr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        ///kaam 
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            //duplicate
            removeDup(str, idx + 1, newstr, map);
        }else{
            map[currChar-'a'] = true;
            removeDup(str, idx+1, newstr.append(currChar), map);
        }
    } 
    public static void main(String[] args) {
        String str = "aabbcc";
        removeDup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
