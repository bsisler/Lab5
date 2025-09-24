public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        //Create a place holder string
        String temp = "";
        //Set the first char equal to the last char
        temp = temp + rotorValues.charAt(26);
        //Iterate through the string and adds the chars into temp
        for (int i = 0; i < 25; i++) {
            temp = temp + rotorValues.charAt(i);
        }
        rotorValues = temp;
        return true;       
    }
    

    public int indexOf(char c){
        //Return the index of a character in the rotorValues
        return rotorValues.indexOf(c);
    }

    public char charAt(int idx){
        //Return the character at an index in the rotorValues
        return rotorValues.charAt(idx);
    }
}
    
