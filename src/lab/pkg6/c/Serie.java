package lab.pkg6.c;

public class Serie {

    String Titulo;
    int Numerodetemporadas;
    String Genero;
    boolean Entregado;
    String Creador;

    public Serie() {
        this.Titulo = Titulo;
        this.Numerodetemporadas = 3;
        this.Genero = Genero;
        this.Entregado = false;
        this.Creador = Creador;

    }

    public Serie(String Titulo, String Creador) {
        this.Creador = Creador;
        this.Titulo = Titulo;
        this.Entregado = Entregado;
        this.Numerodetemporadas = Numerodetemporadas;
        this.Genero = Genero;

    }

    public Serie(String Titulo, int Numerodetemporada, String Genero,
            String Creador) {
        this.Creador = Creador;
        this.Genero = Genero;
        this.Numerodetemporadas = Numerodetemporadas;
        this.Titulo = Titulo;

    }

    @Override
    public String toString() {
        return "Serie{" + "Titulo=" + Titulo
                + ", Numerodetemporadas=" + Numerodetemporadas
                + ", Genero=" + Genero + ", Entregado=" + Entregado
                + ", Creador=" + Creador + '}';
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getNumerodetemporadas() {
        return Numerodetemporadas;
    }

    public void setNumerodetemporadas(int Numerodetemporadas) {
        this.Numerodetemporadas = Numerodetemporadas;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCreador() {
        return Creador;
    }

    public void setCreador(String Creador) {
        this.Creador = Creador;
    }
}
