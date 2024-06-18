package countingwords;

import org.apache.commons.io.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class CountingWords {
    public static Map<String, Long> count(String text) {
        String words[] = text.split("[ .,\n\r]+");
        Map<String, Long> counts = new HashMap<>();

        for(String w : words) {
            String wsmall = w.toLowerCase();
            Long res = counts.get(wsmall);
            if(res == null) {
                counts.put(wsmall, 1L);
            } else {
                counts.put(wsmall, res + 1L);
            }
        }

        return counts;
    }

    public static void main(String[] args) throws IOException {
//        String ss = "abc ,xyz,  ó hhh.Www. IIIiii   ,  , \nTest, xyz,  gg.  Mrówka  Test!, Test, abc   , mrówka, abC";
//        System.out.println(ss);

        File file = new File("D:\\priv\\projects\\IdeaProjects\\alg\\algorithms\\src\\main\\java\\countingwords\\data.txt");
        String str =  FileUtils.readFileToString(file, StandardCharsets.UTF_8);

        Map<String, Long> res = count(str);

        List<Map.Entry<String, Long>> list = new ArrayList<Map.Entry<String, Long>>(res.entrySet());
        Collections.sort( list, new Comparator<Map.Entry<String, Long>>()
        {
            public int compare( Map.Entry<String, Long> o1, Map.Entry<String, Long> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );

        System.out.println(list);
    }
}
