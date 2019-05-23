package khoapham.ptp.phamtanphat.sqlite1903;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    SQLite sqLite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sqLite = new SQLite(this,"Quanlymonan.sql",null , 1);

//        String createTable = "CREATE TABLE IF NOT EXISTS Monan(Id INTEGER PRIMARY KEY AUTOINCREMENT , Tenmonan VARCHAR , Giamonan INTEGER , Diachi VARCHAR)";
//        sqLite.QueryData(createTable);
//        String insertData = "INSERT INTO Monan VALUES(null,'Cơm chiên' , 45000 , 'Quận 1')";
//        String insertData1 = "INSERT INTO Monan VALUES(null,'Hủ tiếu' , 15000 , 'Quận 2')";
//        String insertData2 = "INSERT INTO Monan VALUES(null,'Canh chua cá lóc' , 35000 , 'Quận 3')";
//        String insertData3 = "INSERT INTO Monan VALUES(null,'Mì xào hải sản' , 55000 , 'Quận 4')";
//        sqLite.QueryData(insertData);
//        sqLite.QueryData(insertData1);
//        sqLite.QueryData(insertData2);
//        sqLite.QueryData(insertData3);
        String data = "SELECT * FROM Monan";
        Cursor contro = sqLite.getData(data);
        while (contro.moveToNext()){
            int id = contro.getInt(0);
            String ten = contro.getString(1);
            int gia = contro.getInt(2);
            String diachi = contro.getString(3);
//
//            int vitri = contro.getColumnIndex("Diachi");
//            Log.d("BBB", vitri + "");

        }

    }
}
