package khoapham.ptp.phamtanphat.sqlite1903;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class MonanAdapter extends ArrayAdapter<Monan> {
    public MonanAdapter( @NonNull Context context, int resource, @NonNull List<Monan> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView,  @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        convertView = inflater.inflate(R.layout.dong_item_monan,null);

        TextView txtTen = convertView.findViewById(R.id.textviewTen);
        TextView txtGia = convertView.findViewById(R.id.textviewGia);
        TextView txtDiachi = convertView.findViewById(R.id.textviewDiachi);

        Monan monan = getItem(position);

        txtTen.setText(monan.getTenmonan());
        txtGia.setText(monan.getGiamonan() + " đồng");
        txtGia.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.icon_money,0);
        txtDiachi.setText(monan.getDiachi());
        return convertView;
    }
}
