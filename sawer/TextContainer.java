package sawer;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

@SaveTo(directory = "C:\\Users\\anton\\Desktop\\test.txt")
public class TextContainer {
	String someText;

	public TextContainer(String someText) {
		this.someText = someText;

	}

	@Saver
	public void save(File file) {
		try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
			pw.print(someText + " ");
			System.out.println("Done!");
		} catch (Exception e) {
			System.out.println("Fail!");
		}
	}
}
