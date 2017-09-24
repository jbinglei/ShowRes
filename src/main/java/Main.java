import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by JBL on 2017/9/24.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("begin...");
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("Job","Pipeline");
        map.put("2:Subjob","Compile");
        map.put("3:Subjob","Compile_CDToolPortal");
        map.put("4:Subjob","Compile_RecordVisitor");
        map.put("5:Subjob","FindBugs");
        map.put("6:Subjob","PMD");
        map.put("7:Subjob","PMD_CDToolPortal");
        map.put("8:Subjob","PMD_RecordVisitor");
        CalculateRes calculateRes = new CalculateRes();
        ShowRes showRes = new ShowRes();
        showRes.setName((String)map.get("Job"));
        showRes.setList(calculateRes.doResult(map));
        System.out.println("end...");

    }
}
