package khoapham.ptp.phamtanphat.sqlite1903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    }
}
