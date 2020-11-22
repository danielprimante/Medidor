package salud.diabetes.medidor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<ListElement> mdata;
    private LayoutInflater minflater;
    private Context context;

    public ListAdapter(List<ListElement> itemList,Context context){

        this.minflater=LayoutInflater.from(context);
        this.context= context;
        this.mdata= itemList;
    }

    @Override
    public int getItemCount() {return mdata.size();}

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = minflater.inflate(R.layout.card_view, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder,final int position){
        holder.bindData(mdata.get(position));
    }
    public void setItems(List<ListElement> items) {mdata=items;}

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView fecha,cetonas, glucosa,cuando, observaciones, unidades;

        ViewHolder(View itemView){
            super(itemView);

            fecha=itemView.findViewById(R.id.cv_fecha);
            cetonas=itemView.findViewById(R.id.cv_cetonas);
            glucosa=itemView.findViewById(R.id.cv_glucosa);
            cuando=itemView.findViewById(R.id.cv_cuando);
            observaciones=itemView.findViewById(R.id.cv_observaciones);
            unidades=itemView.findViewById(R.id.cv_unidades);
        }

        void bindData(final ListElement item){

            fecha.setText(item.getFecha());
            cetonas.setText(item.getCetonas());
            glucosa.setText(item.getGlucosa());
            cuando.setText(item.getCuando());
            observaciones.setText(item.getObservaciones());
            unidades.setText(item.getUnidades());
        }
    }

}
