package br.com.etecia.myapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Produtos_Activity extends AppCompatActivity {

    RecyclerView recycleprodutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_produtos);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private List<Produtos> lsprodutos;

    public View onCreate(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){

        View view = inflater.inflate(R.layout.activity_produtos, container, false);

        recycleprodutos = view.findViewById(R.id.recycleprodutos);

        lsprodutos = new ArrayList<>();
        lsprodutos.add(new Produtos("AAA",R.drawable.porcat,"AAA","AAA","AAA","AAA"));

        Adapter adapter = new Produtos(getApplicationContext(),lsprodutos);

        recycleprodutos.setLayoutManager(new GridLayoutManager(getApplicationContext(),1));

        recycleprodutos.setAdapter(adapter);


}