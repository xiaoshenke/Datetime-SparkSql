package wuxian.me.hiveudf;

import org.junit.Test;
import wuxian.me.hiveudf.util.ParseTreeUtil;

public class ParseTreeUtilTest {

    @Test
    public void testParsing() throws Exception {

        ///ParseTreeUtil.parseAndPrint("select * from abc");
        ParseTreeUtil.parseAndPrint("insert into test.user select * from wuxian.test_table_user where id=1");

    }


}