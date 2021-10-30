import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String arg[]){
        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        Folder folder3 = new Folder("folder3");
        Folder folder4 = new Folder("folder4");

        folder1.addFolder(folder2);
        folder2.addFolder(folder3, folder4);

        folder2.printFolders();
    }
}

class Folder{
    String name;

    public Folder(String name) {
        this.name = name;
    }

    List<Folder> folders = new ArrayList<>();

    public void addFolder(Folder folder){
        folders.add(folder);
    }

    public void addFolder(Folder... folder){
        folders.addAll(Arrays.asList(folder));
    }

    public void printFolders(){
        folders.forEach(folder-> {System.out.println(folder.name); folder.printFolders();});
    }

}
