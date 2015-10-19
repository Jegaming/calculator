package com.example.calculator;

import android.view.View;
import android.widget.Button;


public class myClickListener implements View.OnClickListener {

	@Override
	public void onClick(View V) {
		boolean isResult = false;
		
		if((V.getId()==R.id.signButton1 || V.getId()==R.id.signButton2 || V.getId()==R.id.signButton3 || V.getId()==R.id.signButton4) && Globe.myResult==""){
			return;
		}
		// TODO Auto-generated method stub
		switch (V.getId()) {
		case R.id.signButton1:
			if(isSign()){
				backspace();
			}
			Globe.myResult = Globe.myResult + "+";
			break;
		case R.id.signButton2:
			if(isSign()){
				backspace();
			}
			Globe.myResult = Globe.myResult + "-";
			break;
		case R.id.signButton3:
			if(isSign()){
				backspace();
			}
			Globe.myResult = Globe.myResult + "*";
			break;
		case R.id.signButton4:
			if(isSign()){
				backspace();
			}
			Globe.myResult = Globe.myResult + "/";
			break;
		case R.id.signButton5:
			if(Globe.myResult.substring(Globe.myResult.length()-1, Globe.myResult.length()) == "."){
				backspace();
			}
			Globe.myResult = Globe.myResult + ".";
			break;
		case R.id.signButton6:
			result();
			isResult = true;
			break;
		case R.id.signButton7:
			Globe.myResult = "";
			break;
		case R.id.signButton8:
			backspace();
			break;
		case R.id.numButton1:
			Globe.myResult = Globe.myResult + "1";
			break;
		case R.id.numButton2:
			Globe.myResult = Globe.myResult + "2";
			break;
		case R.id.numButton3:
			Globe.myResult = Globe.myResult + "3";
			break;
		case R.id.numButton4:
			Globe.myResult = Globe.myResult + "4";
			break;
		case R.id.numButton5:
			Globe.myResult = Globe.myResult + "5";
			break;
		case R.id.numButton6:
			Globe.myResult = Globe.myResult + "6";
			break;
		case R.id.numButton7:
			Globe.myResult = Globe.myResult + "7";
			break;
		case R.id.numButton8:
			Globe.myResult = Globe.myResult + "8";
			break;
		case R.id.numButton9:
			Globe.myResult = Globe.myResult + "9";
			break;
		case R.id.numButton10:
			Globe.myResult = Globe.myResult + "0";
			break;

		default:
			break;
		}
		if(isResult == false){
			Globe.tvResult.setText(Globe.myResult); 
		}else isResult = false;
	}
	
	private String str;
	
	public static void backspace(){
		if(Globe.myResult!= ""){
			Globe.myResult = Globe.myResult.substring(0,Globe.myResult.length()-1);
		} 
	} 
	public boolean isSign(){
		String temp = Globe.myResult.substring(Globe.myResult.length()-1, Globe.myResult.length());
		if(temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/") || temp.equals(".")){
			return true;
		}else{
			return false;
		}
	}
	public static void result(){
		String r;
    	r =expressionEvaluation.mainCal(Globe.myResult);
    	Globe.myResult = r;
    	Globe.tvResult.setText(Globe.myResult);
		Globe.myResult = "";
	}
	
	
}
