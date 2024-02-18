package homeWorkOPP1.task1;

public class SearchWord {
    private String[] words;
    int [] countWords;
    public SearchWord(String str){
        words=str.split(" ");
        countWords();
    }
    public void countWords(){
        countWords =new int[words.length];
        for (int i=0;i<countWords.length;i++){
            int counter=0;
            for (int j=0;j<countWords.length;j++){
                if(words[i].equals(words[j])){
                    counter++;
                }
            }
            countWords[i]=counter;
        }

    }
    public int indexMax(){
        int max=0;
        int result=0;
        for (int i=0;i<countWords.length;i++){
            if(countWords[i]>max){
                max=countWords[i];
                result =i;
            }
        }
        return result;
    }
    public void printWord(){
        System.out.println("The word which is in text most times: "+words[indexMax()]);
    }
}
