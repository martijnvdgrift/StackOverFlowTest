import com.amazonaws.services.lambda.runtime.Context;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StackOverflowTest {

    //reads inputstream and returns the stream in uppercase

    public void greeting(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
        int letter;
        while ((letter = inputStream.read()) != -1) {
            outputStream.write(Character.toUpperCase(letter));
        }
    }
}
