package br.com.etecia.myapp;

public class Produtos {

    private String nome;
    private int image;
    private String clas;
    private String desc;
    private String val;
    private String frete;

    public Produtos(String nome, int image, String clas, String desc, String val, String frete) {
        this.nome = nome;
        this.image = image;
        this.clas = clas;
        this.desc = desc;
        this.val = val;
        this.frete = frete;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getFrete() {
        return frete;
    }

    public void setFrete(String frete) {
        this.frete = frete;
    }
}
