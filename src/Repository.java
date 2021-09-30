import java.util.ArrayList;

public class Repository extends Element {
    //VARIABLES D'INSTANCES
    private int size;
    private ArrayList<Element> contents;

    public Repository(String name){
        super(name);
        this.size = 0;
        this.contents = new ArrayList <Element>();
    }

    @Override
    public String getName(){
        return super.getName();
    }

    @Override
    public int getSize(){
        return this.size;
    }

    public ArrayList<Element> getContents(){
        return this.contents;
    }

    public void ajoute(Element d){
        this.size += d.getSize();
        this.contents.add(d);
    }
}
