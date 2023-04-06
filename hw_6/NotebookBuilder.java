package hw_6;

public class NotebookBuilder {
    private static NotebookBuilder instance = null;
    Notebook obj;

    public static NotebookBuilder getInstance() {
        if (instance == null){
            instance = new NotebookBuilder();
        }
        instance.obj = new Notebook();
        return instance;
    }
    public NotebookBuilder setBrand(String brand){
        obj.setBrand(brand);
        return this;
    }
    public NotebookBuilder setModel(String model){
        obj.setModel(model);
        return this;
    }
    public NotebookBuilder setCores(int cores){
        obj.setCores(cores);
        return this;
    }
    public NotebookBuilder setOs(String os){
        obj.setOs(os);
        return this;
    }
    public NotebookBuilder setRam(int ram){
        obj.setRam(ram);
        return this;
    }
    public NotebookBuilder setHdd(int hdd){
        obj.setRam(hdd);
        return this;
    }
    public NotebookBuilder setPrice(int price){
        obj.setPrice(price);
        return this;
    }
    public Notebook build() {
        return obj;
    }
}
