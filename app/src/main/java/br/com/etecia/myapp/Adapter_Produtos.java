package br.com.etecia.myapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter_Produtos extends RecyclerView.Adapter<Adapter_Produtos.ViewHolder> {

    private Context context;
    private List<Produtos> lsprodutos;

    public Adapter_Produtos(Context context, List<Produtos> lsprodutos) {
        this.context = context;
        this.lsprodutos = lsprodutos;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
