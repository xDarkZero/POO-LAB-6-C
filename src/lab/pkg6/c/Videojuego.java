package lab.pkg6.c;

public class Videojuego {

    String Titulo;
    int Horasestimadas;
    boolean Entregado;
    String Genero;
    String Compañia;

    public Videojuego() {
        this.Titulo = Titulo;
        this.Horasestimadas = 10;
        this.Entregado = false;
        this.Genero = Genero;
        this.Compañia = Compañia;

    }

    public Videojuego(String Titulo, int Horasestimadas) {
        this.Titulo = Titulo;
        this.Horasestimadas = Horasestimadas;
        this.Genero = Genero;
        this.Entregado = Entregado;
        this.Compañia = Compañia;
    }

    public Videojuego(String Titulo, String Compañia, int Horasestimadas) {
        this.Titulo = Titulo;
        this.Horasestimadas = Horasestimadas;
        this.Genero = Genero;
        this.Compañia = Compañia;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getHorasestimadas() {
        return Horasestimadas;
    }

    public void setHorasestimadas(int Horasestimadas) {
        this.Horasestimadas = Horasestimadas;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCompañia() {
        return Compañia;
    }

    public void setCompañia(String Compañia) {
        this.Compañia = Compañia;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "Titulo=" + Titulo
                + ", Horasestimadas=" + Horasestimadas 
                + ", Entregado=" + Entregado
                + ", Genero=" + Genero + ", Compañia=" + Compañia + '}';
    }

}
