import java.util.ArrayList;

class Main {

    public static void main(String[] args) {
        // write your code here
        OShop o = new OShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product p1 = new Product("Laptop", 3200.5, 1,1, 1123, "");
        Product p2 = new Product("Frigider", 207.95, 1,2, 1245, "");

        Product p3 = new Product(p1);

        p3.setQuantity(5);
        p3.setProdName("Paine");

        o.addProductToList(p1);
        o.addProductToList(p2);

        o.removeProductFromList(p1);
        System.out.println(p1.equals(p2));
    }
}

class OShop {
    private String onlineShopName;
    private String image;
    private ArrayList<Product> products;

    OShop(String name, String img, ArrayList<Product> products)
    {
        this.products = new ArrayList<Product>();
        this.image = img;
        this.onlineShopName = name;
    }
    public void addProductToList(Product p){
        this.products.add(p);
    }

    public void removeProductFromList(Product p){
        this.products.remove(p);
    }

    public String getOnlineShopName() {
        return onlineShopName;
    }

    public void setOnlineShopName(String onlineShopName) {
        this.onlineShopName = onlineShopName;
    }

    public String getImg() {
        return image;
    }

    public void setImg(String img) {
        this.image = img;
    }
}

 class Product
{
    private int prodId;
    private String prodName;
    private double productPrice;
    private int productType;
    private int productCategory;
    private int quantity;
    private String exp; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(){}

    public Product(String n, double p, int pt, int pc, int id, String exp)
    {
        prodName = n;
        productPrice = p;
        productType = pt;
        productCategory = pc;
        this.prodId = id;
        this.exp = exp;
    }

    public Product(Product p)
    {
        this.prodName = p.prodName;
        this.productPrice = p.productPrice;
        this.productType = p.productType;
        this.productCategory = p.productCategory;
        this.prodId = p.prodId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public boolean equals(Product p)
    {
        if(p.prodId != this.prodId||!p.prodName.equals(this.prodName)||p.productPrice != this.productPrice||p.productType != p.productType||p.productCategory != this.productCategory){
            return false;
        }else{
            return true;
        }
    }
    public void priceIncrease(double val){
        this.productPrice+=this.productPrice*val;
    }
    public void priceDecrease(double val){
        this.productPrice-=this.productPrice*val/100;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

class User
{
    public String username;
    public String id;
    public ArrayList<Order> sucessfulO;
    public ArrayList<Order> cancelledO;


    public User(String username, String id)
    {
        this.username = username;
        this.id = id;
        sucessfulO=new ArrayList<Order>();
        cancelledO=new ArrayList<Order>();
    }

    public void addSucessfulO(Order o)
    {
        this.sucessfulO.add(o);
    }

    public void addCanceledO(Order o)
    {
        this.cancelledO.add(o);
    }
}

class Order
{
    public ArrayList<Product> orderList;
    public String adress;

    public Order()
    {
        orderList = new ArrayList<Product>();
    }
    public void add(Product p)
    {
        if(orderList.size() > 99)
            return;

        orderList.add(p);
    }

    public void remove(Product p)
    {
        orderList.remove(p);
    }

    public String getAddress() {
        return adress;
    }

    public void setAddr(String adress) {
        this.adress = adress;
    }
}

class InventoryProduct extends Product
{
    private int IPquantity;
    public InventoryProduct(Product product, int IPquantity)
    {
        super();
        this.IPquantity = IPquantity;
    }
    @Override
    public int getQuantity() {
        return IPquantity;
    }
    @Override
    public void setQuantity(int quantity) {
        this.IPquantity = quantity;
    }
}

class OrderProduct extends Product{
    private int OPquantity;
    public OrderProduct(Product product, int OPquantity)
    {
        super();
        this.OPquantity = OPquantity;
    }
    @Override
    public int getQuantity() {
        return OPquantity;
    }
    @Override
    public void setQuantity(int quantity) {
        this.OPquantity = quantity;
    }
}


