import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import org.json.JSONObject;

public class JsonFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        JSONObject json = new JSONObject();
        
        json.put("level", record.getLevel());
        json.put("loggerName", record.getLoggerName());
        json.put("message", record.getMessage());
        json.put("timestamp", record.getMillis());
        
        // Any other fields from the record you want to include
        
        return json.toString() + "\n";  // Append newline so logs aren't all on one line
    }
}
