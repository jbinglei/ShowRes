import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by JBL on 2017/9/24.
 */
public class CalculateRes
{
    private String name;
    private Map<String,String> res = new HashMap<String, String>();
    public static final String[] str = {"Compile","FindBugs","PMD","CheckStyle"};
    public CalculateRes()
    {

    }

    public List<CalculateRes> doResult(Map<String,Object> map)
    {
        List<CalculateRes> resList = new ArrayList<CalculateRes>();
        for(int i=0;i<str.length;i++)
        {
            CalculateRes calculateRes = doRes(map, i);
            if(calculateRes.name!=null) {
                resList.add(calculateRes);
            }
        }
        return resList;
    }

    public CalculateRes doRes(Map<String,Object> map,int loop)
    {
        CalculateRes calculateRes = new CalculateRes();
        List<String> list = new ArrayList<String>();
        for(Map.Entry<String, Object> entry : map.entrySet())
        {
            if(entry.getValue().toString().contains(str[loop]))
            {
                list.add(entry.getValue().toString());
            }
        }
        int inloop = 1;
        for(int j=0;j<list.size();j++)
        {
            if(list.get(j).equals(str[loop]))
            {
                calculateRes.name=str[loop];
            }else
            {
                calculateRes.res.put("module"+inloop, list.get(j));
                inloop++;
            }
        }
        return calculateRes;
    }

}
