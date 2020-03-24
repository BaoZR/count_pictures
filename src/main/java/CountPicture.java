import java.io.File;

/*
 * @Author  :bob
 * @Date    :Created in 16:35 2020/3/24
 * @Description:
 *
 */
public class CountPicture implements Runnable {

    private Thread thread;
    public volatile  boolean exit = false;
    public void run() {
        try{
            while (!exit){
                File file = new File("C:\\Users\\Administrator\\Desktop\\");
                File files[] = file.listFiles();
                int count = 0;
                for(int i=0; i<files.length; i++){
                    if(files[i].toString().endsWith(".bmp")){
                        count++;
                    }
                }
                Application.receiveMsg(count);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public void start(){
        if(thread == null){
            thread = new Thread(this);
            thread.start();
        }
    }




}
