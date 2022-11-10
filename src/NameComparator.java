import java.util.Comparator;
import java.lang.Math;
import java.util.Locale;

public class NameComparator implements Comparator<Name> {
    @Override
    public int compare(Name o1, Name o2) {
        int len1 = o1.getName().length();
        int len2 = o2.getName().length();
        if(len1>len2){
            return -1;
        }
        if(len1<len2){
            return 1;
        }
        else {
            char[] alphabet = {'a','ą','b','c','ć','d','e','ę','f','g','h','i','j','k','l','ł','m','n','ń','o','ó','p','q','r','s','ś','t','u','v','w','x','y','z','ź','ż'};
            String first = o1.getName().toLowerCase();
            String second = o2.getName().toLowerCase();
            for(int i=0; i<len1; i++){
                /////////// getting number of current letter in the alphabet
                int firstPos=-1;
                int secondPos=-1;
                int n=0;
                for(char c : alphabet){
                    if(first.charAt(i) == c){
                        firstPos = n;
                    }
                    if(second.charAt(i) == c){
                        secondPos = n;
                    }
                    if(firstPos!=-1 && secondPos!=-1){
                        break;
                    }
                    n++;
                    /////////////
                }
                if(firstPos<secondPos){
                    return -1;
                }
                else if(firstPos>secondPos){
                    return 1;
                }
                else{
                    continue;
                }
            }
            return 0;
        }
    }
}
