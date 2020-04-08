public class Coronavirus{    
    
        public class Covid19{
            private int diesDeQuarentena;

        public Covid19(int diesDeQuarentena) {
            this.diesDeQuarentena = diesDeQuarentena;
        }

        public Covid19() {
        }
            
        }
	private float infeccio;
	private float mortalidat;
	Coronavirus(float x, float y){
		infeccio=x;
		mortalidat=y;
	}
	public Coronavirus() {
	}

	@Override
	public String toString() {
        	return "Coronavirus{" + "infeccio=" + infeccio + ", mortalidat=" + mortalidat + '}';
	}
	@Override
	public boolean equals(Object obj) {
        	if (this == obj) {
        	    	return true;
        	}
        	if (obj == null) {
           		return false;
        	}
        	if (getClass() != obj.getClass()) {
            		return false;
        	}
        	final Coronavirus other = (Coronavirus) obj;
        	if (Float.floatToIntBits(this.infeccio) != Float.floatToIntBits(other.infeccio)) {
            		return false;
        	}
        	if (Float.floatToIntBits(this.mortalidat) != Float.floatToIntBits(other.mortalidat)) {
	            	return false;
        	}
        return true;
<<<<<<< HEAD
    	}
        
        public static void main(String [] args){
        Coronavirus c = new Coronavirus();
        }
=======
    	} public void setInfeccio(float infeccio) {
        this.infeccio = infeccio;
    }

    public void setMortalidat(float mortalidat) {
        this.mortalidat = mortalidat;
    }

    public float getInfeccio() {
        return infeccio;
    }

    public float getMortalidat() {
        return mortalidat;
    }

>>>>>>> master
}
