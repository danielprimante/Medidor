package salud.diabetes.medidor.ui.history;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import salud.diabetes.medidor.ListAdapter;
import salud.diabetes.medidor.ListElement;
import salud.diabetes.medidor.R;

public class HistoryFragment extends Fragment {

   List<ListElement> elements;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_history, container, false);

        elements = new ArrayList<> ();
        elements.add(new ListElement("21/10","0","400","antes","alal","6"));
        elements.add(new ListElement("21/10","0","80","antes","alal","6"));
        elements.add(new ListElement("21/10","0","80","antes","alal","6"));
        elements.add(new ListElement("21/10","0","80","despues del almuerzo","alal","6"));
        elements.add(new ListElement("21/10","0","80","antes","alal","6"));
        elements.add(new ListElement("21/10","0","80","antes","alal","6"));

        ListAdapter listAdapter= new ListAdapter(elements,getActivity());
        RecyclerView recyclerView =rootView.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(listAdapter);

        return rootView;
    }
}