package sawer;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Technical {

	public void resultator(TextContainer... containers)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (TextContainer tc : containers) {
			Class<?> tec = tc.getClass();
			Method[] methods = tec.getDeclaredMethods();
			for (Method method : methods) {
				if (method.isAnnotationPresent(Saver.class)) {
					method.invoke(tc, new File(tec.getDeclaredAnnotation(SaveTo.class).directory()));
					continue;
				}
			}
		}
	}

}
