package khoapham.ptp.phamtanphat.sqlite1903;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThemmonanActivity extends AppCompatActivity {

    EditText edtTen,edtGia,edtDiachi;
    Button btnHuy,btnXacnhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themmonan);

        edtDiachi = findViewById(R.id.edittextDiachi);
        edtGia = findViewById(R.id.edittextGiamonan);
        edtTen = findViewById(R.id.edittextTenmonan);
        btnHuy = findViewById(R.id.buttonHuy);
        btnXacnhan = findViewById(R.id.buttonXacnhan);

        btnHuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ten = edtTen.getText().toString().trim();
                String gia = edtGia.getText().toString().trim();
                String diachi = edtDiachi.getText().toString().trim();
                if (ten.length() > 0 && gia.length() > 0 && diachi.length() >0){
                    String insertdata = "INSERT INTO Monan VALUES(null,'"+ten+"' , "+ Integer.parseInt(gia)+" , '"+diachi+"')";
                    MainActivity.sqLite.QueryData(insertdata);
                    finish();
                }
            }
        });
    }
}
