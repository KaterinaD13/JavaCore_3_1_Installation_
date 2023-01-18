import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //В папке Games создайте несколько директорий: src, res, savegames, temp.
        //В каталоге src создайте две директории: main, test.
        //В каталог res создайте три директории: drawables, vectors, icons.

        File src = new File("D://Games//src");
        File res = new File("D://Games//res");
        File savegames = new File("D://Games//savegames");
        File temp = new File("D://Games//temp");
        File main = new File("D://Games//src//main");
        File test = new File("D://Games//src//test");
        File drawables = new File("D://Games//res//drawables");
        File vectors = new File("D://Games//res//vectors");
        File icons = new File("D://Games//res//icons");
        List<File> folderList = Arrays.asList(src, res, savegames, temp, main, test, drawables, vectors, icons);

        //В подкаталоге main создайте два файла: Main.java, Utils.java.
        //В директории temp создайте файл temp.txt.
        File mainJava = new File("D://Games//src//main//Main.java");
        File utilsJava = new File("D://Games//src//main//Utils.java");
        File tempTxt = new File("D://Games//temp//temp.txt");
        List<File> fileList = Arrays.asList(mainJava, utilsJava, tempTxt);

        StringBuilder log = new StringBuilder();

        folderList.stream().forEach(folder -> {
            if (folder.mkdir()) log.append("Каталог " + folder + " создан\n");
            else log.append("Каталог " + folder + " не создан\n");
        });
        fileList.stream().forEach(file -> {
            try {
                if (file.createNewFile()) log.append("Файл " + file + " создан\n");
                else log.append("Файл " + file + " не создан\n");
            } catch (IOException ex) {
                log.append(ex.getMessage() + '\n');
            }
        });
        try (FileWriter fw = new FileWriter("D://Games//temp//temp.txt", false)) {
            fw.write(log.toString());
            fw.flush();
        } catch (IOException ex) {
            log.append(ex.getMessage() + '\n');
        }
        try (BufferedReader br = new BufferedReader(new FileReader("D://Games//temp//temp.txt"))) {
            String s;
            while ((s = br.readLine()) != null) System.out.println(s);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}