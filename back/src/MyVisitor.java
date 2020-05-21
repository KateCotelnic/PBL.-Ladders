public class MyVisitor extends grBaseVisitor<Object>{

    public static int[] input = new int[8];
    int i = 0;
    public static String[] program = new String[20];
    int j = 0;

    @Override public Object visitInput(grParser.InputContext ctx) {
        if(ctx.children.get(0).getText().equals(" 0")){
                input[i] = 0;
        i++;
        }
        else if (ctx.getChild(0).getText().equals(" 1")){
            input[i] = 1;
            i++;
//            System.out.println("1");
        }
//        else {}
        return visitChildren(ctx);
    }

    @Override public Object visitSource_code(grParser.Source_codeContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitProgram(grParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitContact(grParser.ContactContext ctx) {
//        System.out.println(ctx.getChild(1));
        if (ctx.getChild(0).getChild(2).getChild(0).getText().equals("M")){
            program[j] = "cont" + ctx.getChild(0).getChild(2).getChild(0).getText();
            program[j] += ctx.getChild(1);
            if(ctx.getChild(0).getChild(0).getText().equals("closed "))
                program[j]+="not";
            else
                program[j] +="yes";
        }
        else {
            program[j] = ctx.getChild(0).getChild(2).getChild(0).getText();
            program[j] += ctx.getChild(1);
            if(ctx.getChild(0).getChild(0).getText().equals("closed ")) {
                char c = ctx.getChild(1).getText().charAt(0);
                int digit = c-48;
                if(input[digit]==0)
                    input[digit] = 1;
                else
                    input[digit] = 0;
            }
        }
        j++;
        return visitChildren(ctx);
    }

    @Override public Object visitCoil(grParser.CoilContext ctx) {
//        System.out.println("true");
//        System.out.println(ctx.getChild(0).getChild(2).getChild(0));
        if (ctx.getChild(0).getChild(2).getChild(0).getText().equals("M")){
            program[j] = "coil";
            program[j] += ctx.getChild(0).getChild(2).getChild(0).getText() + ctx.getChild(1).getText();
        }
        else
            program[j] =ctx.getChild(0).getChild(2).getChild(0).getText() + ctx.getChild(1).getText();
        if(ctx.getChild(0).getChild(0).getText().equals("inactive ")) {
            program[j] += "not";
        }
        else{
            program[j] +="yes";
        }
        j++;
        return visitChildren(ctx);
    }

    @Override public Object visitOperators(grParser.OperatorsContext ctx) {
//        if(ctx.getChild(0).getChild(0).getText())
        if (ctx.getChild(0).getText().equals(" & ")){
            program[j] = "&";
            j++;
        }
        if (ctx.getChild(0).getText().equals("V")){
            program[j] = "V";
            j++;
        }
        return visitChildren(ctx);
    }

}
