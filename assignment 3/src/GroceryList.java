import java.util.ArrayList;
public class GroceryList {
    private ArrayList<GroceryItemOrder> GroList = new ArrayList<>(10);
    public GroceryList() {
    }
    public double getSumCost(){
        double SumCost=0;
        for(int i = 0 ; i < GroList.size() ; i++){
            SumCost+=GroList.get(i).getPrice() * GroList.get(i).getQuantity();
        }
        return SumCost;
    }
    public void add(GroceryItemOrder item){
        if(GroList.size()<10)
            GroList.add(item);
    }
}
