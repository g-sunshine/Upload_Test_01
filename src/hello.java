import com.sun.jdi.PathSearchingVirtualMachine;
import jdk.nashorn.api.tree.ForInLoopTree;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Created by gao on 2020/5/21.
 */

public class hello {

    public static void main(String[] args){
        String[] arr = new String[]{"Tom", "Jerry", "Hanmeimei","Lilei"};

        //模板一：fori
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //模板二：iter
        for (String s : arr) {
            System.out.println(s);
        }

        //模板三：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模板四：list.for
        list<String> list = new ArrayList();
        list.add(int 123);
        list.add(int 456);
        list.add(int 567);

        for (object o :list){
            System.out.println(o);


        }



    }




}

