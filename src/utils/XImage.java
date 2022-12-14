package utils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class XImage {
    public static Image getAppIcon(){
        URL url = XImage.class.getResource("/img/logo.jpg");
        return new ImageIcon(url).getImage();
    }
    public static void save(File src){
        File dst = new File("staff",src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
        }
    }
    public static ImageIcon read(String fileName){
        File path = new File("staff",fileName);
        return  new ImageIcon(path.getAbsolutePath());
    }
    
    public static void save2(File src){
        File dst = new File("build/classes/img",src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
        }
    }
    
    public static ImageIcon read2(String fileName){
        File path = new File("classes/img",fileName);
        return  new ImageIcon(path.getAbsolutePath());
    }
}
