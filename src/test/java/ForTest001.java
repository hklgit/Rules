import com.bstek.entity.Customer;
import com.bstek.urule.ClassUtils;

import java.io.File;

/**
 * Created by hankl on 2017/11/24.
 */
public class ForTest001 {

    public static void main(String[] args) {

        File file=new File("d:/customer.xml");
        ClassUtils.classToXml(Customer.class, file);
    }


}
