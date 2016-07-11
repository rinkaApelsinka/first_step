public class Calculator {
/**
calculation result
*/
private int result;

/**
Summ
@param params arguments
*/
public void add(int ... params) {
for (Integer param : params) {
	this.result += param;
	}
}

/**
@return calculation result
*/
public int getResult() {
return this.result;
}

/**
cleanup calculation result
*/
public void cleanResult() {
this.result = 0;
}
}