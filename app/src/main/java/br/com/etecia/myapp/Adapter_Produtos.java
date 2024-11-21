package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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

        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_produtos,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView ImageMod;

        TextView NomeMod;

        TextView Class;

        TextView Descricao;

        TextView Preco;

        TextView Frete;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ImageMod = itemView.findViewById(R.id.ImageMod);
            NomeMod = itemView.findViewById(R.id.NomeMod);
            Class = itemView.findViewById(R.id.Class);
            Descricao = itemView.findViewById(R.id.Descricao);
            Preco = itemView.findViewById(R.id.Preço);
            Frete = itemView.findViewById(R.id.Frete);

        }
    }

}
