package wuxian.me.datetimesparksql;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParseTreeUtilTest {

    @Test
    public void testParsing() throws Exception {

        ///ParseTreeUtil.parseAndPrint("select * from abc");

        ParseTreeUtil.parseAndPrint("insert into hive.table1 select col1,to_date(col3) as col2 from pg.table2");
    }


}