import static java.lang.Thread.sleep;

class JingDong implements RecieveOrder{
    private GetGoods customer;
    @Override
    public void recieveOrder(float money) {
        System.out.println(" 京东：我们接到了一个价值" + money + "元的订单，真是一个大订单！");
        System.out.println(" 京东：订单处理中，请稍后……");
        try{
            sleep(1000);
        }catch(Exception e){

        }
        System.out.println(" 京东：您的订单已发货，到货后我们会通知您。");
        try{
            sleep(5000);
        }catch(Exception e){

        }
        System.out.println(" 京东：您的快递已到货，请及时查收。");
        customer.getGoods();
    }
    public void setCustomer(GetGoods customer){
        this.customer = customer;
    }
}
