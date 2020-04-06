package sawer;

import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) {
		TextContainer tc1 = new TextContainer("Hello,");
		TextContainer tc2 = new TextContainer("Java");
		TextContainer tc3 = new TextContainer("Junior!");
		Technical tech = new Technical();
		try {
			tech.resultator(tc1, tc2, tc3);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
