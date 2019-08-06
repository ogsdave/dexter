import dexter.CLIParser;
import dexter.Compiler;
import dexter.FilePaths;
import dexter.Preferences;

import java.io.IOException;

/**
 * Created by Maaz Ahmad on 6/25/19.
 */
public class Main {
    public static void main (String[] args) {
        CLIParser parser = new CLIParser();

        try {
            parser.parseArguments(args);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Preferences.init(parser);
        FilePaths.init(parser);

        Compiler.run();
    }
}