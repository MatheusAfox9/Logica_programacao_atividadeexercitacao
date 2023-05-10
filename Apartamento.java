package Entidades;

public class Apartamento extends Propriedades {
	private int numeroAndar;
	private boolean temVaranda;
	
	
	public Apartamento(String endereco, int numerodequartos, Double preco) {
		super(endereco, numerodequartos, preco);
		this.numeroAndar = numeroAndar;
		this.temVaranda = temVaranda;
	
	}
	
	public int getNumeroAndar() {
        return numeroAndar;
    }
	
	public void setNumeroAndar(int numeroAndar) {
        this.numeroAndar = numeroAndar;
    }
	
	public boolean isTemVaranda() {
        return temVaranda;
    }
	
	public void setTemVaranda(boolean temVaranda) {
        this.temVaranda = temVaranda;
    }

	public class Casa extends Propriedades {
	    private int numeroBanheiros;
	    private double areaTerreno;
	    
	    public Casa(String endereco, int numeroQuartos, double preco, int numeroBanheiros, double areaTerreno) {
	        super(endereco, numeroQuartos, preco);
	        this.numeroBanheiros = numeroBanheiros;
	        this.areaTerreno = areaTerreno;
	    }
	    public int getNumeroBanheiros() {
	        return numeroBanheiros;
	    }

	    public void setNumeroBanheiros(int numeroBanheiros) {
	        this.numeroBanheiros = numeroBanheiros;
	    }

	    public double getAreaTerreno() {
	        return areaTerreno;
	    }
	    
	    public void setAreaTerreno(double areaTerreno) {
	        this.areaTerreno = areaTerreno;
	    }
	    
	    public class QuartoDeHotel extends Propriedades {
	        private boolean temArCondicionado;
	        private boolean temCafeDaManha;

	        public QuartoDeHotel(String endereco, int numeroQuartos, double preco, boolean temArCondicionado, boolean temCafeDaManha) {
	            super(endereco, numeroQuartos, preco);
	            this.temArCondicionado = temArCondicionado;
	            this.temCafeDaManha = temCafeDaManha;
	        }

	        public boolean isTemArCondicionado() {
	            return temArCondicionado;
	        }
	        
	        public void setTemArCondicionado(boolean temArCondicionado) {
	            this.temArCondicionado = temArCondicionado;
	        }

	        public boolean isTemCafeDaManha() {
	            return temCafeDaManha;
	        }

	        public void setTemCafeDaManha(boolean temCafeDaManha) {
	            this.temCafeDaManha = temCafeDaManha;
	        }

	    }
	}
}
