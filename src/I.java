import java.util.Scanner;

class I implements GetGoods{
    private Scanner input = new Scanner(System.in);
    private float money;

    public void inquire(){
        System.out.println("程序员：我想在京东上买点东西，你觉得我花多少钱比较合适？");
        money = input.nextFloat();
    }
    public void makeOrder(RecieveOrder reciever){
        System.out.println("程序员：我在京东下了一单，支付了" + money + "元");
        reciever.recieveOrder(money);
    }

    @Override
    public void getGoods() {
        System.out.println("程序员：太棒了！经过这么久的等待，我终于拿到了我梦寐以求的商品！");
        System.out.println("程序员：回去一定要给京东打好评。");
    }
}
