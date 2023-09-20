package fact.it.exercisedairy.model;

public class Dairy extends Product{
    public int numberOfDays;
    public char supplierCode;

    public Dairy(int productNumber) {
        super(productNumber);
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public char getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(char supplierCode) {
        this.supplierCode = supplierCode;
    }
    public void lowerFreshness(){
        numberOfDays-=1;
    }
    public void fastSale(int minimumNumberOfDays){
        double price=getUnitPrice();
        if (numberOfDays<=minimumNumberOfDays){
            price =price/2;
        }
        setUnitPrice(price);
    }
}
