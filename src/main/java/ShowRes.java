import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by JBL on 2017/9/24.
 */
public class ShowRes
{
    private String name;
    private List<CalculateRes> list = new ArrayList<CalculateRes>();
    public void setName(String name)
    {
        this.name = name;
    }

    public void setList(List<CalculateRes> arrayList)
    {
        this.list = arrayList;
    }
}
