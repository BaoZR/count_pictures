import java.util.concurrent.TimeUnit;

/*
 * @Author  :bob
 * @Date    :Created in 15:53 2020/3/24
 * @Description:
 *
 */
public class Application {

    public static int count = 0;

    public static void receiveMsg(int msg) {
        count = msg;
    }

    public static void main(String[] args) throws InterruptedException {

        CountPicture countPicture = new CountPicture();
        countPicture.start();

        MyFrame frame = new MyFrame();

        while (true) {
            frame.updateLabel(count);
            TimeUnit.MILLISECONDS.sleep(400);
            frame.repaint();
        }
    }
}
