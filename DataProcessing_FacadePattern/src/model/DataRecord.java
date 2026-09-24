package model;

public class DataRecord {

    private String product;
    private Double sales;
    private Integer unitsSold;

    public DataRecord(String product, Double sales, Integer unitsSold){
        this.product=product;
        this.sales=sales;
        this.unitsSold=unitsSold;
    }

    public String getProduct() {
        return product;
    }

    public Integer getUnitsSold() {
        return unitsSold;
    }

    public Double getSales() {
        return sales;
    }
    public String toString(){
        return "DataRecord{" +
                "Product= '" + product + '\'' +
                ", sales =" + sales +
                ",unitsSold=" +unitsSold +
                '}';
    }
}
