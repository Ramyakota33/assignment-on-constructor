class Product
  {
    String name;
    int price;
    int quantity;
    Product(String n,int p,int q)
    {
      name=n;
      price=p;
      quantity=q;
    }
    public void display()
    {
      System.out.println(name+" "+price+" "+quantity);
    }
    public static void main(String args[])
    {
     Product product=new Product("t shirts",999,3);
      product.display();
    }
    }

