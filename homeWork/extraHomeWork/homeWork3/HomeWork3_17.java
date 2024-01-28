package homeWork3;

import homeWork3.classes.Stock;

public class HomeWork3_17 {
    public static void main(String[] args) {
        //10 -> 12 -> 5 -> 7 -> 99 -> 77
        Stock st=new Stock("Google",10);
        st.getPriceInformation();
        st.updatePrice(12);
        st.updatePrice(5);
        st.updatePrice(7);
        st.updatePrice(99);
        st.updatePrice(77);
        st.getPriceInformation();

    }
}
