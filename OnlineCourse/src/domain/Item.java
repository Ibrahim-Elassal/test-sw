
package domain;


public abstract class Item {
    private String Id ;
    private String Url ;
    private int Number ;

     public Item(String Id, String Url, int Number)
    {
        this.Id = Id;
        this.Url = Url;
        this.Number = Number;
    }
   
    public String getFormId() {
        return Id;
    }
    public String getFormUrl() {
        return Url;
    }
    public int getFormNo() {
        return Number;
    }
}
