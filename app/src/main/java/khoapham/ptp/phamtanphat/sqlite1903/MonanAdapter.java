package khoapham.ptp.phamtanphat.sqlite1903;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

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
        return convertView;
    }
}
