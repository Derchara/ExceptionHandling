package exceptionHandling;
import java.net.URI;

/**
 * Generic ExceptionHandler
 * @author lj
 *
 */
public class ExceptionHandler {
	public static void HandleException(Exception e) {
		try {
			java.awt.Desktop.getDesktop().browse(new URI("http://stackoverflow.com/search?q=" + e.getClass().getName()));
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
