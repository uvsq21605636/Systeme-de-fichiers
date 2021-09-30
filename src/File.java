public class File extends Element{
    //VARIABLE D'INSTANCE
    private int size;

    public File(String nom, int size){
        super(nom);
        this.size = size;
    }

    public int getSize(){
        return this.size;
    }

    public String getName(){
        return super.getName();
    }
}
