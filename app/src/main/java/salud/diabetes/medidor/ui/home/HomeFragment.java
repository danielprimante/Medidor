package salud.diabetes.medidor.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


import salud.diabetes.medidor.R;

public class HomeFragment extends Fragment {

   public Spinner spinner;
   public EditText txtGlucosa, txtUnidades, txtObsevaciones;



    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        spinner = rootView.findViewById(R.id.spinner);
        txtGlucosa= rootView.findViewById(R.id.text_glucosa);
        txtUnidades = rootView.findViewById(R.id.text_unidades);
        txtObsevaciones = rootView.findViewById(R.id.text_observaciones);

    String [] opciones ={
            "Antes del Desayuno",
            "Despues del Desayuno",
            "Antes del  Almuerzo",
            "Despues del Almuerzo",
            "Antes de la Merienda",
            "Despues de la Merienda",
            "Antes de la Cena",
            "Despues de la Cena",
            "Antes de Dormir",
            "Durante la noche",
            "En Ayuno"};

    ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item,opciones);
        spinner.setAdapter(adapter);

        final Button button = rootView.findViewById(R.id.buttonSave);
        button.setOnClickListener(view -> {
            Intent replyIntent = new Intent();
            if (TextUtils.isEmpty(mEditWordView.getText())) {
                setResult(RESULT_CANCELED, replyIntent);
            } else {
                String word = mEditWordView.getText().toString();
                replyIntent.putExtra(EXTRA_REPLY, word);
                setResult(RESULT_OK, replyIntent);
            }
        });


        return rootView;


    }
    }
