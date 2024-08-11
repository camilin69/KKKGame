package co.edu.uptc.main;


import co.edu.uptc.core.EngineManager;
import co.edu.uptc.core.WindowManager;
import co.edu.uptc.core.utils.Consts;
import org.lwjgl.Version;

public class Run {

     private static WindowManager window;
     private static TestGame game;

     public static void main(String[] args) {
        System.out.print(Version.getVersion());


        window = new WindowManager(Consts.TITLE, 1000, 900, false);
        game = new TestGame();
        EngineManager engine = new EngineManager();

        try{
            engine.start();
        }catch(Exception e){
            e.printStackTrace();
        }


    }

    public static WindowManager getWindow() {
        return window;
    }

    public static TestGame getGame() {
        return game;
    }
}
