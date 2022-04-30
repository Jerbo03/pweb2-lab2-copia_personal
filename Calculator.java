class Calculator {
    int add(int a, int b){//Daniel Tapia
        return a + b;
    }
    int sub(int a, int b){ //Mario Chura 
        return a - b; 
    }
    int mul(int a, int b){ return 0; }
	int div(int a, int b){
		try {
			return a / b; 
		}catch(Exception exception){
			System.out.println("No puede dividir entre cero\nError "+ exception.getMessage());
		}finally{
			return 0;
			//paso prueba
		}
	}
	int mod(int a, int b){ // André Paredes
        return a % b; 
    }
}
