package triangle;

public class Triangle {
	public int a;
	public int b;
	public int c;
	public boolean valid;
	
	public Triangle(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
		if(a<=0||b<=0||c<=0){
			this.valid=false;
		}
		else{
			if((a+b>c)&&(a+c>b)&&(b+c>a)){
				this.valid=true;
			}
			else{
				this.valid=false;
			}
		}
	}
	
	public boolean isValid(){
		return valid;
	}
	
	public boolean isEquilateral(){
		if(valid==false){
			return false;
		}
		else{
			if(a==b&&b==c){
				return true;
			}
			else{
				return false;
			}
		}
	}
	
    public boolean isIsosceles(){
    	if(valid==false){
			return false;
		}
		else{
			if(a==b||b==c||c==a){
				return true;
			}
			else{
				return false;
			}
		}
	}
    
    public boolean isScalene(){
    	if(valid==false){
			return false;
		}
		else{
			if(a==b&&b==c){
				return false;
			}
			else{
				return true;
			}
		}
	}
}
