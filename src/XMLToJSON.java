import org.json.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XMLToJSON {
    public void XMLtoJSONConversion() throws Exception {
        File xmlFile = Paths.get("config", "config.xml").toFile();

        // Creating a byte array
        byte[] b = Files.readAllBytes(xmlFile.toPath());

        String xml = new String(b);

        JSONObject obj = XML.toJSONObject(xml);

        System.out.println(obj);

    }
}
