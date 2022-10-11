package comunicacion;

public class Tesis extends Escrito{
	private String idea;
	private static String argumentos[];
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	public String getIdea() {
		return idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}
	
	public String[] getArgumentos() {
		return argumentos;
	}
	public void setArgumentos(String[] argumentos) {
		Tesis.argumentos = argumentos;
	}
	public String getConclusion() {
		return conclusion;
	}
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	public String getReferencias() {
		return referencias;
	}
	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	public Tesis(String origen, String titulo, String autor, int paginas, String idea, 
			String arg[], String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		Tesis.argumentos = arg;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	public String toString() {
        return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + 
        this.getPaginas() + "\n" + this.getIdea() + "\n" + this.getArgumentos().length + "\n" + 
        this.getConclusion() + "\n" + this.getReferencias();    
    }
    public String interpretacion() {
        return this.interpretacion;
    }
    public int palabrasTotales(int porPagina) {
        return porPagina * this.getPaginas()*5;
    }
}
