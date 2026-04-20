package pckg_abs_cls;

public class TestDeviceApp {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("Samsung","S26");
        mobilePhone.operate();
        mobilePhone.getMaininfo();
        Camera camera = new Camera("Sony", "S345");
        camera.getMainInfo();
        camera.operate();
    }
}
