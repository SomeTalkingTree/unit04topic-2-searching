import java.util.ArrayList;
import java.util.Arrays;

public class StringListSearch {

    public static int unorderedSearch(ArrayList<String> items, String term) {
        int indexofnums = -1;
        int order =0;
        for(String text:items){
            boolean tof1 = text.equals(term);
            if(tof1){
                indexofnums= order;
            }
            order++;
        }
        return indexofnums;
    }

    public static int orderedSearch(ArrayList<String> items, String term){
        int num = 0;
        for(String text:items){
            int compared = text.compareTo(term);
            if(compared==0){
                return num;
            }else if(compared>0){
                return -1;
            }
            num++;
        }
        return -1;
    }

    public static int orderedBinarySearch(ArrayList<String> items, String term){
        ArrayList<String> Listy; 
        Listy= new ArrayList<String>();
        ArrayList<Integer> places=new ArrayList<>();
        for(int looping = 0;looping<items.size();looping++){
            int compared = items.get(looping).compareTo(term);
            if(compared==0){
                Listy.add(items.get(looping));
                places.add(looping);
            }
        }
        for(int looping=0;looping<Listy.size();looping++){
            if(!(Listy.get(looping).equals(term))){
                Listy.remove(looping);
                places.remove(looping);
            }
        }
        places.add(-1);
        return places.get(0);

    }    
    






    
    public static void main(String[] args) {
        ArrayList<String> listy = new ArrayList<>(Arrays.asList("a", "i", "t", "m","f","p"));
        String text = "a";

        
        int num2 =05657575;
        for(String text1:listy){
            num2 = text1.compareTo(text);System.out.println(num2);


        }
        //int num = listy.indexOf(text);
        
    }
}













//Code that was too hard for what it did:
/*
 * int indexofitem = -1;int num = 0;
        boolean tnf = false;
        boolean letters = true;
        for(String text:items){
            if(text.length()==term.length()){
                letters = true;
                while(letters||(num==term.length()-1)||(num==text.length()-1)){
                    if(term.substring(num,num+1)==text.substring(num,num+1)){
                        tnf = true;
                        letters = true;
                    }else {
                        tnf = false;
                        letters = false;
                    }
                    num++;
                }
                if(tnf){
                    indexofitem = 
                }
            }
        }
 * 
 * 
 * 
 */