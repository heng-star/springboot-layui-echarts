package clickhouse;

import com.sun.jmx.snmp.SnmpUnsignedInt;
import org.junit.Test;
import sun.util.calendar.BaseCalendar;

import java.sql.*;
import java.util.Random;
import java.util.UUID;

public class ClickhouseDemo {

    Class<?> aClass;// 驱动包
    {
        try {
            aClass = Class.forName("ru.yandex.clickhouse.ClickHouseDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    String url = "jdbc:clickhouse://139.196.221.225:8123/system";// url路径
    String user = "default";// 账号
    String password = "admin";// 密码
    Connection connection;

    {
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    //
    @Test
    public void testcon() throws Exception {


        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("show databases");
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.println(metaData.getColumnName(i) + ":" + resultSet.getString(i));
            }
        }

    }

    //批量插入
    @Test
    public void batchinsert() throws Exception {
        PreparedStatement pstmt = connection.prepareStatement("insert into test01.data_set values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
        UUID number = UUID.randomUUID();
//

        pstmt.setLong(1,System.nanoTime());
        pstmt.setLong(2,542155L);
        pstmt.setString(3,"weixinapp_Set");
        pstmt.setString(4,"weixin de set for the app");
        pstmt.setString(5,"data source clickhouse");
        pstmt.setString(6,"clickhouse test 01");
        pstmt.setString(7,"apptable");
        pstmt.setString(8,"test");
        pstmt.setString(9,"admin");
        pstmt.setString(10,"admin");
//        BaseCalendar.Date
        Date date = new Date(System.currentTimeMillis());

        pstmt.setDate(11, date);
        pstmt.setDate(12,date);
        pstmt.setInt(13,1);

// insert 10 records
        for (int i = 0; i < 1; i++) {
//            pstmt.setDate(1, new Date(System.currentTimeMillis()));
//            pstmt.setString(2, "panda_" + (i + 1));
//            pstmt.setInt(3, 18+i);
            pstmt.addBatch();
        }
        pstmt.executeBatch();
    }

    @Test
    public void testint(){
        Long lt=UUID.randomUUID().timestamp();
        Random random = new Random() ;
        random.setSeed(System.currentTimeMillis());
        random.nextInt();
        System.out.println(lt);

    }


}
