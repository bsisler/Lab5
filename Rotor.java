public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        //TODO
        String temp = rotorValues;
        rotorValues.charAt(26) = rotorValues.charAt(0);
        
        
               
    }
    

    public int indexOf(char c){
        //TODO
        return rotorValues.indexOf(c);
    }

    public char charAt(int idx){
        //TODO
        return rotorValues.charAt(idx);
    }
}
    
