package Program1;

public class Main {
    public static void main(String[] args) {

        Customer c1=new Customer("David","Luiz","8799087654");
        Address billingC1= new Address("123 Main St", "Springfield", "IL", "62701");
        Address shippingC1=new Address("456 Elm St", "Oakville", "WA", "98568");
        c1.setBillingAddress(billingC1);
        c1.setShippingAddress(shippingC1);

        Customer c2=new Customer("Lionel","Messi","6787654320");
        Address billingC2=new Address("789 Pine St", "Cedar Rapids", "IA", "52404");
        Address shippingC2=new Address("101 Maple St", "Greenville", "SC", "29601");
        c2.setBillingAddress(billingC2);
        c2.setShippingAddress(shippingC2);

        Customer c3=new Customer("Philip","Brooks","5679894545");
        Address billingC3=new Address(" 5801 S Ellis Ave","Chicago","IL","60637");
        Address shippingC3=new Address("222 Oak St", "Portland", "OR", "97201");
        c3.setBillingAddress(billingC3);
        c3.setShippingAddress(shippingC3);

        Customer[] custArray={c1,c2,c3};
        for (int i = 0; i < custArray.length; i++) {
            if(custArray[i].getBillingAddress().getCity().equals("Chicago")){
                System.out.println(custArray[i].toString());
            }
        }

    }
}
