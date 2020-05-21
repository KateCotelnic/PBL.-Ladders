public class Execution {
    private int[] input;
    private int[] memory = new int[8];
    private static int[] output;
    private String[] program;

    public Execution(int[] input, String[] program) {
        this.input = input;
        this.program = program;
        this.output = generateOutput();
        System.out.println();
        printInput();
        printMemory();
        printOutput();
    }

    public static int[] getOutput() {
        return output;
    }

    private void printOutput() {
        System.out.print("Output: ");
        for (int i=0;i<8;i++)
            System.out.print(this.output[i] + " ");
    }

    private void printInput(){
        System.out.print("Input: ");
        for (int i = 0;i<this.input.length;i++)
            System.out.print(this.input[i] + " ");
        System.out.println();
    }

    private void printMemory(){
        System.out.print("Memory: ");
        for (int i = 0;i<this.memory.length;i++)
            System.out.print(this.memory[i] + " ");
        System.out.println();
    }

    private void printProgram(){
        System.out.print("Program: ");
        int i = 0;
        while(this.program[i] != null){
            System.out.print(this.program[i]+ " ");
        i++;}
        System.out.println();
    }

    private void delete(int position){
        int i;
        for(i=position+1;i<this.program.length;i++){
            this.program[i-1] = this.program[i];
        }
        this.program[i-1] = null;
    }

    private int and(int a,int b){
        int s=0;
        if(a==1 && b==1)
            s=1;
        return s;
    }

    private int or(int a,int b){
        int s=1;
        if (a==0 && b==0)
            s=0;
        return s;
    }

    private int[] generateOutput(){
        int[] output = {0,0,0,0,0,0,0,0};
        int k=0;
        printProgram();
        while (program[0]!=null) {

            ////////////// contact I /////////////////
            for (k = 0; k < program.length; k++) {
                if (program[k] != null && program[k].charAt(0) == 'I') {
                    int index = program[k].charAt(1) - 48;
                    program[k] = "" + input[index];
                    printProgram();
                }
            }
            /////////////// value & value /////////////////
            for (k = 1; k < program.length; k++) {
                if (program[k] != null && program[k].charAt(0) == '&' && program[k - 1].length() == 1 && program[k + 1].length() == 1) {
                    int value1 = program[k - 1].charAt(0) - 48;
                    int value2 = program[k + 1].charAt(0) - 48;
                    int value = and(value1,value2);
                    program[k-1] = "" + value;
                    delete(k);
                    delete(k);
                    printProgram();
                }
            }
            //////////// value & contact M ///////////
            for (k = 1; k < program.length; k++) {
                if (program[k] != null && program[k].charAt(0) == '&' && program[k - 1].length() == 1
                        && program[k + 1].length() == 9 && program[k + 1].substring(0, 5).equals("contM")) {
                    int index = program[k + 1].charAt(5) - 48;
                    int value = program[k - 1].charAt(0) - 48;
                    if (program[k + 1].substring(6).equals("not")) {
                        if (value == 0)
                            value = 1;
                        else if (value == 1)
                            value = 0;
                    }
                    memory[index] = value;
                    delete(k - 1);
                    delete(k - 1);
                    delete(k - 1);
                    printProgram();
                }
            }
            ///////////// coil M ////////////
            for (k = 0; k < program.length; k++) {
                if (program[k] != null && program[k].length() == 9 && program[k].substring(0, 5).equals("coilM")) {
                    int index = program[k].charAt(5) - 48;
                    int value = memory[index];
                    if (program[k].substring(6).equals("not")) {
                        if (value == 0)
                            value = 1;
                        else if (value == 1)
                            value = 0;
                    }
                    program[k] = "" + value;
                    printProgram();
                }
            }
            /////////////// value & value /////////////////
            for (k = 1; k < program.length; k++) {
                if (program[k] != null && program[k].charAt(0) == '&' && program[k - 1].length() == 1 && program[k + 1].length() == 1) {
                    int value1 = program[k - 1].charAt(0) - 48;
                    int value2 = program[k + 1].charAt(0) - 48;
                    int value = and(value1,value2);
                    program[k-1] = "" + value;
                    delete(k);
                    delete(k);
                    printProgram();
                }
            }
            ///////// V at the beginning //////////
            if (program[0].equals("V")){
                delete(0);
                printProgram();
            }
            /////////////// value & value /////////////////
            for (k = 1; k < program.length; k++) {
                if (program[k] != null && program[k].charAt(0) == '&' && program[k - 1].length() == 1 && program[k + 1].length() == 1) {
                    int value1 = program[k - 1].charAt(0) - 48;
                    int value2 = program[k + 1].charAt(0) - 48;
                    int value = and(value1,value2);
                    program[k-1] = "" + value;
                    delete(k);
                    delete(k);
                    printProgram();
                }
            }
            /////////////// V V/////////////////
            for (k = 0; k < program.length; k++) {
                if (program[k] != null && program[k].charAt(0) == 'V' && program[k+1].charAt(0) == 'V') {
                    delete(k);
                    printProgram();
                }
            }
            /////////////// value V value /////////////////
            for (k = 1; k < program.length; k++) {
                if (program[k] != null && program[k].charAt(0) == 'V' && program[k - 1].length() == 1 && program[k + 1].length() == 1) {
                    int value1 = program[k - 1].charAt(0) - 48;
                    int value2 = program[k + 1].charAt(0) - 48;
                    int value = or(value1,value2);
                    program[k-1] = "" + value;
                    delete(k);
                    delete(k);
                    printProgram();
                }
            }
            /////////////// value & output Q /////////////////
            for (k = 1; k < program.length; k++) {
                if (program[k] != null && program[k].charAt(0) == '&' && program[k - 1].length() == 1
                        && program[k + 1].charAt(0) == 'Q') {
                    int index = program[k + 1].charAt(1) - 48;
                    int value = program[k - 1].charAt(0) - 48;
                    if (program[k + 1].substring(2).equals("not")) {
                        if (value == 0)
                            value = 1;
                        else if (value == 1)
                            value = 0;
                    }
                    output[index] = value;
                    delete(k - 1);
                    delete(k - 1);
                    delete(k - 1);
                    printProgram();
                }
            }
        }
        return output;
    }
}
