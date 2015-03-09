/**
 * Created by alekseymazurik on 3/9/15.
 */
package mazurik;

public class CPUProcess {

    private int id;
    private int complexity;

    private static int nextId = 0;

    CPUProcess(int complexity){
        this.complexity = complexity;
        this.id = nextId++;
    }

    public int getComplexity(){
        return complexity;
    }

    public int getId(){
        return id;
    }
}
