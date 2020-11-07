public class InterfaceBack {

    public static void main(String[] args) {

        I uil = new I();
        JingDong jingDong = new JingDong();

        uil.inquire();
        jingDong.setCustomer(uil);
        uil.makeOrder(jingDong);

        System.out.println("——全剧终——");
    }
}
