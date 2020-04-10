public class Coronavirus {

    public class Covid19 {

        private int diesDeQuarentena;

        public Covid19(int diesDeQuarentena) {
            this.diesDeQuarentena = diesDeQuarentena;
        }

        public Covid19() {
        }

    }
    private float infeccio;
    private float mortalidat;

    Coronavirus(float x, float y) {
        infeccio = x;
        mortalidat = y;
    }

    public Coronavirus() {
    }

    @Override
    public String toString() {
        return "Coronavirus{" + "infeccio=" + infeccio + ", mortalidat=" + mortalidat + '}';
    }

//      Se pot genera codi en el netbeans o eclipse, en el cas de netbeans es:
//      click dret -> insert code y pots genera codi basics com el equals, setter y getters, toStrings ... 
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Coronavirus other = (Coronavirus) obj;
//        if (Float.floatToIntBits(this.infeccio) != Float.floatToIntBits(other.infeccio)) {
//            return false;
//        }
//        if (Float.floatToIntBits(this.mortalidat) != Float.floatToIntBits(other.mortalidat)) {
//            return false;
//        }
//        return true;
//    }
    
    public boolean equals(Coronavirus virus){
        if (this == virus) return true;
        if (this == null)return false;
        if(getClass() != virus.getClass()) return false;
        if (Float.floatToIntBits(this.infeccio) != Float.floatToIntBits(virus.infeccio))return false;   
        if (Float.floatToIntBits(this.mortalidat) != Float.floatToIntBits(virus.mortalidat))return false;
        return true;       
    }

    public static void main(String[] args) {
        Coronavirus c1 = new Coronavirus(100.0f,2.3f);
        Coronavirus c2 = new Coronavirus();
        Coronavirus c3 = new Coronavirus(100.1f,2.3f);
        c2.setInfeccio(c1.getInfeccio());
        c2.setMortalidat(c1.getMortalidat());
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
    }

    public void setInfeccio(float infeccio) {
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
}
