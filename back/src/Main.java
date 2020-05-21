import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) {
        try{
            String source = "in.txt";
            CharStream cs = fromFileName (source);
            grLexer lexer = new grLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            grParser parser = new grParser(token);
            ParseTree tree = parser.input();

            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);

            int[] ints = MyVisitor.input;
            String[] prog = MyVisitor.program;
            Execution execution = new Execution(ints, prog);

            int[] out = Execution.getOutput();

            FileWriter fw = new FileWriter("out.txt");

            for (int i = 0; i < out.length; i++) {
                fw.write(out[i] + " ");
            }
            fw.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
