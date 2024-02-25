package homeWorkOPP1.task7;

public class InMemoryDatabase implements ProductDatabase{
    Product[] products;

    @Override
    public void save(Product product) {
        int len=0;
        if(products!=null){
            len=products.length;
        }
        Product[] temp=new Product[len+1];
        for (int i=0;i<len;i++){
            temp[i]=products[i];
        }
        temp[temp.length-1]=product;
        products=temp;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for(int i=0;i<products.length;i++){
            if(products[i].getTitle().equals(productTitle)){
                return products[i];
            }
        }
        return null;
    }

}
