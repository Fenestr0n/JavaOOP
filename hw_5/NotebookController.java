package hw_5;

public class NotebookController {
    private Notebook model;
    private NotebookView view;

    public NotebookController (Notebook model, NotebookView view){
        this.model = model;
        this.view = view;
    }

    public String getNotebookBrand() {
        return model.getBrand();
    }

    public void setNotebookBrand(String brand) {
        model.setBrand(brand);
    }

    public String getNotebookModel() {
        return model.getModel();
    }

    public void setNotebookModel(String model) {
        this.model.setModel(model);
    }

    public Integer getNotebookCores() {
        return model.getCores();
    }

    public void setNotebookCores(Integer cores) {
        model.setCores(cores);
    }

    public String getNotebookOs() {
        return model.getOs();
    }

    public void setNotebookOs(String os) {
        model.setOs(os);
    }

    public Integer getNotebookRam() {
        return model.getRam();
    }

    public void setNotebookRam(Integer ram) {
        model.setRam(ram);
    }

    public Integer getNotebookHdd() {
        return model.getHdd();
    }

    public void setNotebookHdd(Integer hdd) {
        model.setHdd(hdd);
    }

    public Integer getNotebookPrice() {
        return model.getPrice();
    }

    public void setNotebookPrice(Integer price) {
        model.setPrice(price);
    }

    public void updateView(){
        view.getInfo(getNotebookBrand(), getNotebookModel(), getNotebookCores(), getNotebookOs(), getNotebookRam(), getNotebookHdd(), getNotebookPrice());
    }
}

