package SCL;



	
	
	//Identifier will hold identifiers created by the Parser
	
	import SCL.TokenType;


	public class Identifier {
	    private String name;
	    private String value;
	    private TokenType tokType;

	    Identifier(String name, String value, TokenType tokType) {
	        this.name = name;
	        this.value = value;
	        this.tokType = tokType;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getValue() {
	        return value;
	    }

	    public TokenType getTokType() {
	        return tokType;
	    }
	
	
	
	
	
	
	
	
	
	
	
}
