import java.io.File;
import java.util.function.Consumer;

public class Main {
    private static int findMaxDepth(File dir){
        if(dir.isDirectory()){
            int level =0;
            for(File f:dir.listFiles()){
                if(f.isDirectory()){
                    int newLevelChild=findMaxDepth(f);
                    level=Math.max(level,newLevelChild);
                }
            }
            return 1+level;
        }
        else return  0;
    }
    private static void getMaxDepthElems(File dir,int maxDepth,String mask, int currDepth, Consumer<String> callback) {
        if (currDepth == maxDepth) {
            if (dir.getName().matches(mask)) {
                //callback.accept(dir.getAbsolutePath());
                System.out.println(dir.getAbsolutePath());
            }
        } else if (dir.isDirectory()) {
            for(File f:dir.listFiles()) {
                getMaxDepthElems(f,maxDepth,mask,currDepth+1,callback);
            }
        }
    }
    public static void genMaxDepthElements(String path, String mask, Consumer<String> callback){
        File dir = new File(path);
        int maxDepth =findMaxDepth(dir);
        System.out.println(maxDepth);
        getMaxDepthElems(dir,maxDepth,mask,0,callback);

    }
    public static void main(String[] args) {
        String path = "H:\\Java прога";
        String mask ="input??.*";
        genMaxDepthElements(path,mask,(String element)->{
            System.out.println(element);
        });
    }
}