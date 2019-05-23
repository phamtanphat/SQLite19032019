package khoapham.ptp.phamtanphat.sqlite1903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    SQLite sqLite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sqLite = new SQLite(this,"Quanlymonan.sql",null , 1);

//        String createTable = "CREATE TABLE IF NOT EXISTS Monan(Id INTEGER PRIMARY KEY AUTOINCREMENT , Tenmonan VARCHAR , Giamonan INTEGER , Diachi VARCHAR)";
//        sqLite.QueryData(createTable);
        String insertData = "INSERT INTO Monan VALUES(null,'Cơm chiên' , 45000 , 'Quận 1')";
    }
}
