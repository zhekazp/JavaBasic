package homeWorks.homeWork36.optional;



    import java.util.List;
    import java.util.Optional;


    public class HomeWork36_1 {

        public Optional<String> stringFromList(List<String> list){
            return Optional.ofNullable(list.getFirst());
        }
    public Optional<Integer> getMultipliedTwo(Integer n){
            if (n==null){
                return Optional.empty();
            }else{
                return Optional.of(n*2);
            }

    }
        public Optional<Integer> getSum(List <Integer> list){
            Integer sum=0;
            boolean isOk=true;
            for (int i=0;i<list.size();i++){
                if(list.get(i)==null){
                    isOk=false;
                    break;
                }else{
                    sum+=list.get(i);
                }
            }
            if (!isOk){
                return Optional.empty();
            }else{
                return Optional.of(sum);
            }

        }
        public Optional<Integer> getStrLength(String str){
            if(str!=null){
                return Optional.of(str.length());
            }else{
                return Optional.empty();
            }
        }

}
