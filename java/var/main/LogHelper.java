package var.main;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.minecraftforge.fml.common.FMLLog;

public class LogHelper {

	private static Logger mapLogger = Logger.getLogger(MainRegistry.MODID);
	
	public static void init() {
		mapLogger.setParent((Logger) FMLLog.getLogger());
	}
	
	public static void log(Level logLevel, String message) {
		mapLogger.log(logLevel, message);
	}
	
	public static void logWarning(String message) {
		mapLogger.log(Level.WARNING, message);
	}
	
	public static void logInfo(String message) {
		mapLogger.log(Level.INFO, message);
	}
	
	public static void logSevere(String message) {
		mapLogger.log(Level.SEVERE, message);
	}

}
